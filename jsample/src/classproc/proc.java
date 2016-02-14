package classproc;
import java.util.Scanner;
public class proc {
public static void main(String args[])
{
	Scanner v = new Scanner(System.in);
	name nameobj=new name();
	String name2= v.nextLine();
	nameobj.setname(name2);
	nameobj.display1();
	
	
			
}
}