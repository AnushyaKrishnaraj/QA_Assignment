package com.test;

import static org.testng.AssertJUnit.assertEquals;

import org.junit.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.page.LoginPage;

public class LoginPageTest extends HomePageTest{
LoginPage lp;
	
	@BeforeClass
	public void initialize()
	{
		lp = new LoginPage(driver);
	}
	
	
	@DataProvider(name="user-data")
	public Object[][] getUserData()
	{
		Object[][] data = {{"sfaf@yahoo.com","kdsafka"},{"sadfads@gmail.com","Dasda"}};
		
		return data;
	}
	
	@Test(dataProvider="user-data")
	public void testInvalidLogin(String userName,String pwd) throws Exception
	{
		String actString = lp.login_verify(userName,pwd);
		assertEquals("Something went wrong...Please try again.",actString);
		
	}
	
	@AfterClass
	public void quit()
	{
		driver.quit();
	}
	

}



