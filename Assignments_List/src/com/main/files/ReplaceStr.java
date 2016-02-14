package com.main.files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReplaceStr {
	public static void main(String args[]) throws IOException
	{
		FileWriter fr;
		BufferedWriter br;
		BufferedReader br1;
	
		String line,newText=" ";
		
		//creating a new file and writing the contents 
		try
		{
			br=new BufferedWriter(new FileWriter(new File("file1.txt"),false));
			br.write("Poem");
			br.newLine();
			br.write("Over the river and through the woods");
			br.newLine();
			br.write("To grandfathers house we go");
			br.newLine();
			br.write("The hourse no the way");
			br.newLine();
			br.write("The horse no to carry the sleigh");
			System.out.println("new file created");
			br.close();
			
		}catch (IOException ie)
		{
			System.out.println("Problem in opening a new file and copying it");
		}
		//Read the file and replace the contents
		try
		{
			br1 = new BufferedReader(new FileReader("file1.txt"));
			while((line=br1.readLine())!= null)
			{
			  if (line.contains("no"))
			  newText+=line.replaceAll("no","know");
			 
			  else
				  newText=newText+line;
			}
			System.out.println("Search has been done");
			br1.close();
		}catch (FileNotFoundException e )
		{
			e.printStackTrace();
		}
	//write the changes to the same file
    try
    {
    	br= new BufferedWriter(new FileWriter("file1.txt"));
        
    	br.write(newText);
    	System.out.println("changes has been copied");
    	br.close();
    }catch (IOException e)
    {
    }
	}
    
    
    	
    }

