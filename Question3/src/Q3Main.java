import java.util.Arrays;
import java.util.Scanner;

public class Q3Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a1 = new int[5];
		int []b1 = new int[5];
		int c1[]= new int[10];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("input1=");
		for(int i=0;i<5;i++)
			a1[i]= sc.nextInt();
		
		System.out.println("input2=");
		for(int i=0;i<5;i++)
			b1[i]= sc.nextInt();
		sc.close();
		
		Q3 obj1= new Q3();
		c1 = obj1.call(a1, b1);
		
		for(int temp:c1)
			System.out.print(temp+",");
	}

}