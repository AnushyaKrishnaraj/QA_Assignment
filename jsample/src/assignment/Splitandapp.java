package assignment;

import java.util.Scanner;

public class Splitandapp {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String str=s.nextLine();
		String words[]=str.split(" ");
		int i=1;
		for(String w:words)
		{
			System.out.println(w +i);
			i=i+1;
		}
			

	}

}
