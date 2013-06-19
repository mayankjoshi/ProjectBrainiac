package my.interview.questions;

public class SwappingTwoVariables {
	
	public static void main(String args[]){
		
		int a =10; 
		int b =5; 
		swap(a,b);
	}

	private static void swap(int a, int b) {
		// Use a Third Var
		int c =a;
		a=b; 
		b=c; 
		System.out.println(a+"-"+b);
		
		// init again
		a=10;
		b=5; 
		// Use a XOR
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println(a+"-"+b);
		
	}

}
