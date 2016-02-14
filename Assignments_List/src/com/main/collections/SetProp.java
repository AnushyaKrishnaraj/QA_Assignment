package com.main.collections;

import java.util.HashSet;
import java.util.Set;

public class SetProp {
	public static void main(String args[])
	{  //
		int a[]={10,20,30,15,25,35,10,20,46,78};
		Set<Integer> s= new HashSet<Integer>();
		System.out.println("Elements in the array to be inserted in the set");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i] +" ");
		System.out.println();
		for(int i=0;i<a.length;i++)
		{	if (!(s.add(a[i])))
					System.out.println("Duplicate element is "+a[i]);
		}	
	
		System.out.println("Duplicates are automatically removed");
		for(int i:s )
		{   
			System.out.print(i +" ");
		}
		
		
	}

}
