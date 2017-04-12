package Controlers;

import org.openqa.selenium.WebDriver;

/**
 * Created by grodrigu on 10/4/16.
 */
public class Button extends UIElement {
    public Button (WebDriver driver, String id){
        super(driver, id);
    }
    public void click(){
        element().click();
    }
}
