package my.projects.arrays;

public class ReverseINplace {

	public static void main(String args[]) {

		ReverseINplace iNplace = new ReverseINplace();
		int array[] = { 1, 2, 3, 4, 5, 6, 7};
		iNplace.printArray(array);
		iNplace.reverseArray(array);
		iNplace.printArray(array);
	}

	private void reverseArray(int[] array) {
		int length = array.length;
		for (int j = 0; j < length / 2; j++) {
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
