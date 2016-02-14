package my.interview.questions.arrays;

import java.util.Hashtable;
import java.util.List;

public class FindDuplicateInArray {

	public static void main(String args[]) {

		int a[] = { 5, 6, 7, 3, 4, 5, 1, 2, 4, 9 };
		findDuplicateUsingHashTable(a);
		bitSet(a);
		negation(a);
	}

	private static void findDuplicateUsingHashTable(int a[]) {
		Hashtable<Integer, Integer> hashtable = new Hashtable<Integer, Integer>();
		for (int i = 0; i < a.length; i++) {
			if (hashtable.contains(a[i])) {
				System.out.println(" Integer " + a[i] + " is duplicate");
			} else {
				hashtable.put(a[i], a[i]);
			}
		}
	}

	private static void bitSet(int a[]) {
		boolean bitset[] = new boolean[99999];
		for (int i = 0; i < a.length; i++) {
			if (bitset[a[i]]) {
				System.out.println("Interger " + a[i] + "  is duplicate");
			} else {
				bitset[a[i]] = true;
			}
		}
	}
	
	private static void negation(int a[]){
		
	for (int i = 0; i < a.length; i++) {
		if(a[Math.abs(a[i])]<0) {
			System.out.println("Duplciate " + a[Math.abs(a[i])]);
		}
		a[Math.abs(a[i])]*=-1;
	}
		
	}

}
