package com.main;
// This program is to validate if a number is armstrong?
import java.util.Scanner;

public class ArmstrongNumber {
public double armstrong(int n)
{
	double armno=0;double s=0;
	while(n!=0)
	{
	 s=n%10;
	armno=armno+Math.pow(s,3);
	n=n/10;
	}
	
  	return armno;
     }
public  static  void main(String args[])	
{
	ArmstrongNumber an=new ArmstrongNumber();
	Scanner s= new Scanner(System.in);
	System.out.println("Enter the number to be checked for Armstrong");
	int n=s.nextInt();
	double expected=an.armstrong(n);
	if( expected==n)
		System.out.println(n +"  is an armstong number");
	else
		System.out.println(n +" is not an armstrong number");
}

}
