import java.util.*;

import first.string.assignment15.Q15;

public class Q16Main {

	public static void main(String[] args) {
	
	Q15 un=new Q15();
	List<Integer> numbers1 = new ArrayList<Integer>();
	numbers1.add(12);
	numbers1.add(1);
	numbers1.add(32);
	numbers1.add(3);

	List<Integer> numbers2 = new ArrayList<Integer>();
	numbers2.add(0);
	numbers2.add(12);
	numbers2.add(2);
	numbers2.add(23);
	
	List<Integer> output = new ArrayList<Integer>();
	
    
 for(int i=0;i<=3;i++)
 {
	 if(i%2==0)
			 {
		        output.add(i, numbers2.get(i));  
			 }
	 else
	 {
		 output.add(i, numbers1.get(i));  
	 }
 }
 System.out.println(output);
 
}
}