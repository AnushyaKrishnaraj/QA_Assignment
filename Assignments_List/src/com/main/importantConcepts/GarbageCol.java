package com.main.importantConcepts;
//A program to show the explicit garbage collection
public class GarbageCol {
	
	public static void main(String args[])
	{
		Runtime mem= Runtime.getRuntime();
		System.out.println("Total memory space  " + mem.totalMemory());
		System.out.println("Memory space before gc :" + mem.freeMemory());
		System.gc();
		System.out.println("Memory space after gc :  "+ mem.freeMemory());
	}

}
