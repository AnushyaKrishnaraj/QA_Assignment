package com.main.files;

import java.io.BufferedReader;
import java.io.Console;
import java.io.DataInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class DiffFilehandling {
	public void add()
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the auggend");
		int a=s.nextInt();
		System.out.println("Enter the addend");
		int b=s.nextInt();
		int c=a+b;
		System.out.println("The summation of two scanner inputs :"+ c);
		
	}
   public void sub()
   {
	   BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	   try
	   {
		   System.out.println("Enter the minuend");
	   
	         int a=Integer.parseInt(br.readLine());
	         System.out.println("Enter the subtrahend");
	         int b=Integer.parseInt(br.readLine());
	         int c=a-b;
	         System.out.println("The difference is  " +c);
	         
	   }catch (Exception e)
	   {
		   e.printStackTrace();
		   
	   }
	  
   }
   
   public void mul() 
   {
	   DataInputStream ds=new DataInputStream(System.in);
	   try
	   {
	   System.out.println("Enter the multiplicand");
	   int a=ds.readInt();
	   System.out.println("Enter the multiplier");
	   int b=ds.readInt();
	   int c=a*b;
	   System.out.println("Product of the number is "+c);
	   
	   }catch (Exception e)
	   {
		   e.printStackTrace();
	   }
		   
   }
 /*  public void div()
   {
	   Console cs=System.console();
	   System.out.println("Enter the Dividend");
	   String s1=cs.readLine();
	   int a=Integer.parseInt(s1);
	   System.out.println("Enter the divisor");
	   int b=Integer.parseInt(cs.readLine());
	   int c=a/b;
	   System.out.println("Quotient of the number is "+c);
	 
			   
   }*/
   public static void main(String args[])
   {
	   DiffFilehandling d=new  DiffFilehandling();
	   d.add();
	   d.sub();
	   d.mul();
//	   d.div();
   }
   
}
