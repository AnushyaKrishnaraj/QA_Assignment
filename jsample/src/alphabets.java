import java.util.Scanner;
public class alphabets {
	public static void main(String args[])
	{
		Scanner alph= new Scanner(System.in);
		
		System.out.println("enter the table you want to display:");
				int n=alph.nextInt();
		System.out.println("Enter the number to complete");		
		        int m=alph.nextInt();
             for (int i=1;i<=m;i++)
             {
			int result= n*i;
		System.out.println(n +" * "+i +" = " +result);
             }
		
		
		
	}
	

}
