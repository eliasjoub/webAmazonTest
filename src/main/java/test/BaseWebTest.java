package test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BaseWebTest {

    static WebDriver driver = null;

    @BeforeClass
    public void setUpOnce() throws Exception {
        // System Property for Chrome Driver
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver_win\\chromedriver.exe");

        // Instantiate a ChromeDriver class.
        driver=new ChromeDriver();

        // Launch Website
        driver.navigate().to("http://www.javatpoint.com/");

        //Maximize the browser
        driver.manage().window().maximize();

        //Scroll down the webpage by 5000 pixels
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("scrollBy(0, 5000)");

    }

    public static WebDriver getWebDriver(){
        return driver;
    }

}
