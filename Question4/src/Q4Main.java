import java.util.Scanner;

public class Q4Main {
	public static void main(String[] args) {
			String[] str1=new String[] {"apple", "orange", "grapes"};
			String[] str2=new String[] {"melon", "apple", "mango"};
			int index=0;
			String[] str3=new String[6];
			
			for(String temp:str2) {
				if(!(temp.endsWith("n") || temp.endsWith("e") || temp.endsWith("N") || temp.endsWith("E") ))
						{
							str3[index++]=temp;
						}
			}
			for(String temp:str1) {
				if(!(temp.startsWith("a") || temp.startsWith("g") || temp.startsWith("A") || temp.startsWith("G") ))
						{
							str3[index++]=temp;
						}
			}
			for(int i=0;i<index;i++)
				System.out.print(str3[i]+" ");
	}
}			
//			for(String temp:str1) {
//				char ch=temp.charAt(0);
//				if(ch!='a' || ch!='g')
//					str3[index++]=temp;
//				//System.out.println(ch+",");
//			}
//			for(String temp:str2) {
//				char ch=temp.charAt(temp.length() - 1);
//				if(ch!='n' || ch!='e')
//					str3[index++]=temp;
//				//System.out.println(ch+",");
//			}
//			for(String temp:str3)
//				System.out.println(temp);







//	public static void main(String[] args) {
//		String[] input1=new String[3];
//		String[] input2=new String[3];
//		Scanner sc=new Scanner(System.in);
//		String[] output=new String[6];
//		
//		for(int i=0;i<3;i++)
//			input1[i]=sc.next();
//		
//		for(int i=0;i<3;i++)
//			input2[i]=sc.next();
//		
//		Q4 obj=new Q4();
//		output =obj.call(input1,input2);
//			
//		for(int i=0;i<output.length;i++)
//			System.out.print(output[i]+",");
//	}