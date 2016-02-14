package assignment;

public class reversearr {
	
public void reverse(int a[])
{ int n=a.length;
int end=n-1;
	int[] b= new int[n];
	for (int i=0;i<n;i++)
	{		b[end]=a[i];
	end=end-1;
	}
	for (int i=0;i<n;i++)
		System.out.println(b[i]);

}
public static void main(String[] args)
{
reversearr r=new reversearr();
int a[]={10,40,65,43,72,54};
r.reverse(a);

}
}
