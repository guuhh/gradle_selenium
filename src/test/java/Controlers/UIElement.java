package Controlers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.google.common.base.Function;


/**
 * Created by grodrigu on 10/4/16.
 */
public class UIElement {
    private WebDriver driver;
    private String id;
    private WebDriverWait wait;

    public UIElement(WebDriver driver, String id){
        this.driver = driver;
        this.id = id;
        this.wait = new WebDriverWait(this.driver, 10);
    }
    public WebElement element(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));
        return driver.findElement(By.id(id));
    }
}
