import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q23Main {
	public static void main(String[] args) {
		int[] list=new int[5];
		int value;
		int[] Output;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("UserInput :");
		for(int i=0;i<5;i++)
			list[i]=sc.nextInt();
	
		
		value=sc.nextInt();
		
		sc.close();
		
		Q23 obj=new Q23();
		Output=obj.call(list, value);
		System.out.println("output :");
		
		
		for(int i=0;i<Output.length;i++)
		      System.out.print(Output[i]+",");
	}
}