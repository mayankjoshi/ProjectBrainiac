package my.interview.questions.series;

public class FibbonicciSeries {

	// 1,1,2,3,5,8,11

	public static void main(String arhs[]) {

		FibbonicciSeries fibbonicciSeries = new FibbonicciSeries();
		fibbonicciSeries.fibbo(10);
	}

	private void fibbo(int n) {

		for (int i = 1; i <= n; i++) {
			System.out.print(fibonacciRecusion(i) + " ");
		}

		System.out.println();

		// for (int i = 1; i <= n; i++) {
		fibonacciLoop(n);
		// }

		System.out.println(fib(10));

	}

	private int fibonacciRecusion(int n) {
		if (n == 1 || n == 2) {
			return 1;
		}

		return fibonacciRecusion(n - 1) + fibonacciRecusion(n - 2);
	}

	public static void fibonacciLoop(int number) {
		int fibo1 = 1, fibo2 = 1, fibonacci = 1;
		System.out.print(fibo1 + " " + fibo2 + " ");
		for (int i = 3; i <= number; i++) {
			fibonacci = fibo1 + fibo2;
			fibo1 = fibo2;
			fibo2 = fibonacci;
			System.out.print(fibonacci + " ");

		}

	}

	private double fib(int n) {
		double root5 = Math.sqrt(5);
		double gr = (1 + root5) / 2;
		double igr = 1 - gr;
		double value = (Math.pow(gr, n) - Math.pow(igr, n)) / root5;

		// round it to the closest integer since floating
		// point arithmetic cannot be trusted to give
		// perfect integer answers.
		return Math.floor(value + 0.5);
	}

}
