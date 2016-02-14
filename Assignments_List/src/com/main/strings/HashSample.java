package com.main.strings;

public class HashSample {
public static void main(String args[])
{
	String s1= new String("Hello");
	String s2=new String("Hello");
	String s3="Friend";
	String s4= new String(s3);
	String s5= new String("Lavanya");
	String s6=new String(s5);
	String s7="Rakesh";
	String s8="Rakesh";
	System.out.println("Hashcodes(s1,s2)  :" +s1.hashCode()+" " +s2.hashCode());
    System.out.println("Equal ( s1,s2)   :"  +s1.equals(s2));
    System.out.println("Hashcodes(s3,s4)  :" +s3.hashCode()+" " +s4.hashCode());
    System.out.println("Equal ( s3,s4)   :"  +s3.equals(s4));
    System.out.println("Hashcodes(s5,s6)  :" +s5.hashCode()+" " +s6.hashCode());
    System.out.println("Equal ( s7,s8)   :"  +s5.equals(s6));
    System.out.println("Hashcodes(s7,s8)  :" +s7.hashCode()+" " +s8.hashCode());
    System.out.println("Equal ( s7,s8)   :"  +s7.equals(s8));
    System.out.println("Hashcodes(s1,s8)  :" +s1.hashCode()+" " +s8.hashCode());
    System.out.println("Equal ( s1,s8)   :"  +s1.equals(s8));
System.out.println("comparison using ==");
if (s1==s2)
	System.out.println("s1,s2 are equal");
else
	System.out.println("s1,s2 are not equal");
if (s3==s4)
	System.out.println("s3,s4 are equal");
else
	System.out.println("s3,s4 are not equal");
if (s5==s6)
	System.out.println("s5,s6 are equal");
else
		System.out.println("s5,s6 are not equal");
if (s7==s8)
	System.out.println("s7,s8 are equal");
else
	System.out.println("s7,s8 are not equal");





}
}
