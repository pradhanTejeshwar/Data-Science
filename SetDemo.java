package com.lata.demo.core.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		Set s=new TreeSet();  		//Unordered Collection
		s.add("N");
		s.add("Ronit");
		s.add("Rita");
		s.add("Rohit");
		s.add("Neena");
		
		System.out.println(s);
	}
}
