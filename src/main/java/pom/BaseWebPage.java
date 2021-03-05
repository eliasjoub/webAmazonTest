package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import test.BaseWebTest;

public abstract class BaseWebPage {
    public WebDriver webDriver = BaseWebTest.getWebDriver();

    public abstract void waitForLoad();

    public BaseWebPage(){
        System.out.println("wait for load page");
        waitForLoad();
    }

    public  void waitForElementToAppear(WebElement element) {
        int time = 2;
        Wait<WebDriver> wait = new WebDriverWait(webDriver, 30);

        while (time != 0) {
            try {
                wait.until(ExpectedConditions.visibilityOf(element));
                time = 0;
            } catch (Exception e) {
                time--;
            }
        }
    }
}
