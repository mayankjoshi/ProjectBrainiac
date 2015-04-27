package my.projects.amazonInterviews;

public class StringPermutation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		permutation("Abc", "");

	}

	static void permutation(String input, String so_far) {
		if (input.equals(""))
			System.out.println(so_far);

		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);

			if (input.indexOf(c, i + 1) != -1) {
				continue;
			}

			String substring1 = input.substring(0, i);
			String substring2 = input.substring(i + 1);
			String so_far2 = so_far
					+ c;
			permutation(substring1 + substring2, so_far2);
		}
	}

}
