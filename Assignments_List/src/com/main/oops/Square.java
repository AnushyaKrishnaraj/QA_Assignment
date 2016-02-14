package com.main.oops;

import java.util.Scanner;

public class Square extends Shape
{
	float length,area,perimeter;
public void setSides()
{   Scanner s= new Scanner(System.in);
	System.out.println("Enter the length of the Square");
	length=s.nextInt();
}
public void calculateArea()
{
	area=length*length;
	System.out.println("Area of square : " +area);
  }
public void calculatePerimeter()
{
	perimeter=4*length;
	System.out.println("perimeter of square: " +perimeter);
}
}
