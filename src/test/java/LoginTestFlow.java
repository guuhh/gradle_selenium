import Controlers.Button;
import Models.UserLoginDetails;
import Pages.LoginPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by grodrigu on 10/4/16.
 */
public class LoginTestFlow {
    private static final String SIGN_IN_BUTTON = "signInButton";
    private static final String ERROS1 = "erros1";
    private static WebDriver driver;
    private static WebDriverWait wait;

    @Before
    public void setUp() throws Exception{
        System.setProperty("webdriver.gecko.driver", "./drives/geckodriver");
        driver = new FirefoxDriver();
    }
    @After
    public void tearDown() throws Exception{
        driver.quit();
    }

    @Test
    public void shouldShowErrorMessageIfInvalidCredentialsAreEntered() throws InterruptedException{
        new LoginPage(driver).open()
                .fillDetals(UserLoginDetails.INVALID_EMAIL_DETALS);
        new Button(driver, SIGN_IN_BUTTON).click();
        String errorMessage = getText(ERROS1);
        Assert.assertEquals("There were errors in your submission" +
                "\nThe username or password you entered is incorrect.",errorMessage);
    }

    @Test
    public void shouldShowErrorIfNoPasswordIsEntered() throws InterruptedException{
        new LoginPage(driver).open()
                .fillDetals(UserLoginDetails.INVALID_EMAIL_EMPTY);
        new Button(driver, SIGN_IN_BUTTON).click();
        String errorMessage = getText(ERROS1);

    }

    public String getText(String id){
        wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id(id))));
        WebElement messageSpan = driver.findElement(By.id(id));
        return messageSpan.getText();
    }

}