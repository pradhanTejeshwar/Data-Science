public class Q4 {
	public String[] call(String[] a,String[] b) {
		String[] output1=new String[6];
		String[] output2=new String[6];
		String[] output=new String[6];
		for(int i=0;i<a.length;i++) {
			char ch1=a[i].charAt(0);
			if(ch1=='a' || ch1=='g' || ch1=='A' || ch1=='G') {
				output1=removeTheElement(a, i);
			}
		}
		//ch2=b[i].substring(b[i].length() - 1);		
		for(int i=0;i<b.length;i++) {
			char ch2=b[i].charAt(b[i].length() - 1);
			if(ch2=='n' || ch2=='e' || ch2=='N' || ch2=='E') {
				output2=removeTheElement(a, i);
			}
		}		
		System.arraycopy(output1, 0, output, 0, output1.length);
		System.arraycopy(output2, 0, output, output1.length, output2.length);
		
		return output;
	}
	public static String[] removeTheElement(String[] arr,int index){
		if (arr == null || index < 0 || index >= arr.length) {
			return arr;
		}
		
		String[] anotherArray = new String[arr.length - 1];
	
		for (int i = 0, k = 0; i < arr.length; i++) {
			if (i == index) {
			continue;
			}
			anotherArray[k++] = arr[i];
		}
		return anotherArray;
	}
}