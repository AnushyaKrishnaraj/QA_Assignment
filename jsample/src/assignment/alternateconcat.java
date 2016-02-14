package assignment;

public class alternateconcat {
public void alternate(int a[],int b[])
{
	int c[]= new int[100];
	int count=0;
	int i;
	for( i=0;i<a.length;i++)
	{
		c[count]=a[i];
	count+=2;
	}	
	count=1;
	for( i=0;i<b.length;i++)
	{
		c[count]=b[i];
	count+=2;
	}
	
	for ( i=0;i<count-1;i+=2)
	System.out.println(c[i] +" " +c[i+1]);
}

public static void main(String[] args)
{
	alternateconcat cat1 =new alternateconcat();
	int a[]={20,30,40};
	int b[]={45,70,80,90,100};
	cat1.alternate(a, b);
}
}
