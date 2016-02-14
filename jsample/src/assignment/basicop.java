package assignment;

public class basicop {
	int num1;
	float num2;
	public int add(int a, int b)
	{
		System.out.println("The value of a is " + a);
		System.out.println("The value of b is " + b);
	    num1=a+b;
	    return num1;
	}
	public int sub(int a, int b)
	{
		System.out.println("The value of a is " + a);
	    System.out.println("The value of b is " + b);
		num1= a-b;
		return num1;
	}
	public int mul(int a,int b)
	{
		System.out.println("The value of a is " +a);
		System.out.println("The value of b is " +b);
		num1=a*b;
		return num1;
	}
	public float div(int a ,int b)
	{
		System.out.println("The value of a is " +a);
		System.out.println("The value of b is " +b);
		num2=a/b;
		return num2;
	}
	public int mod(int a ,int b)
	{
		System.out.println("The value of a is " +a);
		System.out.println("The value of b is " +b);
		num1=a%b;
		return num1;
	}
	public static void main(String[] args)
	{
		int res;
	    float res1;
	    basicop oper=new basicop();
		res= oper.add(5764,4321);
		System.out.println("The result of addition is " +res);
		res=oper.sub(781,56);
		System.out.println("The result of subtraction is " + res);
		res=oper.mul(38,100);
		System.out.println("The result of multiplication is " + res);
		res1=oper.div(100, 26);
		System.out.println("The result of division is  "+ res1);
		res=oper.mod(100,26);
		System.out.println("The reminder of the division is  " +res);
				
	}
}
