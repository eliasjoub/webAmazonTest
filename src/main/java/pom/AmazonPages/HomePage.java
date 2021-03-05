package pom.AmazonPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pom.BaseWebPage;

public class HomePage extends BaseWebPage {

    @FindBy(id = "twotabsearchtextbox")
    private WebElement searchTextBox;

    @FindBy(id = "nav-search-submit-button")
    private WebElement searchButton;

    String searchTextBoxElementXpath=  "//*[@id='twotabsearchtextbox']";

    public void waitForLoad(){
        waitForElementToAppear(searchTextBox);
        PageFactory.initElements(webDriver, this);
    }

    public void setSearchTextBox(String searchVal){
        System.out.println("set search textBox to : ");
        searchTextBox.sendKeys(searchVal);
    }

    public void clickSearchButton(){
        System.out.println("click on search button ");
        searchButton.click();
    }
}
