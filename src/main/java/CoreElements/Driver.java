package CoreElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    static WebDriver webDriver;

    public WebDriver getWebDriver() {
        return webDriver;
    }

    public Driver() {
        webDriver = new ChromeDriver();
    }

    public void maximizeWindow() {
        webDriver.manage().window().maximize();
    }

    public void goTo(String url) {
        webDriver.get(url);
    }

    public void tearDown() {
        webDriver.quit();
    }
}
