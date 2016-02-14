package com.main.arrays;

import java.util.Scanner;
// Largest number in an array.
public class LargestNumber {
	
	public void input()
	{//Creating  an array
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int n=s.nextInt();
		int[] a= new int[n];
		System.out.println("Enter the elements in array");
	
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
		largest(a);		
	}
	public void largest(int[] a)
	{
		int large=a[0];
		for(int i=1;i<a.length;i++)
		{
			if (large<a[i])
				large=a[i];
		}
		System.out.println("The largest number in the given array is "
				+ ""+large);
	}
	public static void main(String args[])
	{
		LargestNumber ln= new LargestNumber();
	
	 	ln.input();
	
		
	}
}
