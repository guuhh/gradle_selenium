package Controlers;

import org.openqa.selenium.WebDriver;

/**
 * Created by grodrigu on 10/4/16.
 */
public class TextBox extends UIElement{
    public TextBox(WebDriver driver, String id){
        super(driver, id);

    }
    public void fill(String text){
        element().sendKeys(text);
    }
}
