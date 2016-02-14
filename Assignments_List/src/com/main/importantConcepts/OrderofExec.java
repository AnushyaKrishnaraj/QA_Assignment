package com.main.importantConcepts;
// A pgm to  display the order of static block,method and constructor
public class OrderofExec {
     OrderofExec()
	{
      System.out.println("Constructer is executed second");
	}
  static
    {
    	 System.out.println("Static block is executed first");
    	 
     }
     public static void display()
     {
    	 System.out.println("static method is executed third");
     }
     public static void main(String args[])
     {
    	OrderofExec ofe=new OrderofExec();
    	OrderofExec.display();
     }
}
