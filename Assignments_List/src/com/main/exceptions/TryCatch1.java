package com.main.exceptions;

public class TryCatch1 {
	public static void main(String args[])
	{
		TryandCatch tc= new TryandCatch();
		try
		{  String str=null;
			tc.stringEmpty(str);
		}catch (NullPointerException ne)
		{
			System.out.println("The string is assigned null");
			ne.printStackTrace();
			return;
		}
		finally
		{
			System.out.println("Try again by assigning different values to string other than null");
			String Str="hello";
			tc.stringEmpty(Str);
		}
	}
}
