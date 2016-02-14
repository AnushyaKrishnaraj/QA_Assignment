import java.util.Scanner;
public class vararray {
	public static void main(String args[])
	{
		Scanner num=new Scanner(System.in);
		int v=num.nextInt();
		System.out.println("The factorial is "+ variablefact(v));
	}

	public static int variablefact(int numbe)
	{
		int fact=1;
	for (int i=1;i<=numbe;i++)
		 {fact=fact*i+5;
	
	System.out.println (fact);}
	return fact;
	
	}
}


