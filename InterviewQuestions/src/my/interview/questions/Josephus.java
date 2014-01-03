package my.interview.questions;

/**
 * There are people standing in a circle waiting to be executed. The counting
 * out begins at some point in the circle and proceeds around the circle in a
 * fixed direction. In each step, a certain number of people are skipped and the
 * next person is executed. The elimination proceeds around the circle (which is
 * becoming smaller and smaller as the executed people are removed), until only
 * the last person remains, who is given freedom. The task is to choose the
 * place in the initial circle so that you are the last one remaining and so
 * survive.
 * 
 * @author mjoshi
 * 
 */
public class Josephus {
	
	
	public static void main(String args[]) {
		Josephus josephus = new Josephus();
		System.out.println(josephus.josephus(100, 6));
		
	}

	int josephus(int n, int k) {
		return josephus(n, k, 1);
	}

	int josephus(int n, int k, int startingPoint) {
		if (n == 1)
			return 1;
		int newSp = (startingPoint + k - 2) % n + 1;

		int survivor = josephus(n - 1, k, newSp);
		if (survivor < newSp) {
			return survivor;
		} else
			return survivor + 1;
	}

}
