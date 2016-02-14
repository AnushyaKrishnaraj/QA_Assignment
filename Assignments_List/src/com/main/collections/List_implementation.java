package com.main.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class List_implementation {
	public static void main(String args[])
	{//Arraylist maintain the order of insertion and allows duplicates
		ArrayList<Integer> al= new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(10);
		// Search for an element in the array list
		int j=0;
		for(int i:al)
		{
			if(i==10)
			{
			System.out.println("Element is present in the list at the position "+j);
			
			}
			j++;
		}
		//display using iterator
		Iterator<Integer> itr=al.iterator();
		System.out.println("Elements in the list");
		while(itr.hasNext())
			System.out.println(itr.next());
		System.out.println("Elements displayed in the insertion order");
		ListIterator<Integer> litr= al.listIterator();
		while(litr.hasNext())
			System.out.println(litr.next());
		System.out.println("Elements displayed in the reverse order");
		while(litr.hasPrevious())
			System.out.println(litr.previous());
		
	}

}
