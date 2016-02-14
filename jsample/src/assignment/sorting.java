package assignment;

public class sorting {
	public void sort()
	{int a[]={45,78,89,56,46,84,59,98,0};
		
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
				System.out.println();
				}
				
			for (int i=0;i<a.length;i++)
				System.out.println(a[i]);
	}
	public static void main(String[] args)
	{
	sorting m =new sorting();
	m.sort();
	}
	}



