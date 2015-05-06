package my.projects.sorting;

public class BubbleSort {

	public static void main(String args[]) {
		BubbleSort bubbleSort = new BubbleSort();
		int array[] = { 1, 10, 2, 30, 4, 5, 6, -1, 0, 11 };
		bubbleSort.display(array);
		bubbleSort.sort(array);
		bubbleSort.display(array);
	}

	private void sort(int[] array) {
		for (int i = array.length - 1; i > 1; i--) {
			for (int j = 0; j < i; j++) {
				if (array[j] > array[j + 1]) {
					swap(array, j, j + 1);
				}
			}
		}

	}

	private void display(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ",");

		}
		System.out.println();
	}

	private void swap(int[] array, int j, int i) {
		int temp = array[j];
		array[j] = array[i];
		array[i] = temp;

	}

}
