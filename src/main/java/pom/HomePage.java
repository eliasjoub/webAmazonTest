package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage extends BaseWebPage {

    @FindBy(id = "com.maytronics.app:id/next_operation_description")
    private WebElement nextCleanMode;

    public void waitForLoad(){
       // PageFactory.initElements(appiumDriver, this);


    }

   
    public void validateNextCleanCycleTime(String expectedTime) {
       // String actualTime = getNextCleanCycleTime();
      //  validationUtils.validateTime(actualTime, expectedTime);
    }


//    public static void validateTime(String actualTime, String expectedTime) {
//        System.out.println("actaul time : " + actualTime + ", expected time : " + expectedTime);
//
//        Assert.assertEquals(Integer.parseInt(TimeUtils.getHour(actualTime)),
//                Integer.parseInt(TimeUtils.getHour(expectedTime)));
//        Assert.assertEquals(Integer.parseInt(TimeUtils.getMin(actualTime)),
//                Integer.parseInt(TimeUtils.getMin(expectedTime)));
//    }
}
