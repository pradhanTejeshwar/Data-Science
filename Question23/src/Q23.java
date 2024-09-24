import java.util.ArrayList;

public class Q23 {
	public int[] call(int[] a, int b) {
		int[] output= new int[5];
		int c=0;
		for (int i=0; i<a.length; i++) {
			if(a[i]==b)
				a=removeTheElement(a,i);
		}
		output=a;
		for(int temp:output)
			System.out.println(temp);

		return output;
	}
	
	public static int[] removeTheElement(int[] arr,int index){
		if (arr == null || index < 0 || index >= arr.length) {
			return arr;
		}
		
		int[] anotherArray = new int[arr.length - 1];
	
		for (int i = 0, k = 0; i < arr.length; i++) {
			if (i == index) {
			continue;
			}
			anotherArray[k++] = arr[i];
		}
		return anotherArray;
	}
}
