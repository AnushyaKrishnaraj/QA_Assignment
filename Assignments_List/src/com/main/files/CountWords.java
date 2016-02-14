package com.main.files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CountWords {
	public static void main (String[] args) throws IOException
	{
		try {
			FileWriter fw = new FileWriter(new File("Hi5.txt"),false);
			BufferedWriter bw= new BufferedWriter(fw);
			bw.write("Hi, How are you" );
			bw.newLine();
			bw.write("It is an awesome day");
			bw.newLine();
			bw.write("Enjoy your day");
			bw.newLine();
			bw.write("I hope you are having fun");
			System.out.println("sucess");
			bw.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		FileReader fr;
		BufferedReader br;
		try
		{
	     fr= new FileReader("Hi5.txt");
	     br= new BufferedReader(fr);
	    int count=0;String line;
			while((line=br.readLine())!=null)
			{
				String words[]=line.split(" ");
				for(String s:words)
					count++;
			}
		System.out.println("number of words in the file is " +count);
	}catch (FileNotFoundException e)
	{
	}

}
}