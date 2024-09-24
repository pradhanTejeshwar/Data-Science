import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q14 {
	public String call(String[] a,int b) {
		String[] Output=new String[4];
		String output;
		Output=reverseArray(a);
		output=Output[b-1];
		return output;
	}
	
	public String[] reverseArray(String[] arr) {
        List list = Arrays.asList(arr);
        
        Collections.reverse(list);
        
        String[] reversedArray = (String[]) list.toArray(arr);
        
        return reversedArray;
   }
}
