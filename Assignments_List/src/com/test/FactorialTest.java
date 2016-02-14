package com.test;

import static org.testng.AssertJUnit.assertEquals;
import org.testng.annotations.Test;

import com.main.Factorial;

public class FactorialTest {
	
	
  @Test(groups={"non_recursive"})
  
  public void test1()
  {
	int actual =Factorial.fact(5);
	int expected=120;
	assertEquals(actual,expected);
  }
 @Test(groups={"recursive"})
  
  public void test2()
  {
	int actual =Factorial.fact(4);
	int expected=24;
	assertEquals(actual,expected);
  }
 @Test(groups={"recursive","non_recursive"})
 
 public void test3()
 {
	int actual =Factorial.fact(0);
	int expected=1;
	assertEquals(actual,expected);
 }
 @Test(groups={"recursive","non_recursive"})
 
 public void test4()
 {
	int actual =Factorial.fact(-4);
	int expected=1;
	assertEquals(actual,expected);
 }
}
