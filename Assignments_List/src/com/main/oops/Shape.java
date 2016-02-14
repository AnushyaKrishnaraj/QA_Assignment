package com.main.oops;
/*Abstract class shape is created with 3 properties and 3 methods.
 * The implementation of the method is done in rectangle,square and circle
 * classes.Shape class can never be instantiated.
 */
public abstract class Shape {
	public int NoOfSides;
	public double area;
	public double perimeter;
	public  abstract  void setSides();
	public  abstract  void calculateArea();
	public  abstract void calculatePerimeter();

}
