
package com.test;


import static org.testng.AssertJUnit.assertEquals;

import org.testng.annotations.Test;
import java.util.Scanner;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;


import com.main.PingPong;

public class PingPongTest {

	Scanner s;
	int n;
	String actual;
	@BeforeSuite
	public void decl()
	{
		
		s=new Scanner(System.in);
	}
	
	@Test
	//divisible by 3
	public void div3()
	
	{
		System.out.println("Enter the number divisible by 3");
		n=s.nextInt();
	   actual=PingPong.game(n);
		assertEquals(actual,"Ping");
		
	}
	@Test
public void div5()
{System.out.println("Enter the number divisible by 5");
n=s.nextInt();
	actual=PingPong.game(n);
	assertEquals(actual,"Pong");
	
}
@Test
public void div3and5()
{
	System.out.println("Enter the number divisible by 3 & 5");
	n=s.nextInt();
actual=PingPong.game(n);
assertEquals(actual,"PingPong");
}
@Test
public void notdiv()
{
	System.out.println("Enter the number not divisible by 3 or 5");
	n=s.nextInt();
actual=PingPong.game(n);
assertEquals(actual,"lost");
}
@Test(enabled=false)
public void Zero() throws Exception
{
	System.out.println("Enter zero");
	n=s.nextInt();
throw new Exception();

}
}
