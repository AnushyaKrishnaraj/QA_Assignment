package com.main.files;

import java.io.File;

public class ListFiles {
	public static void main(String args[])
	{
		File dir=new File("C:\\Users\\anukrsh\\Desktop\\Notepad++");
		File  files[]=dir.listFiles();
		if (files.length==0)
		{
			System.out.println("Directory is empty");
		    		}
		else
		{
			System.out.println("No of files in the directory is " +files.length);
		
		for(File s:files)
		{
			if(s.isFile())
			
				System.out.println(s);
			
		}
		
		}
		
	}
}
