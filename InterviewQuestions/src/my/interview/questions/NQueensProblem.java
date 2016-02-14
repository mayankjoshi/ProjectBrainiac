package my.interview.questions;

public class NQueensProblem {

	int[] x;

	public NQueensProblem(int i) {
		x = new int[i];
	}

	public static void main(String[] args) {
		NQueensProblem nQueensProblem = new NQueensProblem(8);
		nQueensProblem.callPlaceQuens();
	}

	private boolean canPlaceQueens(int r, int c) {
		for (int i = 0; i < r; i++) {
			if (x[i] == c || (i - r) == (x[i] - c) || (i - r) == (c - x[i])) {
				return false;
			}

		}
		return true;
	}

	private void printQueens(int[] x) {
		int N = x.length;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (x[i] == j) {
					System.out.print(" Q ");
				} else {
					System.out.print(" * ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}

	private void placeQueens(int r, int n) {
		for (int c = 0; c < n; c++) {
			if (canPlaceQueens(r, c)) {
				x[r] = c;
				if (r == n - 1) {
					printQueens(x);
				} else {
					placeQueens(r + 1, n);
				}
			}
		}

	}

	private void callPlaceQuens() {
		placeQueens(0, x.length);
	}
}
