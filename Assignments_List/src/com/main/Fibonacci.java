package com.main;

//Fibonacci series
public class Fibonacci
{
	
public int Series(int n)
{
int first=1,second=1;	
int result=0;
int sum=first+second;
System.out.println("The Fibonacci Series");

if (n<=0)
{
	System.out.println(0);
return 0;
}
else if(n==1)
	{
		System.out.println(first);
		return first;
	}
	else if (n==2)
	{
	System.out.println(first+" "+second);
	
	return sum;
	}
System.out.print(first+"  "+second);
for(int i=3;i<=n;i++)
{
	result=first+second;
	first=second;
	second=result;
	sum+=result;
	System.out.print("  "+result);
	
}
return sum;
}
/*public static void main(String[] args)
{
	Fibonacci fib=new Fibonacci();
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the sequence number");
	int n=s.nextInt();
	fib.Series(n);
}*/

}











