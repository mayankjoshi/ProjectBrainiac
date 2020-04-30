package my.interview.questions.linkedlist;

import my.interview.questions.tree.Node;

public class ReverseLinkedList {

	Node head = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Head --> 1-->2-->3-->4-->5-->null;

		ReverseLinkedList linkedList = new ReverseLinkedList();

		Node head = linkedList.createLinkedList();
		linkedList.head = head;

		System.out.println(linkedList);

		// Input Head1-->2-->3-->4-->5-->Null
		// Output Head-->5-->4-->3-->2-->1-->Null

		linkedList.reverseLinkedList(head.getRight());

		System.out.println(linkedList);

	}

	private void reverseLinkedList(Node head2) {
		Node prev = null;

		while (head2 != null) {
			Node next = head2.getRight();
			head2.setLeft(prev);

			prev = head2;
			head2 = next;
		}

		head = prev;
	}

	private Node createLinkedList() {
		Node head = new Node();
		head.setValue("Head");

		Node n1 = new Node();
		n1.setValue("1");
		head.setRight(n1);
		n1.setLeft(head);

		Node n2 = new Node();
		n2.setValue("2");
		n1.setRight(n2);
		n2.setLeft(n1);

		Node n3 = new Node();
		n3.setValue("3");
		n2.setRight(n3);
		n3.setLeft(n2);

		Node n4 = new Node();
		n4.setValue("4");
		n3.setRight(n4);
		n4.setLeft(n3);

		Node n5 = new Node();
		n5.setValue("5");
		n4.setRight(n5);
		n5.setLeft(n4);
		n5.setLeft(null);

		return head;
	}

	@Override
	public String toString() {
		Node node = head;
		StringBuilder builder = new StringBuilder();
		builder.append(head.getValue());

		while (node != null) {
			node = node.getRight();
			if (node != null) {
				builder.append(node.getValue() + "-->");
			} else {
				builder.append("Null");
			}
		}
		return builder.toString();

	}

}
