package com.main.arrays;
//Common numbers in two arrays
public class CommonNumbers {
public void compare(int a[], int b[])
{   
	int k=0;
	for (int i=0;i<a.length;i++)
	for(int j=0;j<b.length;j++)
	{
		if(a[i]==b[j])
		System.out.println(a[i]);
	
	} 
}
	public static void main(String args[])
	{
		CommonNumbers num=new CommonNumbers();
	int a[]={26,32,65,45,34,98};
	int b[]={32,78,45,98,82};
	num.compare(a, b);;
	}
}
