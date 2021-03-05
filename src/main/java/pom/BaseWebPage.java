package pom;

import org.openqa.selenium.WebDriver;
import test.BaseWebTest;

public abstract class BaseWebPage {
    public WebDriver appiumDriver = BaseWebTest.getWebDriver();

    public abstract void waitForLoad();

}
