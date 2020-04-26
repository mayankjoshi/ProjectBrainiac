package my.interview.questions.arrays;

public class Most1InAMatrix {

	public static void main(String[] args) {
		int mat[][] = { { 0, 1, 1, 1, 1 }, { 1, 1, 1, 1, 0 }, { 1, 1, 1, 1, 1 }, { 0, 0, 0, 1, 1 }};
		Most1InAMatrix aMatrix = new Most1InAMatrix();
		System.out.println(aMatrix.getMax1Row(mat));

	}

	private int getMax1Row(int[][] array) {

		int result = 0;
		int maxCount = 0;
		int currentCount = 0;
		int maxCountRow = 0;
		int currentCountRow = 0;

		for (int i = 0; i < array.length; i++) {

			currentCountRow = i;
			currentCount = 0;
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] == 1) {
					currentCount += 1;
				}

				if (maxCount < currentCount) {
					maxCount = currentCount;
					maxCountRow = currentCountRow;
				}
			}

		}

		result = maxCountRow;

		return result;
	}

}
