package string;

import java.util.Scanner;

public class pallindrome {
	public static void main(String[] args)
	{
		String original,reverse;
		reverse="";
		System.out.println("Enter the string");
		Scanner s=new Scanner(System.in);
		original=s.nextLine();
		System.out.println(original);
		int length1=original.length();
		for(int i=length1-1;i>=0;i--)
		{
			reverse=reverse+(original.charAt(i));
		}
		System.out.println(reverse);
		if (original.equalsIgnoreCase(reverse))
		   System.out.println("This is a palindrome");
		else
			System.out.println("This is not a palindrome");
				
	}
}
