import java.util.Scanner;
public class reversearr {
	public void rarr(int j[],int n)
	{
		//int[] a =new int[10];
		int [] b=new int[10];
		int k=n-1;
		for (int i=0;i<=n-1;i++)
		{
			b[k]=j[i];
			k=k-1;
		}
		for (int i=0;i<=n-1;i++)
		System.out.println(b[i]);
	}
public static void main(String[] args)
{
	reversearr r=new reversearr();
	int[] a= new int[10];
	Scanner s= new Scanner(System.in);
	System.out.println("Enter the array size");
	int n=s.nextInt();
     for(int i=0;i<=n-1;i++)
     {
    	  a[i]=s.nextInt();
     }
     r.rarr(a,n);
     }
	
}

