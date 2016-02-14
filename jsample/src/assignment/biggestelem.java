package assignment;
import java.util.Scanner;
public class biggestelem {
	public void createarr(int n)
	{
int arr[]= new int[20];
Scanner s1= new Scanner(System.in);
for(int i=0;i<=n-1;i++)
	arr[i]=s1.nextInt();
System.out.println("biggest number in an array is :" + Search(arr));
	}

public int  Search(int b[])
{

int big=b[0];
	for (int i=0;i<b.length-1;i++)
	{
		if (b[i]>big)
		big=b[i];
	}
return big;
}
public static void main(String[] args)
{
	Scanner s1= new Scanner(System.in);
	 System.out.println("Enter the size of the array");
	 int size=s1.nextInt();
	 
	biggestelem e1= new biggestelem();
	e1.createarr(size);
}
}
