package LinkedHashSet;

import java.util.LinkedHashSet;

public class OtherOperations {

	public static void main(String[] args) {

		LinkedHashSet l1 = new LinkedHashSet();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(5);

		System.out.println("LinkedHashSet 1 : " + l1);

		LinkedHashSet l2 = new LinkedHashSet();
		l2.add(3);
		l2.add(4);
		l2.add(5);

		System.out.println("LinkedHashSet 2 : " + l2);

		
		//union -->  addAll
//		l1.addAll(l2);
//		System.out.println("After addAll : " + l1);

		
		//Intersection --> retainAll
//		l1.retainAll(l2);
//		System.out.println("After retainAll : " + l1 );
		
        //difference --> deleteAll		
//		l1.removeAll(l2);
//		System.out.println("After removeAll : " + l1);

		
		
	
	
	
	
	}

}
