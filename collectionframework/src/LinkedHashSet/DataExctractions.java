package LinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class DataExctractions {

	public static void main(String[] args) {

		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add("aditya");
		lhs.add(true);
		lhs.add(10.27);
		lhs.add(10);
		lhs.add('a');
		
		System.out.println(lhs);
		
//		for(Object l : lhs) {
//			
//			System.out.println(l);
//		}

		Iterator it = lhs.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
		
		
		
		
	}

}
