package com.main.importantConcepts;

import java.util.Scanner;

public class AccessmodifiersEx {
	int a;//default
	private int b;
	public int  c;
	protected int d;
	public int sum,difference;
	Scanner s= new Scanner(System.in);
	// default method
	void input()
	{   
		System.out.println("Enter the value of a");
		a=s.nextInt();
		System.out.println("Enter the value of b");
		b=s.nextInt();
		System.out.println("Enter the value of c");
		c=s.nextInt();
		System.out.println("Enter the value of d");
		d=s.nextInt();
		
	}
	// private method
	
	private int add()
	{ 
		 sum=a+b;
		return sum;
	}
   // public method
	public int diff()
	{
		 difference=c-d;
		 return difference;
	}
	protected int displaySum()
	{
		//System.out.println("sum :"+(a+b));
		return (a+b);
	}
	int displayDiff()
	{
	
		//System.out.println("Difference : " +difference);
		return (difference);
	}
}
