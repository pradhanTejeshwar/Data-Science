package com.lata.demo.core.collections;

public class Student{
	private int stuId;
	private String stuName;
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public Student(int stuId, String stuName) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
	}
	void display()
	{
		System.out.println(stuId+"\t"+stuName);
	}
	public boolean equals(Object obj)
	{
		Student s=(Student)obj;
		if(this.stuId==s.stuId && this.stuName.equals(s.stuName))
			return true;
		else
			return false;
	}
	public int hashCode()
	{
		return stuId; 
	}
}
