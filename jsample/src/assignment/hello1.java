package assignment;
import java.util.Scanner;
public class hello1 {
public static void main(String[] args)
{
	Scanner s1=new Scanner(System.in);
	String name= s1.nextLine();
		String s2="Alice";
		String s3="Bob";
		if ((name.equals(s2))||(name.equals(s3)))
	System.out.println("Hello world " + name);
			else
		System.out.println("Hello world");
	
}
}
