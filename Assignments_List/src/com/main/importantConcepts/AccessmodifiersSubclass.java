package com.main.importantConcepts;

public class AccessmodifiersSubclass extends AccessmodifiersEx {
	public  void access()
	
	{   System.out.println(" Data members access");
	    System.out.println("=====================");
		System.out.println("The default variable a value: " +a);
		//System.out.println("The private variable b value: " +b);
	// The private variable b is not visible for its subclass within the same package
	    System.out.println(" The parent class private variable b is not accessible");
		System.out.println("The public variable c value: " +c);
		System.out.println("The protected variable d value: " +d);
	}


	public static void main(String args[])
	{
		AccessmodifiersSubclass ex= new AccessmodifiersSubclass(); 
		ex.input();
		ex.access();
		System.out.println("Method access");
		System.out.println("=============");
		 // int  x= ex.add();
		System.out.println(" The private method add() is not accessible outside the class and subclass");
   
   System.out.println(" The public method diff() is  accessible outside the class and subclass"+ex.diff());
   System.out.println(" The protected method() is accessible outside the class and subclass"+ex.displaySum());
   System.out.println(" The default method() is accessible outside the class and subclass"+ex.displayDiff());
     
   
}
}