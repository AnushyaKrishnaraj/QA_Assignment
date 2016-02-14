package com.test;

import static org.testng.AssertJUnit.assertEquals;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.main.Swapping;



public class swappingTest {
	
	
	Swapping sw;
	int [] actual =new int[2];
		
	@BeforeMethod
	public void  declare1()
	
	{
		sw=new Swapping();
	}
	
  @Test
  //positive values
  public  void positive()
  {
	  actual=sw.swap3Var(15,20);
	  int[] estimated={20,15};
	  assertEquals(estimated[0],actual[0]);
	  assertEquals(estimated[1],actual[1]);
			  
  }
	
  @Test
  //positive values
  public  void negativex()
  {
	  actual=sw.swap3Var(15,-20);
	  int[] estimated={-20,15};
	  assertEquals(estimated[0],actual[0]);
	  assertEquals(estimated[1],actual[1]);
			  
  }
  
  @Test
  //one negative values
  public  void negativey()
  {
	  actual=sw.swap3Var(-15,20);
	  int[] estimated={20,-15};
	  assertEquals(estimated[0],actual[0]);
	  assertEquals(estimated[1],actual[1]);
			  
  }
  @Test
  //both negative values
  public  void negativexy()
  {
	  actual=sw.swap3Var(-15,-20);
	  int[] estimated={-20,-15};
	  assertEquals(estimated[0],actual[0]);
	  assertEquals(estimated[1],actual[1]);
			  
  }
  @Test
  //zero
  public  void zero()
  {
	  actual=sw.swap3Var(15,0);
	  int[] estimated={0,15};
	  assertEquals(estimated[0],actual[0]);
	  assertEquals(estimated[1],actual[1]);
			  
  }
  //same
  @Test
  //positive values
  public  void same()
  {
	  actual=sw.swap3Var(15,-15);
	  int[] estimated={-15,15};
	  assertEquals(estimated[0],actual[0]);
	  assertEquals(estimated[1],actual[1]);
			  
  }
}
