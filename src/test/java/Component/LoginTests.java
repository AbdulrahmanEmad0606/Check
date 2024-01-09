package Component;

import Component.PortalPages.PortalLoginPage;
import CoreElements.Driver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTests {
    Driver driver = new Driver();
    PortalLoginPage portalLoginPage = new PortalLoginPage(driver);

    @BeforeTest
    public void setUp() {
        portalLoginPage.openPortal();
    }

    @Test
    public void checkCreatingUser() {
        portalLoginPage.loginAdmin("check7", "P@ssw0rd");
        Assert.assertEquals(driver.getWebDriver().getCurrentUrl(), "http://youxeldev.eastus.cloudapp.azure.com/Check/Portal/Units");
    }

    @AfterTest
    public void tearDown() {
        driver.tearDown();
    }
}
