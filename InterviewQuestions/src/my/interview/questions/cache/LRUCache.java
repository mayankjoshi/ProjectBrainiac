package my.interview.questions.cache;

import java.util.HashMap;

import my.interview.questions.tree.Node;

public class LRUCache {

	Node head = null;
	Node tail = null;
	HashMap map;
	private int capacity;

	public LRUCache(int capacity) {
		this.capacity = capacity;
		map = new HashMap(capacity);
		head = new Node();
		tail = new Node();
		head.setRight(tail);
		head.setLeft(tail);
		tail.setLeft(head);
		tail.setRight(head);
	}

	public void put(Object key, Object value) {
		if (key == null) {
			return;
		}

		if (map.containsKey(key)) {
			return;
		}
		Node newNode = new Node();
		newNode.setValue(value);
		newNode.setKey(key);
		Node currentTopNode = head.getRight();
		if (map.size() < capacity) {
			// Put the key in the head.
			head.setRight(newNode);
			currentTopNode.setLeft(newNode);
			newNode.setRight(currentTopNode);
			map.put(key, newNode);
		} else {
			// This means that we have to remove the tailNode but one.
			map.remove(tail.getLeft().getKey());
			tail.setLeft(tail.getLeft().getLeft());
			// Now add new Node.
			head.setRight(newNode);
			currentTopNode.setLeft(newNode);
			newNode.setRight(currentTopNode);

			map.put(key, newNode);
		}

	}

	public Object get(Object key) {

		if (!map.containsKey(key)) {
			return null;
		}

		Node node = (Node) map.get(key);
		Object valueToReturn = node.getValue();

		// As this node is now accessedd bring it to front of list.

		Node leftNode = node.getLeft();
		Node rightNode = node.getRight();
		Node headRight = head.getRight();
		node.setRight(headRight);
		headRight.setLeft(node);
		head.setRight(node);

		return valueToReturn;

	}

	public static void main(String args[]) {

		LRUCache lruCache = new LRUCache(3);
		lruCache.put("1", "1 value");
		lruCache.put("2", "2 value");
		lruCache.put("3", "3 value");

		System.out.println(lruCache);
		lruCache.put("4", "4 value");
		System.out.println(lruCache);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return map.toString();
	}

}
