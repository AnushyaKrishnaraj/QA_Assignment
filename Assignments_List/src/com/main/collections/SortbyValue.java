package com.main.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SortbyValue
{
	public   static void main(String[] args)
	{
		Map<String,Integer> hm= new HashMap<String,Integer>();
		hm.put("jackfruit",105);
				
		hm.put("orange",103);
		hm.put("apple",100);
		hm.put( "mango",102);
		hm.put( "pineapple",101);
		hm.put( "blueberry",104);
		System.out.println("Unsorted order");
		System.out.println("key               " +" value         "); 
		for(Map.Entry<String,Integer> me :hm.entrySet())
		System.out.println(me.getKey()+"       "+me.getValue());
		System.out.println("Sorted order");
		Map<String,Integer> shm=sorting1(hm);
		for(Map.Entry<String, Integer> me :shm.entrySet())
			System.out.println(me.getKey()+"       "+me.getValue());
		
	}

	private static Map<String,Integer> sorting1(Map<String, Integer> hm)
	{
	List<Map.Entry<String,Integer>> llist=new LinkedList<Map.Entry<String,Integer>>(hm.entrySet());
		Collections.sort(llist, new Comparator<Map.Entry<String,Integer>>()
				{
			public int compare(Map.Entry<String,Integer> obj1,Map.Entry<String,Integer> obj2)
			{
			 return(obj1.getValue().compareTo(obj2.getValue())) ;       
			
			}	
			});
		
				


	 Map<String,Integer> shm=new LinkedHashMap<String,Integer>();
	 for (Iterator<Map.Entry<String,Integer>> itr= llist.iterator(); itr.hasNext();)
	 {
		Map.Entry<String,Integer> entry=itr.next();
		shm.put(entry.getKey(), entry.getValue());
			 
		 
	 }
return shm;
}}

