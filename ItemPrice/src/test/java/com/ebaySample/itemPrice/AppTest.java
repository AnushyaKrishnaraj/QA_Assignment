package com.ebaySample.itemPrice;

import org.testng.annotations.*;

/**
 * TestNG test for EBAY app.
 */
public class AppTest {
   
   App itemObj;
   
    @BeforeMethod
    public void initialize()
    {
        itemObj = new App();
    }
   
    @DataProvider(name = "test1")
    public static Object[][] itemInfo() {
        return new Object[][] {{"iphone", 5 },{"ipad2", 5 },{"iwatch", 5 }};
    }
   
    @Test(dataProvider ="test1")
    public void AppTest(String itemName, int noOfItems) throws Exception
    {
        System.out.println("Running TestNG TestCase for ItemPrice");
        itemObj.ItemPrice(itemName, noOfItems);
       
    }

 
}
