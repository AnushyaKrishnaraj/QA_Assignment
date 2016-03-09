package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.base.BasePage;
import com.util.PageDriver;

public class LoginPage extends BasePage{
	public LoginPage(PageDriver driver)
	{
		super(driver);
	}
    public String  login_verify(String username,String pwd) throws Exception
    {     String error;
    	//driver.manage().window().maximize();
    	 driver.findElement(By.xpath(".//*[@id='loginButton']")).click();
    	 driver.findElement(By.xpath(".//*[@id='username']")).sendKeys(username);
    	 driver.findElement(By.xpath(".//*[@id='password']")).sendKeys(pwd);
    	 driver.findElement(By.id("login")).click();
    	 Thread.sleep(2000);
    	 error = driver.findElement(By.xpath(".//*[@class='text-danger']")).getText();
 		return error;
    }
}
