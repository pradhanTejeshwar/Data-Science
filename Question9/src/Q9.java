import java.util.Scanner;

public class Q9 {
	public static void main(String[] args) {
		int val;
		System.out.println("Enter a Value : ");
		Scanner sc=new Scanner(System.in);
		val = sc.nextInt();
		Ching obj=new Ching();
		try {
				String str=obj.setChing(val);
				System.out.println(str);
		}
		catch(Exception ae) {
			System.out.println(ae);
		}
	}
}
