import java.util.*;
public class Q22 {
	public int StringsNotOfGivenLength(List<String> l1,String s1)
	 {
      int n1 = s1.length();
      int c = 0;
      for(int i = 0;i < l1.size();i++){
            int n2 = ((String) l1.get(i)).length();
            if(n1 != n2)
                  c++;
            }
      return c;
	 }
}
