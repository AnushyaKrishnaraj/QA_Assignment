package com.main.files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile {

public static void main(String args[]) throws IOException
{ 
	BufferedReader br=null;
	BufferedWriter newbr=null;
	String line;
	try
	{
		 br= new BufferedReader(new  FileReader("C:\\Users\\anukrsh\\Documents\\hi1.txt"));
		 newbr=new BufferedWriter(new FileWriter(new File("c:\\users\\anukrsh\\Documents\\hi51.txt")));
		while((line=br.readLine())!=null)
		{
			newbr.write(line);
			newbr.newLine();
		}
		System.out.println("The file has been copied succesfully");
		br.close();
		newbr.close();
		
	}catch( FileNotFoundException e)
	{
		e.printStackTrace();
	}
}
}