package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class SorttingArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(2);
		al.add(1);
		al.add(4);
		al.add(3);
		System.out.println("Before Sortting : " + al);

		Collections.sort(al);
		System.out.println("After sorting : " + al);

		Collections.shuffle(al);
		System.out.println("After shuffle : " + al);
	}

}
