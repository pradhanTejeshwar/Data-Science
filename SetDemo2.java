package com.lata.demo.core.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo2 {

	public static void main(String[] args) {
		//Set<Student> ts1=new TreeSet<Student>(new IdComp());  	//Id
		Set<Student> ts2=new TreeSet<>(new NameComp());		//Marks
		
		Student s1=new Student(101,"Ronit");
		ts2.add(s1);
		Student s2=new Student(101,"Ronit"); //s2.compareTo(s1)
		ts2.add(s2);  //s2.equals(s1) && s2.hashCode()==s1.hashCode()
		System.out.println(s1.hashCode()+"\t"+s2.hashCode());
		System.out.println(s1.equals(s2));
		
		System.out.println();
		ts2.add(new Student(103,"Geeta"));
		ts2.add(new Student(102,"Neha"));
		ts2.add(new Student(104,"Rahul"));
		
		System.out.println(ts2);
		
		Iterator<Student> it=ts2.iterator();
		while(it.hasNext())
		{
			Student stu=(Student)it.next();
			stu.display();
		}	
	}
}
