package com.test.arrays;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.AssertJUnit.assertEquals;
import org.testng.annotations.BeforeSuite;


import com.main.arrays.Sorting;

public class SortTest {
	 Sorting s;
@BeforeSuite
public void declare()
{
 s= new Sorting();
}

@Test
public void positive(){
	int a[]={10,20,15,18,30,29,36,32};
	int b[]= {10,15,18,20,29,30,32,36};
	AssertJUnit.assertArrayEquals(b,s.sort(a));
}
@Test
public void negative(){
	int a[]={-10,-20,-15,-18,-30,-29,-36,-32};
	int b[]= {-36,-32,-30,-29,-20,-18,-15,-10};
	AssertJUnit.assertArrayEquals(b,s.sort(a));
}
@Test
public void mixed()
{
	int a[]={-10,-20,15,-18,30,-29,-36,32};
	int b[]= {-36,-29,-20,-18,-10,15,30,32};
	AssertJUnit.assertArrayEquals(b,s.sort(a));
}
@Test
public void empty()
{
	int a[]={};
	int b[]= {};
	assertEquals("Array is empty",0,a.length);
}
@Test
public void nullvalue()
{try
{
	int a[]=null;
	int b[]=null;
	assertEquals("Array is empty",0,a.length);
}catch(NullPointerException e)
{
	System.out.println("The array is null");
	//System.out.println(e.getMessage());
	e.printStackTrace();
}
}
}
