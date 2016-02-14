package com.main.exceptions;

public class MultipleException {
	 int a1;
	 int b1;
	int c;
	
    public MultipleException(int a2, int b2)
    {
    	 a1=a2;
 		b1=b2;
 		System.out.println(a1+b1);
 		add(a1,b1);
		
	}
	public void add(int a,int b)
    {
		
     c=a+b;
    
  
    }
}



