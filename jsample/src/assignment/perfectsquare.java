package assignment;

public class perfectsquare {
public void square()
{
for (int i=1;i<=500;i++)
{
	double r=Math.sqrt(i);
	if (r== Math.ceil(r))
	{
		System.out.println(i);
	}
	
}

	
	
}
public static void main(String[] args)
{
	perfectsquare p= new perfectsquare();
	p.square();
}
}
