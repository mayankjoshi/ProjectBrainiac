package my.interview.questions.arrays;

public class RotateAnArrayBYK {

	public static void main(String args[]) {
		RotateAnArrayBYK anArrayBYK = new RotateAnArrayBYK();

		int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		anArrayBYK.printArray(array);
		anArrayBYK.rotate(3, array, anArrayBYK);
		anArrayBYK.printArray(array);
		// anArrayBYK.rotate(4, array);
		// anArrayBYK.printArray(array);
	}

	private void rotate(int k, int[] array, RotateAnArrayBYK anArrayBYK) {
		// First rotate the whole Array;
		reverse(array, 0, array.length);
		reverse(array, 0, k);
		reverse(array, k, array.length - k);

	}

	private void reverse(int array[], int start, int length) {

		if (start == length / 2) {
			length = length + 1;
		}
		for (int j = start; j < length / 2; j++) {
			int temp = array[j];
			array[j] = array[(length - j) - 1];
			array[(length - j) - 1] = temp;

		}
	}

	private void printArray(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

}
