package assignment;


import java.util.Scanner;

public class piglatin {
	

	public static void main(String args[])
	{
		Scanner s= new Scanner(System.in);
	
	System.out.println("Enter the string");
	String str=s.nextLine();
	

	String words[]=str.split(" ");
	for (String w:words)
	{
	//System.out.println(w.length());
				{
			System.out.println(w.substring(1)+w.substring(0,1)+"ay");
		}
	
	}s.close();
}
}