package com.lata.demo.core.collections;

public class MainTest {
	public static void main(String[] args) {
	Test t=new Test();
	t.putingNumber("Lata","90");
	t.putingNumber("Ruby","80");
	t.putingNumber("Heena","85");
	t.putingNumber("Rahul","75");
	

	System.out.println(t.getingName(null));
	System.out.println(t.getingName("95"));
	System.out.println(t.getingName("85"));
	
	System.out.println(t.getingNumber(null));
	System.out.println(t.getingNumber("Leena"));
	System.out.println(t.getingNumber("Rahul"));
	
	System.out.println(t.putingNumber(null,null));
	
	System.out.println(t.printing());
	}
}



