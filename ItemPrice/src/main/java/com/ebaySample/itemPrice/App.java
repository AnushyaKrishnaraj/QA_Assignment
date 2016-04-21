package com.ebaySample.itemPrice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Get Item Price from EBAY!
 *
 */
public class App
{
    public void ItemPrice(String itemName, int noOfItems ) throws Exception
    {
          
        System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
          //firefox
        //WebDriver driver=new FirefoxDriver();
        driver.get("http://www.ebay.com/");
        driver.findElement(By.xpath(".//*[@id='gh-ac']")).sendKeys(itemName);
        driver.findElement(By.xpath(".//*[@id='gh-btn']")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        List<WebElement> items =driver.findElements(By.xpath(".//li[@class='lvprice prc']/span[@class='bold']"));
        //System.out.println(noOfItems);
         for( int i=0;i < noOfItems; i++)
         {  
             //System.out.println( items.get(i).getAttribute("innerHTML")+items.get(i).getText().toString());
             System.out.println("Price of "+  itemName + " in position " + (i+1) + " is "+ items.get(i).getText());
         }
       driver.quit();
       
    }

}
