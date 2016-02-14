package assignment;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class replacestrInFile {
	public static void main(String args[]) throws IOException
	{ 
	   
	 
	//   Scanner s=new Scanner(System.in);
	   System.out.println("enter the string to be replaced"); 
	  // String replace= s.nextLine();
	   System.out.println("Enter the string to be replaced by");
	  // String replaceby=s.nextLine();
	   String Str;
	   
		FileReader f= null;
		FileWriter w= null;
		try {
			f = new FileReader("c:\\Users\\anukrsh\\Documents\\hi.txt");
			w= new FileWriter("c:\\Users\\anukrsh\\Documents\\hi1.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedReader b= new  BufferedReader(f);

		BufferedWriter w1= new BufferedWriter(w);
		
			while ((Str=b.readLine())!=null)
		
		{
			if(Str.contains("are"))
			{
				
			System.out.println("match is found");
		
		   Str = Str.replaceAll("are","r");
		   
			}
			Str = Str + "\n";
			w1.write(Str); 	
		}
		f.close();
		w1.close();
	}
	
	}

