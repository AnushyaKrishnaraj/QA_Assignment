package com.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.base.BasePage;
import com.util.PageDriver;


public class HomePage extends BasePage {
 
	
     public HomePage(PageDriver driver) {
		super(driver);
		
	}
	public int count_items()
    {
    	 int count;
    	 List<WebElement> icon=driver.findElements(By.xpath(".//div[@id='navbar-collapse']/ul/li"));
    	 if(icon.size()==0)
    		count=0; 
    	 else 
    		 count=icon.size();
    	return count;
    }
    public String login()
    {
    	String url = null;
		
	  driver.findElement(By.xpath(".//*[@id='loginButton']")).click();
		
		url = driver.getCurrentUrl();
		
		return url;
		
    }
    public void quit()
    {
    	driver.quit();
    }
}

