
public class factorial 

	{
	    public int   fact(int n)
	    {
	 if (n==1)
	 return 1;
	 else
	 return fact(n-1)*n;
	    }
	    
	    public static void main(String[ ] args)
	    {
	        factorial f=new factorial();
	int r=  f.fact(4);
	System.out.println("The factorial of 4  is "+ r);
	            }
	    
}
