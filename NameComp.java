package com.lata.demo.core.collections;

import java.util.Comparator;

public class NameComp implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getStuName().compareTo(o2.getStuName());
	}


}
