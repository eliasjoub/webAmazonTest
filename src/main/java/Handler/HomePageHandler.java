package Handler;

import pom.AmazonPages.HomePage;

public class HomePageHandler {
    HomePage amazonHomePage;

    public HomePageHandler(){
        System.out.println("intialize amazon home page");
        amazonHomePage = new HomePage();
    }

    public searchedItemPageHandler searchFor(String item){
        amazonHomePage.setSearchTextBox(item);
        amazonHomePage.clickSearchButton();
        return new searchedItemPageHandler();
    }
}
