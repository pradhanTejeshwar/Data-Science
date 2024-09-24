import java.util.Arrays;

public class Q3 {
	public int[] call(int[] a1,int[] a2) {
		int c1[]= new int[10];
		
		int index=0;
		
		for(int temp:a1)
			if(Arrays.binarySearch(a2, temp)<0)
				c1[index++]=temp;
		
		for(int temp:a2)
			if(Arrays.binarySearch(a1, temp)<0)
				c1[index++]=temp;
		
		int output[]= new int[index];
		
		System.arraycopy(c1, 0, output, 0, index);
		
		return output;
	}
}
