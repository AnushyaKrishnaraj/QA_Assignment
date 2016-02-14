package com.main.exceptions;


	public class M1 extends MultipleException
	{
		private int d;
		
		public M1(int a, int b, int d2) {


			super(a,b);
			this.d=d2;
		}
		public void calculation() throws ArithmeticException,Exception
		{
		int e=(c-d)/0 ;//throw new ArithmeticException	("Divisble by 0 not possible");
		}
	  public void cal1()
	{
		  System.out.println("The value of c(a+b) :"+ c);
		  
		  return;
	}
	}

