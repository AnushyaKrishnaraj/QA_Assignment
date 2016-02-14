package com.main.oops;

import java.util.Scanner;

public class Rectangle extends Shape
	{
		float length,width,area,perimeter;
	public void setSides()
	{   Scanner s= new Scanner(System.in);
		System.out.println("Enter the length of the rectangle");
		length=s.nextInt();
		System.out.println("Enter the breadth of the rectangle");
		width=s.nextInt();
		
		
	}
	public void calculateArea()
	{
		area=length*width;
		System.out.println("Area of rectangle : " +area);
	  }
	public void calculatePerimeter()
	{
		perimeter=2*length + 2*width;
		System.out.println("perimeter of rectangle: " +perimeter);
	}
}

