package com.util;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class Config {
public static String url;
public static String browser;

public static void readprops() throws Exception
{
	Properties p= new Properties();
	InputStream input = null;
	input = new FileInputStream("config.properties");
	p.load(input);
	url=p.getProperty("url");
	browser=p.getProperty("browser");
	System.out.println("URL : " + url);
	System.out.println("Browser: " + browser);
}
}
