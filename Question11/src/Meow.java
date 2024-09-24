import java.util.Scanner;

public class Meow {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the price:");
		double pr=sc.nextDouble();
		Bow bw=new Bow(pr);
	}

}