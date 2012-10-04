package my.projects.sort.selection;

public class SelectionSort {
	private static int intArray[] = { 7, 9, 4, 5, 2, 8, 0, 3, 1, 6 };

	public static void main(String args[]) {
		System.out.println("Array Before Sorting");

		display(intArray);

		selectionSort();

		System.out.println("Array After Sorting");

		display(intArray);
	}

	private static void selectionSort() {
		int min;
		for (int out = 0; out < intArray.length - 1; out++) {
			min = out;
			for (int in = out + 1; in < intArray.length; in++) {
				if (intArray[in] < intArray[min]) {
					min = in;
				}

			}
			swap(out, min);

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
