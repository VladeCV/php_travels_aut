package util;

import control.Control;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import session.Session;

public class ScrollUtil {
//    public static void scrollToElement(WebElement elemento) {
//        JavascriptExecutor js = (JavascriptExecutor) Session.getInstance().getBrowser();
//        js.executeScript("arguments[0].scrollIntoView(true);", elemento);
//    }

    public static void scrollToElement(Control control) {
        JavascriptExecutor js = (JavascriptExecutor) Session.getInstance().getBrowser();
        js.executeScript("arguments[0].scrollIntoView(true);", control.getWebElement());
    }

    public static void scrollBy(int xPixels, int yPixels) {
        JavascriptExecutor js = (JavascriptExecutor) Session.getInstance().getBrowser();
        js.executeScript("window.scrollBy(arguments[0], arguments[1]);", xPixels, yPixels);
    }
}
