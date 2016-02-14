package assignment;

import java.util.Scanner;

public class oddindex {
	 Scanner s= new Scanner(System.in);
	int a[]=new int[25];
	public  void create()
	{
	System.out.println("Enter the length of array");	
	int  n= s.nextInt();
	System.out.println("Enter the array elements");
	for(int i=0;i<n;i++)
	{
	a[i]=s.nextInt();	
	}
	oddindex.display(a, n);
	}
	
    public static void display(int a[],int n)
    {
    	for(int i=1;i<n;i=i+2)
    		System.out.println(a[i]);
    }
    public static void main(String[] args)
    {
    	oddindex o= new oddindex();
    	o.create();
    }
}
