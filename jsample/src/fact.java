import java.util.Scanner;
public class fact {
 public int facto(int n)
 {
	 int j=1;
	 int i=1;
	 while (i<=n)
	 {
		 j=j*i;
		 i=i+1;
		 
		 
	 }
	
		 return j;
 }
 public static void main(String args[])
 {
	Scanner n = new Scanner(System.in);
	System.out.println("enter th efactorial number ");
	int k=n.nextInt();
	fact f=new fact();
	System.out.println("The factorial of " + k +" is " + f.facto(k));
		
	
 }
}
