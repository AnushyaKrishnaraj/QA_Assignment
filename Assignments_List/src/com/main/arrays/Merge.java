package com.main.arrays;

import java.util.Scanner;

public class Merge {
    public void create2Arrays()
    {
    	Scanner s= new Scanner(System.in);
    	System.out.println("Enter the number of elements in first array");
    	int n=s.nextInt();
    	int a[]=new int[n];
    	System.out.println("Enter each element in the array");
    	for(int i=0;i<n;i++)
    	{
    		a[i]=s.nextInt();
    	}
    	System.out.println("Enter the number of elements in second array");
    	int m=s.nextInt();
    	int b[]=new int[m];
    	System.out.println("Enter each element in the array");
    	for(int i=0;i<m;i++)
    	{
    		b[i]=s.nextInt();
    	}
    	merge2Arrays(a,b);
    }  
	public int[] merge2Arrays(int a[],int b[])
	{
		int c[]=new int[a.length+b.length];
		int i=0;
		for (int j=0;j<a.length;j++)
	     c[i++]	=a[j];	
		for (int j=0;j<b.length;j++)
		     c[i++]	=b[j];
		display(a,b,c);
		return c;
	}
	public void display(int a[],int b[],int c[])
	{
		System.out.println("First Array ");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i] + " ");
		System.out.println();
		System.out.println("Second Array ");
		for(int i=0;i<b.length;i++)
			System.out.print(b[i] + " ");
		System.out.println();
		System.out.println("Merged Array ");
		for(int i=0;i<c.length;i++)
			System.out.print(c[i] + " ");
		System.out.println();
		return;
		
	}
	public static void main(String args[])
	{
		Merge m= new Merge();
		m.create2Arrays();
	}
}
