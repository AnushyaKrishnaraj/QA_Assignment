package com.main.importantConcepts;

public class PrintWithoutLoop {
	public static void Cal(int value)
	{
		if (value<=10)
		{
			System.out.println(value);
			value+=1;
		     Cal(value);
		}
	}
  public static void main(String args[])
  {
	  int value=1;
	 PrintWithoutLoop.Cal(value);
  }
}
