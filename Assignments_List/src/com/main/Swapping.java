package com.main;
//Swapping 2 numbers using a third variable and without using a third variable
public class Swapping 
{
public int[] swap3Var(int x,int y)
{// swapping two values using third variable
 int z;int num[]=new int[2];
 System.out.println("The value of x, y before interchanging is x= "+x+"  y= "+y);
 
 z=x;
 x=y;
 y=z;
 System.out.println(" The value of x,yafter interchanging is x= "+ x + "  y= " +y);
 num[0]=x;
 num[1]=y;
 return(num);
 
}

public int[] swap2Var(int x, int y)
{

	int z;int num[]=new int[2];
	 System.out.println("The value of x, y before interchanging is x= "+x+"  y= "+y);
	 
	 y=x+y;
	 x=y-x;
	 y=y-x;
	 System.out.println(" The value of x,yafter interchanging is x= "+ x + "  y= " +y);
	 num[0]=x;
	 num[1]=y;
	 return(num);
}	 

/*public static void main(String args[])
{
	Swapping sw= new Swapping();
	sw.swap2Var(-8,-15);
	sw.swap3Var(12,-16);
}
*/



}
