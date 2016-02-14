package com.main.oops;
// parent class [Overriding ]methods add() and subtract(int a,int b) are overriden
//by child class [overloading] methods.
public class OverRiding {
	public int add()
	{  
		int a=200;
		int b=400;
		System.out.println("Parent class method");
		System.out.println("The value of a is " + a);
		System.out.println("The value of b is " + b);
	    return(a+b);
	}
	
	public void sub(int a, int b)
	{
		System.out.println("parent class method");
		System.out.println("The value of a is " + a);
	    System.out.println("The value of b is " + b);
		System.out.println("The value of subtraction  is " + (a-b));
		int c=a-b;
		return;
		
	}
}
