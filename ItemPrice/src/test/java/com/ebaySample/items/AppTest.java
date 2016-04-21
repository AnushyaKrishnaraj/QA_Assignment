package com.ebaySample.items;

import org.testng.annotations.*;

/**
 * 
 */

public class AppTest {

/**
 * TestNG test for simple EBAY App.
 */
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
    public void AppTest1(String itemName, int noOfItems) throws Exception
    {
        
        itemObj.ItemPrice(itemName, noOfItems);
       
    }
  
   
}

  
    