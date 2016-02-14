package jsample1;
import java.util.Scanner;


public class gr2ade {
	public static void main(String args[])
	{
		Scanner k= new Scanner(System.in);
		int marks;
		char grade;
		String result;
		System.out.println("Enter your marks");
		marks=k.nextInt();result="pass";
		if (marks< 40)
		{
			grade='f';
			result="fail";
		}
		else
		{
			if (marks<50)
		  grade ='d';
		else if (marks<60)
		grade='c';
		else if (marks<70)
		grade='b';
		else if (marks<80)
		grade='a';
		else
			grade='o';
	}
	System.out.println("The grade is : " +grade);	 
	System.out.println("The result is : " +result);
		
		
		
	}

}
