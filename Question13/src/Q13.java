
public class Q13 {
	public int[] call(int[] input1,int[] input2) {
		int output[] = new int[5];
		System.arraycopy(input1, 0, output, 0, 1);
		System.arraycopy(input2, 1, output, 1, 1);
		System.arraycopy(input1, 2, output, 2, 1);
		System.arraycopy(input2, 3, output, 3, 1);
		System.arraycopy(input1, 4, output, 4, 1);
		return output;
	}	
}
