package exceptionHandling;

public class exception1 {
	public static void main(String[] args) {
		int a=10,b=0;
		try {
			int c=a/b;
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
