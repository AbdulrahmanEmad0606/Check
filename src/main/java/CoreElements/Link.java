package CoreElements;

import org.openqa.selenium.By;

public class Link extends Element{
    public Link(By link){
        this.setLocator(link);
    }
    //Actions
    public void click(){
        webDriver.findElement(locator).click();
    }
    public String getText(){return webDriver.findElement(locator).getText();}
}
