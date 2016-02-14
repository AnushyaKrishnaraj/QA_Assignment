package com.main.oops;
/*class circle inheriting pi from interface shapeconstants and
and abstact methods from the abstract class shape.square and rectangle also
uses the abstract methods and implements all the three abstract methods */
public class Circle extends Shape implements ShapeConstants
{double radius;
Circle()
{
	 radius = 4.56;
}
public void setSides()
{
	NoOfSides=0;
	
}
public void calculateArea()
{
	area=2*pi*radius;
	System.out.println("Area of the circle: "+area);
}
public void calculatePerimeter()
{
	perimeter=pi*Math.pow(radius, 2);
	System.out.println("perimeter of the circle : " +perimeter);
}
public static  void main(String args[])
{
	Circle c= new Circle();
	c.calculateArea();
	c.calculatePerimeter();
	Square s= new Square();
	Shape r= new Rectangle();
	s.setSides();
	s.calculateArea();
	s.calculatePerimeter();
	r.setSides();
	r.calculateArea();
	r.calculatePerimeter();
}
}