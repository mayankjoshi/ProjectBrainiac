package my.projects.arrays;

public class MergeTwoArraySort {

	public static void main(String args[]) {
		MergeTwoArraySort mergeTwoArraySort = new MergeTwoArraySort();
		int[] array1 = { 2, 5, 8, 9 };
		int[] array2 = { 6, 3, 4, 7, 1 };
		int[] array3 = new int[array1.length + array2.length];

		mergeTwoArraySort.mergeAndSort(array1, array2, array3);
		mergeTwoArraySort.print(array3);

	}

	private void print(int[] array3) {
		for (int i = 0; i < array3.length; i++) {
			System.out.print(array3[i] + " ");
		}

	}

	private void mergeAndSort(int[] array1, int[] array2, int[] array3) {

		array1 = sortArray(array1);
		array2 = sortArray(array2);
		int a3;
		int a2;
		int a1 = a2 = a3 = 0;
		while (a1 < array1.length && a2 < array2.length) {
			if (array1[a1] < array2[a2]) {
				array3[a3] = array1[a1];
				a1++;
				a3++;
			} else {
				array3[a3] = array2[a2];
				a2++;
				a3++;
			}
		}

		while (a1 < array1.length) {
			array3[a3] = array1[a1];
			a1++;
			a3++;
		}
		while (a2 < array2.length) {
			array3[a3] = array2[a2];
			a2++;
			a3++;
		}

	}

	private int[] sortArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[i] < array[j]) {
					int temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}
		return array;
	}

}
