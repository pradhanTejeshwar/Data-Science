import java.util.HashSet;
import java.util.Set;

public class Q15 {
	public int call(int[] a, int[] b) {
		//String[] output=new String[8];
		//int[] c;
		int temp=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					temp+=a[i];
				}
			}
		}
		return temp;
	}
	public String[] FindCommonElement(String[] arr1,String[] arr2)
	{
		Set<String> set = new HashSet<>();
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					// add common elements
					set.add(arr1[i]);
					break;
				}
			}
		}
		int k=0;
		String[] array=new String[8];
		
		for (String i : set) {
			array[k++]=i;
			//System.out.print(i + " ");
		}
		return array;
	}
}
