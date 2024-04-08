package PriorityQueue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class DataExtraction {

	
	public static void main(String[] args) {
		
		PriorityQueue q = new PriorityQueue();
		
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);

		
//		Iterator it = q.iterator();
//		while(it.hasNext()) {
//			
//			System.out.println(it.next());
//		}

		
		for(Object ele : q) {
			
			System.out.println(ele);
		}
		
	}
	
	
}
