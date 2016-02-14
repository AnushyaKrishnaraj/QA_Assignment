package jsample1;

public class cons {
	int firstnum;
	int secondnum;
	int total;
	
	public void  displayAdd()
	{
	total=firstnum+secondnum;
	System.out.println(total);
	}
cons()
{
firstnum=10;
secondnum=20;
}

cons(int a, int  b )
{
	firstnum=a;
	secondnum=b;
}
public static void main(String[] args)
{
	cons c1= new cons();
	c1.displayAdd();
	cons c2=new cons(30,40);
			c2.displayAdd();
	
}
}

