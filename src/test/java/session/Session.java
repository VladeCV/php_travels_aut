package session;

import browser.FactoryBrowser;
import org.openqa.selenium.WebDriver;
import util.GetProperties;

public class Session {
    private static Session instance = null;
    private WebDriver browser;

    private Session() {
        browser = FactoryBrowser.make(GetProperties.getInstance().getBrowser()).createBrowser();
    }

    public static Session getInstance() {
        if (instance == null)
            instance = new Session();
        return instance;
    }

    public WebDriver getBrowser() {
        return browser;
    }

    public void closeSession() {
        browser.quit();
        instance = null;
    }
}
