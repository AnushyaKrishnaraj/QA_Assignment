package com.main.strings;
//Reversing a given string
public class ReverseString {
	/*public static String get_string()
	{
		Scanner s= new Scanner("system.in");
        System.out.println("Enter the string to be reversed");
		String word=s.next();
		return word;
		
	   	
    }*/

	public String reverse(String word) 
	{
		System.out.println("the given string is : " +word);
    	String reverse1=new String();
    	
    	for (int i=word.length()-1;i>=0;i--)
    	{   
   
    	 reverse1= reverse1 +word.charAt(i);
    	}
    	System.out.println("The reversed string is : " + reverse1);
    	return reverse1;
		
	}
   
}
