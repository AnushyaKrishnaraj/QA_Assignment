package com.main.arrays;

public class Sorting {
	public int[] sort(int a[])
	{   int temp;
	    
	    	
	    
		for (int i=1;i<a.length;i++)
			for(int j=0;j<a.length-i;j++)
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				
				}
   for(int b1:a)
    {
    	System.out.println(b1);
    }
   return a;
	
	}
	
	public static void main(String args[])
	{
		Sorting s= new Sorting();
		int a[]={10,20,15,18,30,29,36,32};
		s.sort(a);
		
	}
}
