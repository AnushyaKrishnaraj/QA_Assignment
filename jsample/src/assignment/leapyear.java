package assignment;
import java.util.Scanner;
public class leapyear {
	public void leap(int year)
	{
		if(((year%4==0) &&(year%100!=0))||(year%400==0))
			System.out.println(year + "  is a leap year");
		else
			System.out.println(year + "  is not a leap year");
	}
	public static void main(String args[])
	{
		leapyear l= new leapyear();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the year");
		int 	year=	s.nextInt();
		l.leap(year);
	}

}
