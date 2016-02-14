package com.main.collections;

import java.util.ArrayList;
import java.util.List;

public class ListToArray {
	public static void main(String args[])
	{
		List<String> al= new ArrayList<String>();
		al.add("dog");
		al.add("cat");
		al.add("rat");
		al.add("monkey");
		al.add("elephant");
		al.add("hippo");
		System.out.println("ArrayList");
		System.out.println(al);
		String arr[]=new String[al.size()];
		System.out.println("Array");
		al.toArray(arr);
		for(String s:arr)
		System.out.println(s);
	}

}
