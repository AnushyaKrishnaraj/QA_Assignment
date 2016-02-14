package jsample;
import java.util.Scanner;
public class avg {
public static void main(String args[])
{
	int num =0;
	int n,m;
	Scanner v=new Scanner(System.in);
	System.out.println("Enter the total nuumbers");
	m=v.nextInt();
	System.out.println("enter the numbers");
	for(int i=1;i<=m;i++)
	{
		
	n=v.nextInt();
	num=num+n;	
	}
	float avg =num/m;
	System.out.println("Average : " + avg);
}
}
