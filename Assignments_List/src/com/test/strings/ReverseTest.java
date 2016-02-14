package com.test.strings;

import static org.testng.AssertJUnit.assertEquals;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.main.strings.ReverseString;

public class ReverseTest {
	ReverseString rs;



@DataProvider(name="StringTest")
public Object[][] data()
{
	 Object[][] arr =
		{{"Krithikraj" ,"jarkihtirK"},{"~!@#$%","%$#@!~"},
	{"krithik is an awesome kid","dik emosewa na si kihtirk"},
	{"Mahathma Gandhi","ihdnaG amhtahaM"},{"hello 7896","6987 olleh"}};
	 return arr;

}
@Test(dataProvider="StringTest")
public void testCase(String input,String expected)
{
rs=new ReverseString();
String actual=rs.reverse(input);
assertEquals(actual,expected);
}
}