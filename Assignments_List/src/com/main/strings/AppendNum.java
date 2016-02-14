package com.main.strings;

import java.util.Scanner;

//Appending numbers at the end of each word in a string
public class AppendNum {
public  static void split()
{
	Scanner s= new Scanner(System.in);
	System.out.println("Enter the string input");
	String line= s.nextLine();
	String words[]=line.split(" ");
	int i=1;
	for(String w:words)
	{
		System.out.println(w+i);
		i=i+1;
}
}
public static void main(String args[])
{
	AppendNum.split();
}
}