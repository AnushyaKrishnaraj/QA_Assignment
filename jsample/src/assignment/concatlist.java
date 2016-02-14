package assignment;

import java.util.Arrays;

public class concatlist {
	public void conca(){
		/*int n=a.length;
		int n1=b.length;
		int[] c=new int[n+n1];
		for (int i=0;i<n;i++)
			c[i]=a[i];
		for (int i=0;i<n1;i++)
		{
			c[n]=b[i];
			n++;
		}
		return c;
	}*/
	int a[]={10,20,30,40,50};
	 int b[]={60,70,80};
	 int c[]=new int[a.length+b.length];
	 System.arraycopy(a, 0,c, 0, a.length);
	 System.arraycopy(b, 0, c, a.length, b.length);
	 System.out.println(Arrays.toString(c));
	 
}
public static void main(String[] args)
{
 concatlist list =new concatlist();
 list.conca();
 
}
}
