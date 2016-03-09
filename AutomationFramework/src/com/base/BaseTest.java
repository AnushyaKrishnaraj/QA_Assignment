package com.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.internal.Configuration;

import com.util.PageDriver;

public class BaseTest {

public static final Configuration _config;

static
{
	_config = new Configuration();
}

public PageDriver driver;



@BeforeSuite
public void setUp() throws Exception
{
	driver = new PageDriver(_config);
   
}


}


