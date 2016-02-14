package assignment;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class LIterator {
	public static void main(String args[])
	{ 
	    
		List<Integer>li=new LinkedList<Integer>();
	
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number of elements  to be added");
		int n=s.nextInt();
		System.out.println("Enter the numbers");
		for(int i=0;i<n;i++) 
		{
		 Integer elem=s.nextInt();
		li.add(elem);
		
		}
		ListIterator<Integer>litr=li.listIterator();
		while (litr.hasNext())
		{
			Object elem=  litr.next();
			System.out.println(elem);
			
		}
		System.out.println(" The linked list is displayed in reverse ordes");
		while (litr.hasPrevious())
			
		{
			Object elem= litr.previous();
			System.out.println(elem);
			
		}
	}

}
