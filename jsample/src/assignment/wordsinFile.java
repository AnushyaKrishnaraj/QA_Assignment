package assignment;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class wordsinFile {
public static void main(String args[])
{   int count=0;
    String str;
    
	FileReader f= null;
	try {
		f = new FileReader("c:\\windows\\hi.txt");
	} catch (FileNotFoundException e) {
		// TODO Auto-generaed catch block
		e.printStackTrace();
	}
	BufferedReader b= new BufferedReader(f);
	try {
		while ((str=b.readLine())!= null)
		{
			String str1[]=str.split(" ");
			for (String w:str1)
			{
				count++;
				
			}
				
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("Number of words in a file is "  + count);
}
}
