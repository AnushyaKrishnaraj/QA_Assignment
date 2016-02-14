package com.test.strings;

import static org.testng.AssertJUnit.assertEquals;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.main.strings.Pallindrome;

public class PallindromeTest {
	Pallindrome pal;
 @DataProvider(name="pallin data")
 public Object[][] dataProvider()
 {
	 Object[][] palArray={{"noon","noon"},{"wow","wow"},{"w%w","w%w"}
	 ,{"n55n","n55n"},{"DID","did"}};
	 return palArray;
	 }
 
@Test(dataProvider="pallin data")
public void test(String input,String expected)
{   
	
	 pal= new Pallindrome();
	String actual=pal.pallin(input) ;
   assertEquals(actual.toLowerCase(),expected.toLowerCase());
	
	
	

}
@Test
public void nullstring()
{
pal=new Pallindrome();
try
{
String actual=pal.pallin(null);
assertEquals(actual.toLowerCase(),null);
}catch (NullPointerException ne)
{
	System.out.println("The string is null.No operations can be performed");
	System.out.println(ne.getMessage());
}
}}