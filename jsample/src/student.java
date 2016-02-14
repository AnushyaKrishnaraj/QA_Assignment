import java.util.Scanner;
public class student {
	int studentid;
	String name;
	
	public  void total()
	{
		Scanner stud = new Scanner(System.in);
		System.out.println("Enter the student id");
  	 studentid=stud.nextInt();
		 System.out.println("Enter the student name");
		 name=stud.next();
		 System.out.println("enter the marks1");
		 int marks1=stud.nextInt();
		 System.out.println("enter the marks2");
		 int marks2=stud.nextInt();
		 System.out.println("enter the marks3");
		 int marks3=stud.nextInt();
		 int total=marks1+marks2+marks3;
		 float avg=total/3;
		 System.out.println("The total marks obtained by   " + name +" is" + total);
		 System.out.println("The average is " + avg);
		 
	}

public  static void main(String[] args)
{
	student s1=new student();
	System.out.println("hi");
s1.total();	
}
}
