package com.main.importantConcepts;

public final class ImmutableCl {
	private final String studentName;
	private final String rollNo;
	private final int grade;
	public  ImmutableCl(String studentName,String rollNo,int grade)
	{
		this.studentName=studentName;
		this.rollNo=rollNo;
		this.grade=grade;
	}
	public String getstudentName()
	{
		return studentName;
	}
	public String getrollno()
	{
		return rollNo;
		
	}
	public int getgrade()
	{
		return grade;
	}
	

}
