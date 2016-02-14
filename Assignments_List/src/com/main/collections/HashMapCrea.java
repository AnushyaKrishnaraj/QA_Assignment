package com.main.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapCrea {
	public static void main(String args[])
	{//Hash map allows one null key and several null values.The key should be unique but allows
		// duplicates in values.
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(100, "Ram");
		hm.put(101,"sam");
		hm.put(102, "pam");
		hm.put(103, "vam");
		hm.put(104, "null");
		hm.put(null,"jam");
		hm.put(null,"sam");
		hm.put(105, null);
	//Searching the map value  vam.	
		System.out.println("Elements in the hashmap");
		for(Map.Entry<Integer,String> m:hm.entrySet())
			System.out.println("key:  "+ m.getKey() +"   "+" Value : "+m.getValue());
		for(Map.Entry<Integer,String> m:hm.entrySet())
		{
			if (m.getValue()=="vam")
			{
				System.out.println("Element is found");
			System.out.println("key:  "+ m.getKey() +"   "+" Value : "+m.getValue());	
			}
		}
		
	}

}
