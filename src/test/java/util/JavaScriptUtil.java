package util;

import control.Control;
import org.openqa.selenium.JavascriptExecutor;
import session.Session;

public class JavaScriptUtil {
    public static void clickJavaScript(Control control) {
        ((JavascriptExecutor) Session.getInstance().getBrowser()).executeScript("arguments[0].click();", control.getWebElement());
    }
}
