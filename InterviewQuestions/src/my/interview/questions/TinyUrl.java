package my.interview.questions.tinyUrl;

import java.util.concurrent.ThreadLocalRandom;

public class TinyUrl {

	private static String base62CharString = "ABCDEFGHIJKLMNOPQRSTUVWXZabcdefghijklmnopqrstuvwxyz0123456789";
	private static final String BASE62_CHAR_STRING = base62CharString;
	static final String BASE_HOST = "http://tinyurl.com/";

	public static void main(String[] args) {

		TinyUrl tinyUrl = new TinyUrl();
		System.out.println(tinyUrl.generateRandomShortUrl());

	}

	private String generateRandomShortUrl() {

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < 7; i++) {
			int randomIndex = ThreadLocalRandom.current().nextInt(0, BASE62_CHAR_STRING.length());
			sb.append(BASE62_CHAR_STRING.charAt(randomIndex));
		}
		String shortUrl = BASE_HOST + sb.toString();
		return shortUrl;
	}
}
