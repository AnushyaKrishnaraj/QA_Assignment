package com.main.exceptions;

public class M2 {
public static void main(String args[])
{
	M1 arg=new M1(5,10,3);
	try
	{
	arg.calculation();
	arg.cal1();
	}catch(ArithmeticException e)
	{   
		System.out.println("Try a non zero value for the divisor");
		e.printStackTrace();
	}
   catch(Exception e1)
	{
	   System.out.println("please try with different values");
	}
	arg.cal1();
}
}
