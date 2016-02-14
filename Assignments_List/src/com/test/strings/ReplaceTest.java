package com.test.strings;

import static org.testng.AssertJUnit.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.main.strings.ReplaceSubString;

public class ReplaceTest {

	
		ReplaceSubString rss;



	@DataProvider(name="StringreplaceTest")
	public Object[][] data()
	{
		 Object[][] arr =
			 {{"awesome","a","Awwwwww","Awwwwwwwesome"},{"How are you","are","r","How r you"},{"God resides in our heart","heart","&&&","God resides in our &&&"},
					 {"locala","ala","111","loc111"},{"how are are you","are","you","how you you you"}};
		 return arr;
	}
			

	
	@Test(dataProvider="StringreplaceTest")
	public void testCase(String input,String sub,String replaced,String expected)
	{
	rss=new ReplaceSubString();
	String actual=rss.replace(input,sub,replaced);
	assertEquals(actual,expected);
	}
	}

