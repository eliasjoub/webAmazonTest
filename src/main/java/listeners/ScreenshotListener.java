//package listeners;
//
//import io.qameta.allure.Allure;
//import io.qameta.allure.Step;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.testng.ITestContext;
//import org.testng.ITestListener;
//import org.testng.ITestResult;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.InputStream;
//
//public class ScreenshotListener implements ITestListener {
//
//
//    public void onTestStart(ITestResult result) {
//
//    }
//
//
//    public void onTestSuccess(ITestResult result) {
//
//    }
//
//
//    public void onTestFailure(ITestResult result,WebDriver driver) {
//        if (!result.isSuccess()) {
//            try {
//                File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//                try (InputStream is = new FileInputStream(screenshot)) {
//                    Allure.addAttachment(result.getName(), is);
//                }
//            } catch (Exception ex) {
//                ex.printStackTrace();
//            }
//        }
//    }
//
//    public void onTestSkipped(ITestResult result) {
//
//    }
//
//    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
//
//    }
//
//    public void onStart(ITestContext context) {
//
//    }
//
//    public void onFinish(ITestContext context) {
//
//    }
//
//    @Step
//    public static void takeScreenShot(WebDriver driver) {
//        try {
//            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//            try (InputStream is = new FileInputStream(screenshot)) {
//                Allure.addAttachment("welcome page screenShot", is);
//            }
//        } catch (Exception ex) {
//        }
//
//    }
//
//    @Step
//    public static void takeScreenShot(String screenShotTitle, WebDriver driver) {
//        try {
//            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//            try (InputStream is = new FileInputStream(screenshot)) {
//                Allure.addAttachment("welcome page screenShot", is);
//            }
//        } catch (Exception ex) {
//        }
//
//    }
//
//    @Step("Type {f}")
//    public static void p(String f) {
//        Allure.addAttachment("welcome page screenShot", "");
//
//    }
//}
