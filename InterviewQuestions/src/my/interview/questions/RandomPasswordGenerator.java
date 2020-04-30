package my.interview.questions;

public class RandomPasswordGenerator {

	private String charString = "ABCDEFGHIJKLMOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	private String numberString = "0123456789";
	private String specialCharString = "!@#$";

	public static void main(String[] args) {

		RandomPasswordGenerator randomPasswordGenerator = new RandomPasswordGenerator();

		int sizeOfPassword = 8;
		StringBuilder builder = new StringBuilder();

		for (int i = 0; i < sizeOfPassword - 2; i++) {
			String ch = randomPasswordGenerator.generateRandomChar(randomPasswordGenerator.charString);
			builder.append(ch);
		}
		builder.setLength(sizeOfPassword);
		String str = randomPasswordGenerator.generateRandomChar(randomPasswordGenerator.numberString);
		int randomIndexForNumberInsertion = (int) (Math.random() * sizeOfPassword);
		try {
			builder.insert(randomIndexForNumberInsertion, str);
		} catch (Exception e) {
			System.err.println(randomIndexForNumberInsertion + e.toString());
		}

		String str1 = randomPasswordGenerator.generateRandomChar(randomPasswordGenerator.specialCharString);
		int randomIndexForSpecialInsertion = (int) (Math.random() * sizeOfPassword);

		builder.insert(randomIndexForSpecialInsertion, str1);

		System.out.println(builder);

	}

	private String generateRandomChar(String str) {

		int randomIndex = (int) (Math.random() * str.length());
		String randomChar = str.substring(randomIndex, randomIndex + 1);
		return randomChar;
	}

}
