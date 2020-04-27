package my.interview.questions.tree;

public class SortedArrayToBST {

	public static void main(String[] args) {

		int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		SortedArrayToBST arrayToBST = new SortedArrayToBST();
		Node rootNode = arrayToBST.arrayToBinaryTree(array, 0, array.length - 1);

		arrayToBST.preOrder(rootNode);

	}

	private Node arrayToBinaryTree(int array[], int start, int end) {

		if (start > end) {
			return null;
		}

		// Find the middle Node.

		int mid = (start + end) / 2;
		Node rootNode = null;
		rootNode = new Node();
		rootNode.setValue(array[mid]);

		rootNode.setLeft(arrayToBinaryTree(array, start, mid - 1));

		rootNode.setRight(arrayToBinaryTree(array, mid + 1, end));

		return rootNode;

	}

	private void preOrder(Node node) {
		if (node == null) {
			return;
		}
		System.out.print(node.getValue() + " ");
		preOrder(node.getLeft());
		preOrder(node.getRight());
	}

}
