package my.interview.questions;

public class TowerOfHanoi {

	public static void main(String[] args) {
		TowerOfHanoi hanoi = new TowerOfHanoi();
		hanoi.solve(3, "A", "B", "C");
	}

	public void solve(int n, String start, String auxilliary, String end) {
		if (n == 1) {
			System.out.println(start + "--> " + end);
		} else {
			solve(n - 1, start, end, auxilliary);
			System.out.println(start + "--> " + end);
			solve(n - 1, auxilliary, start, end);
		}
	}
}
