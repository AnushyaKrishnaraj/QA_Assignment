package assignment;

public class commonelem {
public void common(int a[],int b[])
{
	for(int i=0;i<a.length;i++)
		for(int j=0;j<b.length;j++)
			if (a[i]==b[j])
				System.out.println(a[i]);
}
public static void main(String args[])
{
	commonelem c= new commonelem();
    int a[]={1,2,3,4,5};
    int b[]={2,3,1,0,5};
    c.common(a, b);
}
}

