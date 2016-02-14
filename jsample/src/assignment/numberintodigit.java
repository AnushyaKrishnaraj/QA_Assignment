package assignment;
import java.util.Scanner;
public class numberintodigit {
	int arr[] =new int[10];
	int i=0;
	public void intodigit(int num)
	{
		while (num !=0)
		{
		arr[i]=(num%10);
		num=num/10;
		i++;
		
		}
		for(int j=i-1;j>=0;j--)
		{
			System.out.println(arr[j]);
		}
		
	}
public static void main(String args[])
{
	numberintodigit n=new numberintodigit();
	
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number");

	int num=s.nextInt();
	n.intodigit(num);
	
	s.close();
}
}
