package test;

import Data.itemBoxDetails;
import Handler.HomePageHandler;
import Handler.searchedItemPageHandler;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pom.AmazonPages.HomePage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;


public class AmazonTest extends BaseWebTest {

    @Test
    public void myFirstTest() throws Exception {
        String itemToSearch = "software automation";
        int numberofPages =4;
        HomePageHandler amazonHomeHandler = new HomePageHandler();
        searchedItemPageHandler searchedItemPageHandler = amazonHomeHandler.searchFor(itemToSearch);
        List<itemBoxDetails> allItems = searchedItemPageHandler.getAllPagesItems(numberofPages);
        writeToCsvFile(allItems);
        validateTest(allItems);
    }

    public void validateTest(List<itemBoxDetails> allItems) throws Exception {
        boolean flag = false;
        System.out.println("validate method");

        for (itemBoxDetails item : allItems) {
             System.out.println("actual title is " + item.getTitle());
            if (item.getTitle().contains("Software Automation Testing Secrets Revealed"))
                flag = true;
            System.out.println("validate price not equal 0 , actual price is : " + item.getPrice());

            Assert.assertNotEquals(item.getPrice(), "0", "validate price not equal 0 , actual price is : " + item.getPrice());

            Assert.assertEquals(flag,true,"there is no a title contains Software Automation Testing Secrets Revealed");

        }
    }

    public void writeToCsvFile(List<itemBoxDetails> allItems) throws Exception {

        String filePath = System.getProperty("user.dir") + "\\src\\main\\resources\\aa.csv";
        PrintWriter pw = null;

        try {
            pw = new PrintWriter(new File(filePath));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        StringBuilder builder = new StringBuilder();
        String columnNamesList = "Title,Price,StarsNumber";
        builder.append(columnNamesList + "\n");
        pw.write(builder.toString());

        for (itemBoxDetails item : allItems) {
            builder = new StringBuilder();
            columnNamesList = "\"" + item.getTitle() + "\"" + "," + item.getPrice() + "," + item.getNumberOfStars();
            builder.append(columnNamesList + "\n");
            pw.write(builder.toString());
        }

        pw.close();
        System.out.println("done!");

    }

}
