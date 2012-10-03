package my.projects.sort.bubble;

public class BubbleSort {

	private static int intArray[] = { 7, 9, 4, 5, 2, 8, 0, 3, 1, 6 };

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
