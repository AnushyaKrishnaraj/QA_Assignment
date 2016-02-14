package com.test;


import static org.testng.AssertJUnit.assertEquals;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.Scanner;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;


import com.main.Fibonacci;

public class FibonacciTest {
	
	
	Fibonacci fib;
	Scanner s;
	int expected;
	int n;
	int actual;
	@BeforeTest
	public void declare()
	{
		fib= new Fibonacci();
		
		s=new Scanner(System.in);
		//System.out.println("Enter a negative value ,zero value, lessthan 2,greater than 2 value");
	}
	@BeforeClass
	public void in()
	{
		System.out.println("Enter a negative input");
	}
	
	@BeforeMethod
	public void input()
	{
		
		 n=s.nextInt();
		 System.out.println("Enter the expected result");
		 expected=s.nextInt();
		
	}
  @Test (priority=1)
  //Test for negative value
  public void negativeTest()
  {
	 
	actual=fib.Series(n);
	assertEquals(actual,expected);
	System.out.println("Enter a zero input");
  }
  @Test (priority=2)
  //test for zero
  public void zeroTest()
  {
  
   actual=fib.Series(n);
	assertEquals(actual,expected);
	System.out.println("Enter an input less than or equal to two");
}
  @Test(priority=3)
  //lessthan or equal to 2
  public void lessThan2Test()
  {
	  actual=fib.Series(n);
		assertEquals(actual,expected);
		System.out.println("Enter an input greater than 2");
  }
  @Test(priority=4)
  public void greaterthan2()
  {
	  actual=fib.Series(n);
		assertEquals(actual,expected);
  }
  
 
}
