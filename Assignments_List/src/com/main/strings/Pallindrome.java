package com.main.strings;

public class Pallindrome {
	

	

	public String pallin(String input) {
		String inputReverse=new String();
		 for(int i=input.length()-1;i>=0;i--)
		 inputReverse+=input.charAt(i);
		 
	     if( input.equalsIgnoreCase(inputReverse))
	    	 System.out.println(input +"  :String is a pallindrome");
	     else
	    	 System.out.println(input+ " :string is not a pallindrome");
		 
		return inputReverse ;
		
	}
}
