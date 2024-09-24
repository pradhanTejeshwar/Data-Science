import java.util.Scanner;

public class solve {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String a1= sc.nextLine();
		sc.close();
		
		//Calling the function
		String str=q5(a1);
		
		System.out.println(str);
//		String inputStr = "Hello*World";
		
//		System.out.println();
	}
	
public static String q5(String s) {
		String val="Hello, "+s;
		return val;
	}
}
