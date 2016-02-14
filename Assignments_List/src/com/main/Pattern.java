package com.main;
//pattern of *
import java.util.Scanner;

public class Pattern {
public static void design(int n)
{
	for (int i=1;i<=n;i++)
	{
		System.out.println();
	for(int j=1;j<=i;j++)	
	
		System.out.print("*");
	}
	//System.out.println();
}
public static void main(String args[])
{
	Scanner s= new Scanner(System.in);
	int n= s.nextInt();
	Pattern.design(n);
}
}
