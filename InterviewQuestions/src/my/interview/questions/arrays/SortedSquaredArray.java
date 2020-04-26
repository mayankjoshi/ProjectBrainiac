package my.interview.questions.arrays;

public class SortedSquaredArray {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		int a[] = { 1, 2, 5, 6, 7, 10 };
		int b[] = { -7, -5, 0, 2, 6 };
		int c[] = { -10, -9, -8, 0, 2, 4, 5, 6, 7, 8, 9 };

		SortedSquaredArray sortedSquaredArray = new SortedSquaredArray();

		int[] squaredSortedArray1 = sortedSquaredArray.squaredSortedArray(b);
		int[] squaredSortedArray2 = sortedSquaredArray.squaredSortedArray(a);
		int[] squaredSortedArray3 = sortedSquaredArray.squaredSortedArray(c);
	}

	private int[] squaredSortedArray(int array[]) {
		int[] result = new int[array.length];
		int left = 0;
		int right = array.length - 1;
		for (int i = array.length - 1; i >= 0; i--) {
			if (Math.abs(array[left]) > array[right]) {
				result[i] = array[left] * array[left];
				left++;
			} else {
				result[i] = array[right] * array[right];
				right--;
			}
		}

		return result;
	}

}
