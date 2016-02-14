import java.util.Scanner;
public class reverse {
	public static void main(String args[])
	{
Scanner num= new Scanner(System.in);
int num1 = num.nextInt();
int reversenum=0;
while (num1!=0)
{
	reversenum=reversenum*10;
	reversenum=reversenum+(num1%10);
	num1=num1/10;
}
System.out.println("The reversed number is " +reversenum);
}
}
