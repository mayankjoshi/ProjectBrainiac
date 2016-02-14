package my.interview.questions.arrays;

public class ArrayMultiplication {
	
	// GIven an array [4,3,2,1,2] out put should be [12,16,24,48,24] such that output contains multiplication of all number except the current one.
	
	public static void main (String args[]){
		int a[]={4,3,2,1,2};
		int o[]= new int[a.length];
		int n = a.length;
		arrayMultiplication(a, o, n);
	}
	
	private static void arrayMultiplication(final int[] a, int[] o , int n){
		int left =1;
		int right =1;
		for(int i =0; i<n; i ++){
			o[i]=1;
		}
		
		for(int i =0; i<n ; i ++){
			o[i]=o[i]*left;
			o[n-1-i]=o[n-1-i]*right;
			left=left*a[i];
			right= right*a[n-1-i];
		}
		
		for(int i =0; i<o.length; i ++){
			System.out.println(o[i]);
		}
	}

}
