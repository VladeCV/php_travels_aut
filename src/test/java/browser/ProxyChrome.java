package browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class ProxyChrome implements IBrowser {
    @Override
    public WebDriver createBrowser() {
        WebDriverManager.chromedriver().setup();
        Proxy proxy = new Proxy();
        proxy.setHttpProxy("127.0.0.1:8080");
        proxy.setSslProxy("127.0.0.1:8080");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--ignore-certificate-errors");
        chromeOptions.setProxy(proxy);

        WebDriver chrome = new ChromeDriver(chromeOptions);
        chrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        return chrome;
    }
}
