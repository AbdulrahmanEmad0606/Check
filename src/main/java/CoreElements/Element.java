package CoreElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Element {
    //define the locator
    protected By locator;
    //define the webDriver
    protected static WebDriver webDriver;

    //set the locator
    public void setLocator(By locator) {
        this.locator = locator;
    }
    //set the webDriver
    public static void setWebDriver(WebDriver webDriver) {
        Element.webDriver = webDriver;
    }
    //get the locator
    public  By getLocator() {
        return locator;
    }
    //get the webDriver
    public static WebDriver getWebDriver() {
        return webDriver;
    }
    //check if the element is displayed or not
    public boolean isDisplayed(By locator) {
        if (webDriver.findElement(locator).isDisplayed()) {
            return true;
        } else return false;
    }
    //check if the element is enabled or not
    public boolean isEnabled(By locator) {
        String attrName = "disabled";
        if (webDriver.findElement(locator).getAttribute(attrName) != null) {
            return true;
        } else return false;
    }
    //Implicit Wait
    public static void waitImplicitly(long time){
        webDriver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
    }
    // Explicit wait
    public static void waitExplicitly(By locator){
        WebDriverWait wait=new WebDriverWait(webDriver, Duration.ofSeconds(10));
        WebElement element=wait.until(ExpectedConditions.visibilityOf(getWebDriver().findElement(locator)));
    }
}
