package Controlers;

import org.openqa.selenium.WebDriver;

/**
 * Created by grodrigu on 13/04/17.
 */
public class Message  extends  UIElement{

    public Message(WebDriver driver, String id) {
        super(driver, id);
    }

    public String getMessage(){

       return message().getText();

    }
}
