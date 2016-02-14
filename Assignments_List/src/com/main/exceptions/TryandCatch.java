package com.main.exceptions;

public class TryandCatch {
	
	public void stringEmpty(String str) throws NullPointerException{
		

		System.out.println("Before doing any operation on Null");
		 if(str.isEmpty()) throw  new NullPointerException("handeled later");
		 System.out.println("After doing operation on null string");
		System.out.println("The null is equal to empty(true/false) :"+ str.isEmpty());
			
	}

}