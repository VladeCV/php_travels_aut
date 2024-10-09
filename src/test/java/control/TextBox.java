package control;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static org.openqa.selenium.Keys.ENTER;

public class TextBox extends Control {
    public TextBox(By locator) {
        super(locator);
    }

    public void setText(String value) {
        this.find();
        this.control.clear();
        this.control.sendKeys(value);
    }

    public void setTextEnter(String value) {
        this.find();
        this.control.clear();
        this.control.sendKeys(value, Keys.ENTER);
    }
}
