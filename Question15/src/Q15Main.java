import java.util.Scanner;

public class Q15Main {
	public static void main(String[] args) {
		int Output;
		Scanner sc=new Scanner(System.in);
		int[] input1=new int[4];
		int[] input2=new int[4];
		
		for(int i=0;i<4;i++)
			input1[i]=sc.nextInt();
		for(int i=0;i<4;i++)
			input2[i]=sc.nextInt();
		
		Q15 obj=new Q15();
		
		Output=obj.call(input1,input2);
		System.out.println(Output);
	}
}
