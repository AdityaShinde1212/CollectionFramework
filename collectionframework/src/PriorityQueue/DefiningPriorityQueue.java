package PriorityQueue;

import java.util.PriorityQueue;

public class DefiningPriorityQueue {

	public static void main(String[] args) {

		PriorityQueue q = new PriorityQueue();

//		q.add('a');
//		q.add(1);
//		q.add(1.1);
//		q.add(true);
//		q.add("aditya");
//		
//		System.out.println(q); //class cast exception occurs heterogeneous data not allowed

		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);

		System.out.println(q);

		System.out.println(q.size());

		System.out.println(q.isEmpty());

		System.out.println(q.contains(1));

		// To get first element from queue
		System.out.println(q.element());// queue is empty then NoSuchElementException
		System.out.println(q.peek());// queue is empty then return null
		System.out.println(q.poll());// queue is empty then return null

		// Remove
		System.out.println("Before :  " + q);
		q.remove(1);
		System.out.println("After : " + q);

	}

}
