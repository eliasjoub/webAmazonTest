package pom.AmazonPages;

import Data.itemBoxDetails;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pom.BaseWebPage;

public class searchedItemPage extends BaseWebPage {
    @FindBy(className = "a-section a-spacing-medium")
    private WebElement resultItems;

    String AllItemsXpath = "//*[@class='a-size-base-plus a-color-base a-text-normal']";
    String specificItemTitleXpath = "(//*[@class='a-size-base-plus a-color-base a-text-normal'])[##ITEM_INDEX##]";
    String specificItemStarsXpath = "(//*[@class='a-row a-size-small'])[##ITEM_INDEX##]/*[1]";
    String specificItemPriceXpath = "((//*[@class='s-expand-height s-include-content-margin s-border-bottom s-latency-cf-section'])[##ITEM_INDEX##]//*[@class='a-price-whole'])[1]";
    String nextButtonXpath = "//*[@class='a-last']";

    public void waitForLoad() {
        waitForElementToAppear(resultItems);
        PageFactory.initElements(webDriver, this);
    }

    public String getSpecificItemTitle(int itemIndex) {
        System.out.println("get Specific Item Title " + itemIndex);
        String specificTitleXpath = specificItemTitleXpath.replace("##ITEM_INDEX##", itemIndex + "");
        return webDriver.findElement(By.xpath(specificTitleXpath)).getText();
    }

    public String getSpecificItemPrice(int itemIndex) {
        System.out.println("get Specific Item Price " + itemIndex);
        String specificTitleXpath = specificItemPriceXpath.replace("##ITEM_INDEX##", itemIndex + "");
        try {
            String itemPriceVal = webDriver.findElement(By.xpath(specificTitleXpath)).getText();
            return itemPriceVal;
        } catch (Exception e) {
            System.out.println("there is no price to this item");
        }
        return "there is no price to this item";
    }

    public String getSpecificItemNumberOfStars(int itemIndex) {
        System.out.println("get Specific Item stars number " + itemIndex);
        String specificStarsXpath = specificItemStarsXpath.replace("##ITEM_INDEX##", itemIndex + "");
        String starsNumber = "";
        try {
            starsNumber = webDriver.findElement(By.xpath(specificStarsXpath)).getAttribute("aria-label");
        } catch (Exception e) {
            System.out.println("there is no stars to this specific item ");
            return "there is no stars to this specific item";
        }

        starsNumber = starsNumber.substring(0, starsNumber.indexOf(' '));
        return starsNumber;

    }

    public int getItemsAmount() {
        System.out.println("find all items amount by count all item titles number");
        return webDriver.findElements(By.xpath(AllItemsXpath)).size();
    }

    public void clickNextPage() throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("find all items amount by count all item titles number");
        WebElement element = webDriver.findElement(By.xpath(nextButtonXpath));
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(5000);
        element.click();
    }
}
