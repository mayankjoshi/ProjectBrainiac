package my.interview.questions.arrays;

import java.util.Arrays;

/*given an array representing a non-negative integer (ex: 123 represented as [1,2,3]), return the next integer (output: [1,2,4])
.run through all edge cases (ex: [9,9,9,9,9,9,9,9] etc)
*/
public class IncreasingArray {

	public static void main(String args[]) {
		int[] input = new int[] { 9, 9, 9, 9, 9 };

		System.out.println("Next is ==>" + Arrays.toString(getNext(input)));

	}

	// This will just convert the array to string and then to number and then add 1
	// to it and then create another array with that length, convert the number back
	// to string and fill array with charAt
	public static int[] getNext(int[] inputArr) {
		String inputArrStr = Arrays.toString(inputArr).replaceAll("\\[|\\]|,|\\s", "");
		int number = Integer.parseInt(inputArrStr);
		number = number + 1;
		String newNumber = String.valueOf(number);
		char[] newNumberArr = newNumber.toCharArray();

		int[] result = new int[newNumber.length()];

		for (int i = 0; i <= newNumber.length() - 1; i++) {
			result[i] = Character.getNumericValue(newNumberArr[i]);
		}

		return result;

	}
}
