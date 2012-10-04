package my.projects.sort.bubble;

/**
 * The Time complexity is O(n*) as we have two loops one inside other. For
 * bubble sort you will do n comparison and worst case N swaps. So N* IN bubble
 * sort you start by comparing the first two element, lets say 1 and 2, if 1>2
 * then swap, now compare 2 with 3. if 2>3 swap else compare 3 with 4. This all
 * is happening in the inner loop. By the time, we have reached the end of inner
 * loop, the highest number will be at the end of the array. Now decrement the
 * outer loop by one and start the inner loop at zero again till outer counter
 * (which is one less than what we started with) and swap again.
 * 
 * 
 * @author mayank Joshi
 * 
 */
public class BubbleSort {

	private static int intArray[] = { -7, 9, 4, 5, 2, 8, 0, 3, 1, 6 };

	public static void main(String args[]) {

		System.out.println("Array Before Sorting");

		display(intArray);

		bubbleSort();

		System.out.println("Array After Sorting");

		display(intArray);

	}

	private static void bubbleSort() {
		for (int i = intArray.length - 1; i > 1; i--) {
			for (int j = 0; j < i; j++) {
				if (intArray[j] > intArray[j + 1]) {
					swap(j, j + 1);
				}
			}
		}

	}

	private static void swap(int one, int two) {
		int temp = intArray[one];
		intArray[one] = intArray[two];
		intArray[two] = temp;

	}

	private static void display(final int intArray[]) {

		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + ",");
		}
		System.out.println();

	}

}
