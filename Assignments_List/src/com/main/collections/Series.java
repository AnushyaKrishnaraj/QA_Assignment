package com.main.collections;
//changing a1,a2,a3...b1,b2,b3...bn as a1,b1,a2,b2...bn

public class Series {
	public static void main(String[] args)
	{
		int arr[]={1,2,3,4,5,6,7,8,9,11,12,13,14,15,16,17,18,19};
		int n=arr.length-1;
		int i=1;
		for(int start=1;start<n;start++)
		{
			int temp=arr[start];
		    arr[start]=arr[n/2+i];
		for(int no =(n/2+i);no>start;no--)
		{
			arr[no]=arr[no-1];
		}
		start++;
		arr[start]=temp;
	    for(int a:arr)
	    	System.out.print(a+"    ");
	    System.out.println();
		i++;
	}

	}}

	
