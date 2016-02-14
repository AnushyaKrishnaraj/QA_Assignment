package com.main.strings;

import java.util.Scanner;

public class ReverseWord {
//	public   String Rword(String line)
//	{
//		Scanner s= new Scanner(System.in);
//		System.out.println("Enter the string input");
//		String line= s.nextLine();


//	}
/*public static void main(String args[])
{
ReverseWord.Rword();
}*/

	public String Rword(String line)
	{
		String w2="";
		{
			String words[]=line.split(" ");
		
		for(String w:words)
		{    
			char w1[]=w.toCharArray();
			if(w2.isEmpty())
				w2=w2;
			else
				w2=w2+" ";
			for(int i=(w1.length)-1;i>=0;i--)
			{
					
			System.out.print(w1[i]);
			w2=w2+w1[i];
			System.out.println(w2);
			}
            

			System.out.println();
	}
		return w2;
		
	}
}
}