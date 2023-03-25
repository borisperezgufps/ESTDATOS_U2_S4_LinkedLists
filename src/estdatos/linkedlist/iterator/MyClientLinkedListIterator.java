package estdatos.linkedlist.iterator;

import java.util.Iterator;

public class MyClientLinkedListIterator {

	public static void main(String[] args) {

		LinkedListIterator<String> lli = new LinkedListIterator<>();

		Iterator<String> lliIterator = lli.iterator();
		while (lliIterator.hasNext()) {
			String airport = (String) lliIterator.next();
			System.out.println(airport);
		}

	}

}
