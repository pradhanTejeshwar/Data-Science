package com.lata.demo.core.collections;

class A<T>
{
	T i;
	void setValueOfI(T value)
	{
		i=value;
	}
	void display()
	{
		System.out.println(i);
	}
}
public class GenericDemo {

	public static void main(String[] args) {
		A<Integer> a1=new A<>();
		a1.setValueOfI(1000);
		
		A<String> a2=new A<>();
		a2.setValueOfI("Lata");
		
		a1.display();
		a2.display();
	}

}
