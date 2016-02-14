package com.test.arrays;

import static org.testng.AssertJUnit.assertEquals;
import java.util.Scanner;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.main.arrays.LinearSearch;

public class SearchTest {
	LinearSearch l;
	
	@BeforeSuite
	public void declare()
	{
		l= new LinearSearch();
	Scanner	 s= new Scanner(System.in);
		
	}

	@Test//positive numbers
    public void pos()
    {
    	int a[]={10,20,30,40,50};
    	int find=30;
    	int actual=l.search(a,find);
    	assertEquals(actual,find);
    }
	@Test//negative numbers
    public void neg()
    {
    	int a[]={-10,-20,-30,-40,-50};
    	int find=-30;
    	int actual=l.search(a,find);
    	assertEquals(actual,find);
    }
	@Test//combination numbers
    public void comb()
    {
    	int a[]={10,-20,30,-40,-50};
    	int find=30;
    	int actual=l.search(a,find);
    	assertEquals(actual,find);
    }
	@Test//zero value
    public void zero()
    {
    	int a[]={10,20,0,40,50};
    	int find=0;
    	int actual=l.search(a,find);
    	assertEquals(actual,find);
    }
	@Test//zero array size
    public void zeroSize()
    {
    	int a[]={};
    	int find=0;
    	int actual=l.search(a,find);
    	assertEquals(actual,find);
    }
}
