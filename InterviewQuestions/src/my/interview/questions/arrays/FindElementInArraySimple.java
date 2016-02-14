package my.interview.questions.arrays;

public class FindElementInArraySimple {
	static int arr[] = new int[10];

	public static void main(String args[]) {

		arr[0] = 77;
		arr[1] = 99;
		arr[2] = 44;
		arr[3] = 55;
		arr[4] = 22;
		arr[5] = 88;
		arr[6] = 11;
		arr[7] = 00;
		arr[8] = 66;
		arr[9] = 33;
		findSimple(26);
		findSimple(00);
		findSimple(66);
		deleteSimple(26);
		deleteSimple(66);
		deleteSimple(33);
		show();

	}

	private static void show() {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
	}

	private static void findSimple(int number) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == number) {
				System.out.println("NUmber found at " + i);
			}
		}

	}

	private static void deleteSimple(int number) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == number) {
				System.out.println("Number to delete found at " + i);
				for (int j = i; j < arr.length; j++) {
					arr[j] = arr[i + 1];
				}
				break;

			}
		}

	}

}
