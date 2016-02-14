package assignment;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class countStrFile {
	
public static void main(String args[]) throws IOException	
{
	int count=0;
String str;
FileReader f = null;
Scanner s=new Scanner(System.in);
System.out.println("Enter the string to be searched");
String  search=s.nextLine();
try
{
	f = new FileReader("c:\\Users\\anukrsh\\documents\\hi.txt");
}catch (FileNotFoundException e)
{
   e.printStackTrace();
}
BufferedReader b=new BufferedReader(f);
while ((str=b.readLine())!=null)
{
	String w[]= str.split(" ");
	for(String w1:w)
	{
		
		if (w1.equalsIgnoreCase(search))
		{
			
		count=count+1;
		}
	}
}
	System.out.println("The count of string "+ search+" is"+ count);

}
}
