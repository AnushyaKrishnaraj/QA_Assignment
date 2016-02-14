package com.main.oops;


public class OverridingOverloading {

	public static void main(String[] args)
	{
		int res;
	    float res1;
	    Overloading oper= new Overloading();
	    res= oper.add();
		System.out.println("The result of addition is " +res);
		res=oper.add(30,40);
		System.out.println("The result of addition is " +res);
		oper.sub(781,56);
			res=oper.mul(38,100);
		System.out.println("The result of multiplication is " + res);
		res1=oper.div(100, 26);
		System.out.println("The result of division is  "+ res1);
		res=oper.mod(100,26);
		System.out.println("The reminder of the division is  " +res);
				
	}
}


