package com.main.arrays;

import java.util.Scanner;
//Missing number in a series
public class MissingNumInSeries {
	
	public static int missing(int a[])
	{//Creating  an array
		int n=a.length+1;
		int expectedSum=(n*(n+1))/2;
		System.out.println(expectedSum);
		int actualSum=0;
		for (int i=0;i<a.length;i++)
			actualSum=actualSum+a[i];
		System.out.println(actualSum);
		int missingNum=expectedSum-actualSum;
		return missingNum;
	}
	public static void main(String args[])
	{
		int a[]={1,2,3,5,6};
	System.out.println("Missing Number is  "+MissingNumInSeries.missing(a));
		
	}
}
