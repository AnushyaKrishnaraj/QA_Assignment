package assignment;
import java.util.Scanner;
public class prime {
public int primeno(int n)
{
	int result=1;
	for(int i=2;i<=n/2;i++)
	{
		if (n%i == 0)
		{
		     result=0;
		     break;
		}
	
	
	}
	return result;
}
public static void main(String[] args)
{
	prime p =new prime();
	Scanner n=new Scanner(System.in);
	int k =n.nextInt();
	int r=p.primeno(k);
	if (r==0)
	 System.out.println("The number is not a prime number");
	else
		System.out.println("The number is a prime number");
}
}


