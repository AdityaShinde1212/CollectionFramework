package LinkedList;

import java.util.LinkedList;
import java.util.List;

public class DefiningLinkedList {

	
	public static void main(String[] args) {
		
		LinkedList ls = new LinkedList();
		
		//Add
		ls.add("1");
		ls.add("audi");
		ls.add(55);
		ls.add(true);
		ls.add('a');
		ls.add("str");
		ls.add(25);
		System.out.println(ls);
			
		//Add index
		ls.add(5, "xyz");
		System.out.println(ls);
		
	    //size()
		System.out.println(ls.size());
		
		//contains
		System.out.println(ls.contains('a'));
		
		//remove
		ls.remove(true);
		System.out.println(ls);
		
		//get
		System.out.println(ls.get(5));
		
		//set
		ls.set(5, "string");
		System.out.println(ls);
		
		//isEmpty
		System.out.println(ls.isEmpty());
		
		
		//addAll
		List<Integer> ls1 =  new LinkedList<Integer>();
		ls1.add(1);
		ls1.add(2);
		ls1.add(3);
		ls.addAll(ls1);
		System.out.println(ls);
		
		//removeAll
		LinkedList <Double> ls2 = new LinkedList<Double>();
		ls2.add(12.23);
		ls2.add(1.1);
		
		ls.addAll(ls2);
		System.out.println(ls);
		
		ls.removeAll(ls2);
		System.out.println("after remove all : " + ls );
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
