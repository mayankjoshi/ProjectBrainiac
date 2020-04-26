package my.interview.questions.arrays;

public class MultiplyExceptSelf {

	public static void main(String[] args) {

		int array[] = { 2, 3, 7, 1, 5 };

		MultiplyExceptSelf exceptSelf = new MultiplyExceptSelf();
		// [105, 70, 30, 210, 42]
		exceptSelf.divideMethod(array);
		exceptSelf.withoutDivide(array);

	}

	private int[] divideMethod(int array[]) {

		int result[] = new int[array.length];

		int multiple = 1;

		for (int i = 0; i < result.length; i++) {
			multiple = multiple * array[i];
		}

		for (int i = 0; i < array.length; i++) {
			int temp = multiple / array[i];
			result[i] = temp;
		}

		return result;

	}

	private int[] withoutDivide(int array[]) {

		int[] result = new int[array.length];

		int[] left_Products = new int[array.length];

		int[] right_Products = new int[array.length];
		left_Products[0] = 1;
		right_Products[array.length - 1] = 1;

		for (int i = 1; i < array.length; i++) {

			left_Products[i] = array[i - 1] * left_Products[i - 1];
		}

		for (int i = array.length - 2; i >= 0; i--) {

			right_Products[i] = array[i + 1] * right_Products[i + 1];
		}

		for (int i = 0; i < array.length; i++) {

			result[i] = left_Products[i] * right_Products[i];
		}

		return result;

	}

}
