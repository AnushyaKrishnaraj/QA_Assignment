package com.main.arrays;

public class LinearSearch {
	public int search(int a[],int searchElem)
	{ int found=0;
    for(int i=0;i<a.length;i++ )
    {
    	if (a[i]== searchElem)
    		found= a[i];
    	System.out.println("The element is found");
    }
   return found; 
}
}