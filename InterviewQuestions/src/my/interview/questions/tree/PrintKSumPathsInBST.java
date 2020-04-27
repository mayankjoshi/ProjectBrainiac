package my.interview.questions.tree;

import java.util.Vector;

public class PrintKSumPathsInBST {

	private Vector<Integer> path = new Vector<Integer>();

	public static void main(String[] args) {
		// Create a Tree first
		int array[] = { 1, 2, 3, 4, 5, 6, 7 };
		SortedArrayToBST arrayToBST = new SortedArrayToBST();
		Node rootNode = arrayToBST.arrayToBinaryTree(array, 0, array.length - 1);
		System.out.println("-----------------------------");
		arrayToBST.preOrder(rootNode);
		System.out.println("\n");
		System.out.println("-----------------------------");
		PrintKSumPathsInBST inBST = new PrintKSumPathsInBST();

		inBST.printKPath(rootNode,7 );
	}

	private void printKPath(Node root, int k) {
		// empty node
		if (root == null)
			return;

		// add current node to the path
		path.add((Integer) root.getValue());

		// check if there's any k sum path
		// in the left sub-tree.
		printKPath(root.left, k);

		// check if there's any k sum path
		// in the right sub-tree.
		printKPath(root.right, k);

		// check if there's any k sum path that
		// terminates at this node
		// Traverse the entire path as
		// there can be negative elements too
		int f = 0;
		for (int j = path.size() - 1; j >= 0; j--) {
			f += path.get(j);

			// If path sum is k, print the path
			if (f == k) {
				printVector(path, j);
			}
		}

		// Remove the current element from the path
		path.remove(path.size() - 1);
	}

	static void printVector(Vector<Integer> v, int i) {
		for (int j = i; j < v.size(); j++)
			System.out.print(v.get(j) + " ");
		System.out.println();
	}

}
