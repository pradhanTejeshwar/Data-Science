import java.util.Scanner;
import java.util.Arrays;  

public class Q14Main {

	public static void main(String[] args) {
		String[] input=new String[4];
		
		Scanner sc=new Scanner(System.in);
		String output=new String();
		
		for(int i=0;i<4;i++)
			input[i]=sc.next();
		
		Arrays.sort(input);
		System.out.println("Enter the value");
		int val=sc.nextInt();
		Q14 obj=new Q14();
		output=obj.call(input,val);
	
		System.out.println(output);
		
//		for(int i=0;i<output.length;i++)
//			System.out.print(output[i]+" ");
	}

}
