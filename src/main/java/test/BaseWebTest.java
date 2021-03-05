package test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BaseWebTest {

    String urlToNavigate = "http://www.amazon.com/";
    static WebDriver driver = null;

    @BeforeClass
    public void setUpOnce() throws Exception {
        // System Property for Chrome Driver
        String chromePath = System.getProperty("user.dir") +"\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromePath);

        // Instantiate a ChromeDriver class.
        driver=new ChromeDriver();

        // Launch Website
        driver.navigate().to(urlToNavigate);

        //Maximize the browser
        driver.manage().window().maximize();

        //Scroll down the webpage by 5000 pixels
//        JavascriptExecutor js = (JavascriptExecutor)driver;
//        js.executeScript("scrollBy(0, 5000)");

    }

    public static WebDriver getWebDriver(){
        return driver;
    }

}
