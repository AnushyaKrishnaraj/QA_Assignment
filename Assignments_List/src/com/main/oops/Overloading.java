package com.main.oops;
/* add() and add( int a,int b) is  used to explain overloading
 *  Overloading and OverRiding  classes use the same method name int add() to
 *  explain the overriding.
 */
public class Overloading extends OverRiding{
	int num1;
	float num2;
	public int add()
	{     int a=100,b=200;
	    System.out.println("child class method (overriding)");
		System.out.println("The value of a is " + a);
		System.out.println("The value of b is " + b);
	    num1=a+b;
	    return num1;
	}
	
	public void sub(int a, int b)
	{ 
	
	    System.out.println("The value of a is " + a);
	    System.out.println("The value of b is " + b);
	    num1=a-b;
		System.out.println("The value of subtraction is " +num1);
	   return ;
	}
	public int mul(int a,int b)
	{
		System.out.println("The value of a is " +a);
		System.out.println("The value of b is " +b);
		num1=a*b;
		return num1;
	}
	public float div(int a ,int b)
	{
		System.out.println("The value of a is " +a);
		System.out.println("The value of b is " +b);
		num2=a/b;
		return num2;
	}
	public int mod(int a ,int b)
	{
		System.out.println("The value of a is " +a);
		System.out.println("The value of b is " +b);
		num1=a%b;
		return num1;
	}
	public int add(int a, int b) {
		System.out.println("(overloading)");
		System.out.println("child class method");
		System.out.println("The value of a is " + a);
		System.out.println("The value of b is " + b);
	    num1=a+b;
	    return num1;
	
	
	}

	
}


