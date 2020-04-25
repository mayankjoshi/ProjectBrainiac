package my.interview.questions.arrays;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.lang.Comparable;
import java.util.List;
import static java.util.Arrays.*;

class MyIter<T extends Comparable> implements Iterator {
	class IterState implements Comparable<IterState> {
		private Iterator<T> iter;
		private T currVal;

		public IterState(Iterator<T> i) {
			iter = i;
			next();
		}

		public T getVal() {
			return currVal;
		}

		public boolean hasNext() {
			return iter.hasNext();
		}

		public void next() {
			if (iter.hasNext()) {
				currVal = iter.next();
			} else {
				currVal = null;
			}
		}

		public int compareTo(IterState o) {
			return currVal.compareTo(o.getVal());
		}
	}

	private PriorityQueue<IterState> states;

	public MyIter(List<List<T>> listOfList) {
		states = new PriorityQueue<IterState>();
		for (List<T> l : listOfList) {
			Iterator<T> it = l.iterator();
			if (it.hasNext()) {
				states.add(new IterState(it));
			}
		}
	};

	public T next() {
		IterState n = states.poll();
		T retval = n.getVal();
		// if there is more in the current list, then put it back in the queue
		if (n.hasNext()) {
			n.next();
			states.add(n);
		}
		return retval;
	};

	public boolean hasNext() {
		return !states.isEmpty();
	}
}

public class CustomItertatorForKSortedArrays {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private static ArrayList toArray(List<List<? extends Object>> list) {
		
		MyIter i = new MyIter(list);
		ArrayList retval = new ArrayList();
	// This is nothing but merging the K sorted arrays.
		while (i.hasNext()) {
			retval.add(i.next());
		}
		return retval;
	}

	public static void main(String[] args) {
		System.out.println("Hello world!");

		@SuppressWarnings("rawtypes")
		ArrayList arr = toArray(
				asList(asList(1, 3, 5), asList(2, 4, 6), asList(7, 9), asList(8), asList(0, 10), asList()));

		for (Object i : arr) {
			System.out.println(i);
		}

//		arr = toArray(asList());
//		for (Object i : arr) {
//			System.out.println(i);
//		}

	}
}