package my.interview.questions.stack;

import java.util.Scanner;

/**
 * This class will reverse a String using Custom Stack implementation
 * 
 * @author Mayank Joshi
 * 
 */
public class Stack {

	private final int stackArray[];
	private int topItemIndex;
	private final int maxSize;

	public Stack(int size) {
		if (size < 0) {
			maxSize = 10;
		} else {
			maxSize = size;
		}
		this.stackArray = new int[maxSize];
		topItemIndex = -1;
	}

	public void push(final int item) {
		if (topItemIndex < (maxSize - 1)) {
			stackArray[++topItemIndex] = item;
		} else {
			throw new StackOverflowError();
		}
	}

	public int pop() {
		int toReturn = -1;
		if (topItemIndex >= 0) {
			toReturn = stackArray[topItemIndex--];
		}
		return toReturn;
	}

	public int peek() {
		return stackArray[topItemIndex];
	}

	public void display() {
		for (int i = 0; i < stackArray.length; i++) {
			System.out.println((char) pop());
		}

	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your full name: ");
		String name = scanner.nextLine();

		char[] charArray = name.toCharArray();
		Stack stack = new Stack(13);

		for (int i = 0; i < charArray.length; i++) {
			stack.push(charArray[i]);
		}
		stack.display();
	}

}
