package assignment;
import java.util.Scanner;
public class swap {
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the first number");
	int x=s.nextInt();
	System.out.println("Enter the second number");
	int y=s.nextInt();
	System.out.println("Before exchange x= "+x +" y =" +y);
	x=x+y;
	y=x-y;
	x=x-y;
	System.out.println("Atfer exchange");
	System.out.println("x= "+x);
	System.out.println("y= "+y);
}

}
