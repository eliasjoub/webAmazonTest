package Handler;

import Data.itemBoxDetails;
import pom.AmazonPages.HomePage;
import pom.AmazonPages.searchedItemPage;

import java.util.ArrayList;
import java.util.List;

public class searchedItemPageHandler {
    searchedItemPage searchedItemPage;

    public searchedItemPageHandler(){
        System.out.println("intialize searched Item Page home page");
        searchedItemPage = new searchedItemPage();
    }

    public List<itemBoxDetails> getAllPageItems(){
        itemBoxDetails itemDetails;
        List<itemBoxDetails> allItems = new ArrayList<itemBoxDetails>();
        int itemsAmount = searchedItemPage.getItemsAmount();
        for (int specificItem = 1;specificItem <= itemsAmount;specificItem++){
            System.out.println("get item : "  +specificItem);
            itemDetails = getSpecificItemDetails(specificItem);
            allItems.add(itemDetails);
        }
        return allItems;
    }

    public List<itemBoxDetails> getAllPagesItems(int numberOfPages) throws InterruptedException {
        List<itemBoxDetails> allItems = new ArrayList<itemBoxDetails>();

        for(int pageNumber= 1;pageNumber<=numberOfPages;pageNumber++){
            List<itemBoxDetails> allItemsInSpecificPage = getAllPageItems();
            allItems.addAll(allItemsInSpecificPage);
            searchedItemPage.clickNextPage();
        }

        return allItems;
    }

    public itemBoxDetails getSpecificItemDetails(int specificItem){
        String itemTitle = searchedItemPage.getSpecificItemTitle(specificItem);
        String itemPrice = searchedItemPage.getSpecificItemPrice(specificItem);
        String itemStarsNumber = searchedItemPage.getSpecificItemNumberOfStars(specificItem);
        itemBoxDetails itemDetails = new itemBoxDetails(itemTitle,itemPrice,itemStarsNumber);
        return itemDetails;
    }
}
