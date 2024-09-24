package com.lata.demo.core.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;


public class ListDemo {

	public static void main(String[] args) {
		List<Integer> l=new ArrayList<>();		//Dynamic Arrays		
		l.add(10);
		l.add(40);
		l.add(20);
		l.add(30);
		l.add(20);
		
		//Collections.sort(l);
		
		/*System.out.println(l);
		System.out.println(l.size());
		l.add(2, "Heena");
		System.out.println(l);
		l.remove(1);
		System.out.println(l);
		System.out.println(l.contains("Lata"));*/
		/*l.clear();
		System.out.println(l);
		
		
		System.out.println(l.poll());
		System.out.println(l);
		System.out.println(l.pollLast());
		System.out.println(l);*/
		//System.out.println(Collections.binarySearch(l, 20));
		System.out.println(l);
		
		Iterator<Integer> it=l.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//For Each
		for(Integer temp:l)
		{
			System.out.println(temp);
		}	
	}
}
