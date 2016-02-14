package assignment;
import java.util.Scanner;
public class SearchElem {
public void search(int a[],int elem)
{
	for(int i=0;i<a.length;i++){
		if (a[i]==elem)
		{
			System.out.println("The element is found in the array at the index " + i);
			break;
		}
	}
}
public static void main(String[] args)
{
	int arr[]={20,45,56,78,54,32,65};
	SearchElem e=new SearchElem();
	e.search(arr,45);
}
}
