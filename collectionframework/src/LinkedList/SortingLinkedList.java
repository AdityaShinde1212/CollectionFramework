package LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class SortingLinkedList {

	public static void main(String[] args) {

		LinkedList ls =  new LinkedList();
		ls.add(1);
		ls.add(5);
		ls.add(3);
		ls.add(2);
		ls.add(4);
		System.out.println(ls);
		
		//sort and reverse 
		
		Collections.sort(ls);
		System.out.println(ls);
		
		Collections.reverse(ls);
		System.out.println(ls);
		
		//shuffle
		Collections.shuffle(ls);
		System.out.println(ls);
	}

}
