package arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ReadingDataFromArrayList {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add("Aditya");
		al.add(255);
		al.add(12.75);
		al.add('a');
		al.add(true);

		// method 1 simple for

//		for (int i = 0; i < al.size(); i++) {
//
//			System.out.println(al.get(i));
//
//		}

		// method 2 for each

//		for (Object a : al) {
//
//			System.out.println(a);
//
//		}

		// method 3 Iterator

		Iterator it = al.iterator();

		while (it.hasNext()) {

			System.out.println(it.next());
		}
	}

}
