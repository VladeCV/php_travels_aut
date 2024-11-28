package control;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import session.Session;

import java.time.Duration;

public class Control {
    protected WebElement control;
    protected By locator;

    public Control(By locator) {
        this.locator = locator;
    }

    protected void find() {
        control = Session.getInstance().getBrowser().findElement(this.locator);
    }

    public WebElement getWebElement() {
        this.find();
        return this.control;
    }

    public void click() {
        this.find();
        this.control.click();
    }

    public String getText() {
        this.find();
        return this.control.getText();
    }

    public Boolean isDisplayed() {
        this.find();
        return this.control.isDisplayed();
    }

    public WebElement waitVisibility(int timeout) {
        this.find();
        return new WebDriverWait(Session.getInstance().getBrowser(), Duration.ofSeconds(timeout)).until(ExpectedConditions.visibilityOf(control));
    }
}
