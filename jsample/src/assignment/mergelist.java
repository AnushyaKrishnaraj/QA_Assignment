package assignment;
public class mergelist {
public void merge()
{int a[]={45,78,89,56,46,84,59,98,0};
int b[]={36,67,54,48,89,90,66};	
int c[]=new int [40];
			for (int i=1;i<a.length;i++)
			{
			
			for(int j=0;j<a.length-i;j++)
			{
				if (a[j]>a[j+1])
				{
					int swap=a[j];
					a[j]=a[j+1];
					a[j+1]=swap;
				}
				
			}
			
			}
			
		for (int i=0;i<a.length;i++)
		{c[i]=a[i];
			System.out.print(a[i]+ "  ");
		}
		int k=a.length;
		for (int i=1;i<b.length;i++)
		{
		
		for(int j=0;j<b.length-i;j++)
		{
			if (b[j]>b[j+1])
			{
				int swap=b[j];
				b[j]=b[j+1];
				b[j+1]=swap;
			}
			
		}
		
		}
		System.out.println();
		for(int i=0;i<b.length;i++)
		{
			c[k]=b[i];
		    k=k+1;
			System.out.print(b[i]+ "  ");
		}
		System.out.println();
		System.out.println("THE MERGE LIST");
		for(int i=0;i<=k;i++)
		{
			System.out.print(c[i]+ "  ");
		}
			
}
public static void main(String[] args)
{
mergelist m =new mergelist();
m.merge();
}
}
