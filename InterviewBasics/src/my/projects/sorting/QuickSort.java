package my.projects.sorting;

public class QuickSort {

	static int array[] = { 1, 10, 2, 30, 4, 5, 6, -1, 0, 11 };

	public static void main(String args[]) {
		QuickSort quickSort = new QuickSort();
		quickSort.display();
		quickSort.quickSort(0, array.length - 1);
		quickSort.display();
	}

	private void quickSort(int lowerIndex, int higherIndex) {
		int i = lowerIndex;
		int j = higherIndex;
		int pivot = array[lowerIndex + (higherIndex - lowerIndex) / 2];
		while (i <= j) {
			while (array[i] < pivot) {
				i++;
			}
			while (array[j] > pivot) {
				j--;
			}
			while (i <= j) {
				swap(i, j);
				i++;
				j--;
			}
			if (lowerIndex < j) {
				quickSort(lowerIndex, j);
			}
			if (i < higherIndex) {
				quickSort(i, higherIndex);
			}
		}
	}

	private void swap(int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	private void display() {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ",");

		}
		System.out.println();
	}
}
