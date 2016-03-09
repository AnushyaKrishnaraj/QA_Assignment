package com.test;

import static org.testng.AssertJUnit.assertEquals;

import org.junit.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.base.BaseTest;
import com.page.HomePage;

public class HomePageTest extends BaseTest {
HomePage hp;
	
	@BeforeClass
	public void initialize()
	{    System.out.println("hi");
		hp = new HomePage(driver);
		System.out.println(driver);
	}
	
	@Test
	public void testCountSocialIcons()
	{
		int actual  = hp.count_items();
		System.out.println("Number of Items in Navigation Menu: " + actual);
		assertEquals(7, actual);
	}
	
	
	@Test
	public void testLoginClick()
	{
		String actual = hp.login();
		System.out.println(actual);
		assertEquals("http://whiteboxqa.com/login.php", actual);
	}
	
	@AfterClass
	public void quit()
	{
		driver.quit();
	}
}


