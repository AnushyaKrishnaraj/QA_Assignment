package com.test.strings;

import static org.testng.AssertJUnit.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.main.strings.ReverseString;
import com.main.strings.ReverseWord;

public class ReverseWordtest {
	ReverseWord rw;



	@DataProvider(name="WordTest")
	public Object[][] data()
	{
		 Object[][] arr =
			{{"Krithikraj is a boy" ,"jarkihtirK si a yob"},{"~!@#$%","%$#@!~"},
		{"krithik is an awesome kid","kihtirk si na emosewa dik"},
		{"Mahathma Gandhi","amhtahaM ihdnaG"},{"hello 7896","olleh 6987"}};
		 return arr;

	}
	@Test(dataProvider="WordTest")
	public void testCase(String input,String expected)
	{
	rw=new ReverseWord();
	String actual=rw.Rword(input);
	assertEquals(actual,expected);
	
	}

}
