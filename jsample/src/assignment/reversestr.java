package assignment;

import java.util.Scanner;

public class reversestr {
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	String str=s.nextLine();
	char[] str1=str.toCharArray();

	for(int i=str.length()-1;i>=0;i--)
	{
System.out.print(str1[i]);
	}
}
}