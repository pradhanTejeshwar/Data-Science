import java.util.Scanner;
import java.util.Arrays;

public class Q5Main {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String a1= sc.nextLine();
		sc.close();
		
		//Calling the function for q5
		Q5 obj=new Q5();
		int val=obj.call(a1);
		
		if(val==0)
			System.out.println("False");
		else
			System.out.println("True");
	}	
}
