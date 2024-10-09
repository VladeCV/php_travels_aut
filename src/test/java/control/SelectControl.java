package control;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class SelectControl extends Control {
    public SelectControl(By locator) {
        super(locator);
    }

    public void selectByValue(String value) {
        this.find();
        Select selectElement = new Select(this.control);
        selectElement.selectByValue(value);
    }

    public void selectByIndex(int index) {
        this.find();
        Select selectElement = new Select(this.control);
        selectElement.selectByIndex(index);
    }

    public void selectByVisibleText(String text) {
        this.find();
        Select selectElement = new Select(this.control);
        selectElement.selectByVisibleText(text);
    }

    public String getSelectedText() {
        this.find();
        Select selectElement = new Select(this.control);
        return selectElement.getFirstSelectedOption().getText();
    }
}
