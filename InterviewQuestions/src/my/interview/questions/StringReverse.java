package my.interview.questions;

public class StringReverse {

	public static void main(String args[]) {

		String str = "Hello World";
		reverse(str);

	}

	private static void reverse(String str) {
		System.out.println("Original String..." + str);
		// Complete flip of chars
		System.out.println("Complete flip of chars...");
		char[] charArray = str.toCharArray();
		char[] flippedStringChar = new char[charArray.length];
		int j = 0;
		for (int i = charArray.length - 1; i >= 0; i--) {
			flippedStringChar[j] = charArray[i];
			System.out.print(flippedStringChar[j]);
			j++;
		}
		String flippedString = new String(flippedStringChar);
		System.out.println();

		// Only word flip;
		System.out.println("Only word flip...");
		// Split the String assuming the word separator is a Space
		String[] split = flippedString.split(" ");
		for (int i = 0; i < split.length; i++) {
			String str1 = split[i];
			char[] charArray2 = str1.toCharArray();
			for (int k = charArray2.length - 1; k >= 0; k--) {
				System.out.print(charArray2[k]);
			}
			System.out.print(" ");
		}

	}

	private static void reverse2(String str) {
		char[] charArray = str.toCharArray();
		for (int i = 0, j = charArray.length - 1; i <= (charArray.length) / 2; i++, j--) {
			swap(charArray, i, j);
		}
		for (int i = 0; i < charArray.length; i++) {
			System.out.print(charArray[i]);
		}
	}

	private static void swap(char[] charArray, int a, int b) {
		char c = charArray[a];
		charArray[b] = charArray[a];
		charArray[a] = c;

	}

}
