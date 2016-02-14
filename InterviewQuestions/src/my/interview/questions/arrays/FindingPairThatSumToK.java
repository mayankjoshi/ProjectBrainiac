package my.interview.questions.arrays;

import java.util.Arrays;

public class FindingPairThatSumToK {

	public static void main(String args[]) {
		int a[] = { 1, 4, 8, 0, 5, 3, 2 };
		int sum = 5;
		firstApproach(a, sum);
		System.out.println("---------");
		secondApproach(a, sum);
	}

	private static void firstApproach(int a[], int sum) {
		for (int i = 0; i < a.length; i++) {
			int diff = sum - a[i];
			for (int j = 0; j < a.length; j++) {
				if (a[j] == diff) {
					System.out.println("The pair is " + a[i] + " " + a[j]);
				}
			}

		}

	}

	private static void secondApproach(int a[], int sum) {
		Arrays.sort(a);
		int left = 0;
		int right = a.length - 1;
		while (left < right) {
			while (a[left] + a[right] <= sum && left < right) {
				if (a[left] + a[right] == sum) {
					System.out.println("The Pair is " + a[left] + " "
							+ a[right]);
				}
				left++;
			}
			right--;
			while(a[left]+ a[right]>=sum & left <right){
				if (a[left] + a[right] == sum) {
					System.out.println("The Pair is " + a[left] + " "
							+ a[right]);
				}
				right--;
			}
			

		}
	}

}
