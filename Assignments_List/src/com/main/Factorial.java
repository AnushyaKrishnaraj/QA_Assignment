package com.main;
//Factorial of a number
public class Factorial {
	public static int  fact(int n)
	{
	     
	     int fact=1;
		 for (int i=1;i<=n;i++)
			fact=fact*i;
		System.out.println("The factorial of  " +n + "  is "+ fact);
		return fact;
	 
	}
 
				
	public static int factRecursive(int n)
		
	{	
    	int result;
    
    	if (n<=1)
    		return 1;
    	else
    	result= fact(n-1)*n;
    	System.out.println("The factorial of  " +n +"  is " +result);
    
    	   	return result;
		}
	
}
  /*  public static void main(String args[])
    {
    	Factorial.fact(-5);
    	int result=Factorial.factRecursive(5);
    	System.out.println("The factorial of  " +5 +"  is " +result);
    }*/

