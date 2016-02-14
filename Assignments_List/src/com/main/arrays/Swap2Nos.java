package com.main.arrays;

import java.util.Scanner;

public class Swap2Nos {
	  
	public int[] createArray()
    {  
		  int n=0;
    	Scanner s= new Scanner(System.in);
    	System.out.println("Enter the number of elements in first array");
    	 n=s.nextInt();
    	int a[]=new int[n];
    	System.out.println("Enter each element in the array");
    	for(int i=0;i<n;i++)
    	{
    		a[i]=s.nextInt();
    	}
    	return a;
}
	public void find2nos(int a[])
	{
		int swap1=0;
		int swap2=0,temp=0;
		for(int i=0;i<a.length-1;i++)
			if (a[i]>a[i+1])
			{
				swap1=i;
				System.out.println("swap position1 "+swap1);
		        break;
			}
		for(int j=a.length-1;j>=0;j--)
			if(a[j]<a[j-1])
			{
				swap2=j;
				System.out.println("swap position2" +swap2);
		     break;
			}
		
		
		 temp= a[swap1];
		    a[swap1]=a[swap2];
		    a[swap2]=temp;
		    System.out.println("Array after swapping");
		    for(int i=0;i<a.length;i++)
	    	{
	    		System.out.print(a[i]+" ");
	    	}
		    
			
	}
	public static void main(String args[])
	{
	Swap2Nos sw= new Swap2Nos();

	int a[]=sw.createArray();
	sw.find2nos(a);
	}
}