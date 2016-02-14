package com.main;
//Check a number is prime or not
import java.util.Scanner;

public class Primeno {
	public boolean prime(int num)
	{ 
	
		if (num==1)
		{
			return true;
		}
		
		else
			for(int i=2;i<=num/2;i++)
				if(num%i==0)
				{
				
					return false;
				}
					
	     return true;	
	}
public static void main(String args[])
{
	Primeno p= new Primeno();
	Scanner s= new Scanner(System.in);
	System.out.println("Enter the number");
	int num=s.nextInt();
	
	boolean result=p.prime(num);
	if (result==true)
			System.out.println(num +"  is a prime number");
		
	else
		System.out.println( num + " is not a prime number");
}

}


