import java.util.*;
public class Q22Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        System.out.println("Enter the length");
        
        int n = s.nextInt();
        List<String> l1 = new ArrayList<String>();
        
        System.out.println("Enter the elements");
        for(int i = 0;i < n;i++)
              l1.add(s.next());
        System.out.println("Enter the input to be checked");
        String s1 = s.next();
        
        Q22 obj=new Q22();
        int val=obj.StringsNotOfGivenLength(l1,s1);
        s.close();
        System.out.println(val);
	}
}