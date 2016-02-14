package assignment;

import java.util.Random;
import java.util.Scanner;

public class guessgame {

	public static void main(String[] args)
	{
		Random r = new Random();
		
		Scanner s=new Scanner(System.in);
		String match="not found";
		int count=0;int prev=0;
		int guessedno=r.nextInt(100);
		while (match=="not found")
		{
			
		System.out.println("Enter Your Guess");
		int myguess= s.nextInt();
		if (myguess==guessedno)
		{
			match="found";
		}
		else if (myguess< guessedno)
		System.out.println("Guess a larger number");
		
		
		else
			System.out.println("Guess a smaller number");
		if (prev!=myguess)
			count++;
		prev=myguess;
		}
	System.out.println( "Your guess " + guessedno + "  is right!!!!" );
	System.out.println("The number of tries=  " + count);
	s.close();
	}
	
}
