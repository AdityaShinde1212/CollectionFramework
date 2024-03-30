package HashSet;

import java.util.HashSet;

public class OtherOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet h = new HashSet();
		h.add(1);
		h.add(2);
		h.add(3);
		h.add(4);
		h.add(5);

		System.out.println("HashSet 1 : " + h);

		HashSet s = new HashSet();
		s.add(3);
		s.add(4);
		s.add(5);

		System.out.println("HashSet 2 : " + s);

		// union
		// h.addAll(s);
		// System.out.println(h);

		// intersection
		// h.retainAll(s);
		// System.out.println("inserction: " + h);

		// difference
		// h.removeAll(s);
		// System.out.println("difference: " + h);

	    //subset
		h.containsAll(s);
		System.out.println(h);
	
	
	}

}
