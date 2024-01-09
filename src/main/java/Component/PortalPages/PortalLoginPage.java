package Component.PortalPages;

import CoreElements.*;
import org.openqa.selenium.By;

public class PortalLoginPage {
    Driver webDriver;
    //constructor to initialize the webDriver

    public PortalLoginPage(Driver webDriver){
        this.webDriver=webDriver;
        Element.setWebDriver(webDriver.getWebDriver());
    }

    //identify the page locators
    //get username input
    public TextBox userName=new TextBox(By.id("login-email"));
    //get password input
    public TextBox password=new TextBox(By.id("login-password"));
    //get login button
    public Button loginBtn = new Button(By.id("trigger-spinner"));
    public void openPortal(){
        webDriver.goTo("http://youxeldev.eastus.cloudapp.azure.com/Check/Portal/Account/Login");
        webDriver.maximizeWindow();
    }

    // login on the portal
    public void loginAdmin(String userName1,String password1){
        Element.waitExplicitly(By.id("login-email"));
        this.userName.typeText(userName1);
        this.password.typeText(password1);
        this.loginBtn.click();
    }


}
