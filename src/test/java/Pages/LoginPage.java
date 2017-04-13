package Pages;

import Controlers.Button;
import Controlers.TextBox;
import Models.UserLoginDetails;
import org.openqa.selenium.WebDriver;

/**
 * Created by grodrigu on 10/4/16.
 */
public class LoginPage {
    private WebDriver driver;
    private String urlPage = "https://www.cleartrip.com/signin";

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage open() {
        driver.get(urlPage);
        return this;
    }

    public LoginPage fillDetals(UserLoginDetails userLoginDetails) {
        emailTextBox().fill(userLoginDetails.getUserEmail());
        passwordTextBox().fill(userLoginDetails.getUserPassword());
        signInButton().click();
        return this;
    }

    public TextBox emailTextBox() {
        return new TextBox(driver, "email");
    }
    public TextBox passwordTextBox(){
        return new TextBox(driver, "password");
    }
    public Button signInButton(){
        return new Button(driver, "signInButton");
    }
}