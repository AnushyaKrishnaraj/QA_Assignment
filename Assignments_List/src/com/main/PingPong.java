package com.main;
// ping pong game depending on divison by 3 and 5
public class PingPong {

public static String game(int n)
{

		
	if ((n%3==0)&&(n%5==0))
	{
		System.out.println("PingPong");
		return ("PingPong");
	}
	else if (n%3==0)
	{
    	System.out.println("Ping");
	    return ("Ping");
	}
	else if (n%5==0)
	{
		System.out.println("Pong");
	
	    return ("Pong");
	}
	else
		{System.out.println("The number is not divisible by 3 or 5 " +n);
		return ("lost");
		}
		
	
}

}
