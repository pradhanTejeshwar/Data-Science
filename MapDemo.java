package com.lata.demo.core.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
	Map m=new Hashtable();  		//Thread-Safe
	m.put(10, "Hello");
	m.put(null, "Hi");
	m.put(300, "Bye");
	m.put(2, "Ciya");

	System.out.println(m);
	System.out.println(m.get(30));
	System.out.println(m.containsKey(40));
	System.out.println(m.isEmpty());
	Set s=m.keySet();
	
	Collection c=m.values();
	
	System.out.println(s);
	System.out.println(c);
	}
}
