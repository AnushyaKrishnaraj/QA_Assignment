package com.main.files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SearchStr {
	public static void main(String args[]) throws IOException
	{   int count=0;
		FileReader fr;
		BufferedReader br;
		String line;
		try
		{
			fr= new FileReader("Hi5.txt");
			br= new BufferedReader(fr);
			while( (line=br.readLine())!=null)
			{
				if (line.contains("you"))
				count++;
			}
				System.out.println("Number of times You is present in file is " +count);
			br.close();
			fr.close();
		}catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
	}

}
