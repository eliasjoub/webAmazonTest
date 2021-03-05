package test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class myTest extends BaseWebTest {

    @Test
    public void myFirstTest(){

        // Click on the Search button
      //  ScreenshotListener.takeScreenShot(driver);

        driver.findElement(By.linkText("Core Java")).click();
       // ScreenshotListener.takeScreenShot(driver);
        Assert.assertEquals("1", "2", "validate cleaning mode");

    }
}
