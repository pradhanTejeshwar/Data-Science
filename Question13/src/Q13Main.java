import java.util.Scanner;

public class Q13Main {

	public static void main(String[] args) {
		int input1[];
		input1 = new int[5];
		int input2[] = new int[5];
		int output[] = new int[5];
		System.out.println("Enter 5 Value for Array 1: ");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++) {
			input1[i]=sc.nextInt();
		}
		System.out.println("Enter 5 Value for Array 2: ");
		for(int i=0;i<5;i++) {
			input2[i]=sc.nextInt();
		}
		Q13 obj1=new Q13();
		output = obj1.call(input1, input2);
		sc.close();
		for(int temp:output)
			System.out.print(temp+",");
		
	}

}
