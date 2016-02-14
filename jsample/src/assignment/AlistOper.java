package assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class AlistOper {
	public static void main(String args[])
	{   int numbers;int found=0;
		List<Integer> li = new ArrayList<Integer>();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of elements to add");
		int no=s.nextInt();
		for(int i=0;i<no;i++)
		{
			numbers=s.nextInt();
			li.add(numbers);
			
		}
		System.out.println("Enter the number to be searched");
		int search=s.nextInt();
		Iterator<Integer> it= li.iterator();
		while (it.hasNext())
		{
			int elem=it.next();
			if (search==elem)
			{
				System.out.println("Element " + elem +"is found");
				found=1;
			}
		}
			if (found==0)
				System.out.println("Element " + search + "is not found");
			
		
		
		
			it=li.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
	}	
	}


