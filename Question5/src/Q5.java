public class Q5 {
	public int call(String a) {
		String str[] = a.split("\\*");
		
		String val1 = str[0];
		String val2 = str[1];
		
		if((val1.charAt(val1.length()-1))==(val2.charAt(0))) {
			//True
			return 1;
		}
		else {
			//false
			return 0;
		}
	}	
	
	
//	String str[] = a.split("\\*");
//	for(int i=0;i<str.length;i++)
//		System.out.println(str[i]); 
//	public q5(String a) {
//		String str[] = a.split("\\*");
//		for(int i = 0;i<str.length;i++)
//			System.out.println(str[i]);
//	}	
//	private int q1(int a) {
//		return a+a;
//	}
//	public String q5(String a) {
//		String str[] = a.split("\\*");
//		for(int i=0;i<str.length;i++)
//			System.out.println(str[i]); 
//	}
}
