package com.capgemini.collection.model;

import java.util.Objects;

public class Student implements Comparable<Student> {
	private int rollNum;
	private String name;
	
	public Student() {
		super();
	}
	

	public Student(int rollnum, String name ) {
		super();
		this.rollNum = rollnum;
		this.name = name;
		
	}

	public int getRollnum() {
		return rollNum;
	}

	public void setRollnum(int rollnum) {
		this.rollNum = rollnum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Student [rollNum=" + rollNum + ", name=" + name + "]";
	}

	@Override
	public boolean equals(Object obj)
	{
		if(obj==null)
			return false;
		if(!(obj instanceof Student))
				return false;
		if(this==obj)
			return true;
		Student student=(Student) obj;
		if(this.rollNum==student.rollNum && this.name==student.name) 
				
			return true;
		return false;
			
	}
	@Override
	public  int hashCode()
	{
		return Objects.hash(rollNum);
		
	}
	@Override
	public int compareTo(Student student)
	{
	return (this.rollNum-student.rollNum);	
	}	 

}
