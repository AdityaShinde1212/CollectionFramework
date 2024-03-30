package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class ReadingLinkedList {

	public static void main(String[] args) {

		LinkedList ls = new LinkedList();
		ls.add(1);
		ls.add(5);
		ls.add(3);
		ls.add(2);
		ls.add(4);

//		for (int i = 0; i < ls.size(); i++) {
//
//			System.out.println(ls.get(i));
//			
//		}

//		for(Object l : ls) {
//			
//			System.out.println(l);
//		}

		Iterator it = ls.iterator();
		while (it.hasNext()) {

			System.out.println(it.next());
		}

	}

}
