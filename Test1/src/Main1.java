
public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="68/33*1/78";
		String str[] = a.split("/");
		for(String temp2:str)
			System.out.println(temp2);
		System.out.println("----");
		String temp[]=str[0].split("/");
		for(String temp3:temp)
			System.out.println(temp3);
		System.out.println("----");
		String value1=temp[0]+temp[1];
		float val1=Float.parseFloat(value1);
		System.out.println("----");
		System.out.println(val1);
		System.out.println("----");
		for(String temp1:str)
			System.out.println(temp1);
	}

}
