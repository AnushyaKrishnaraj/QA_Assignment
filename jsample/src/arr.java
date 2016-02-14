
public class arr {
	
	public static void main(String[] args)
	{
	int[]  mynewarr= new int[10];
	int[] mynewarr1= {10,29,37,49,56};
	int[] mynewarr2= new int[]{20,35,45,46,35};// different ways of initializing array
	int temp1=20;
		for (int i=0;i<5;i++)
		{
			mynewarr[i]=temp1;
			temp1+=5;
			System.out.println(mynewarr[i]+ "      " + mynewarr1[i]+ "            "+ mynewarr2[i]);
		}
		
	}
	
	

}
