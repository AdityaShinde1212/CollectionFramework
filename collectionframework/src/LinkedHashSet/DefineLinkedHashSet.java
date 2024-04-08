package LinkedHashSet;

import java.util.LinkedHashSet;

public class DefineLinkedHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// define LinkedHashSet
		LinkedHashSet lhs = new LinkedHashSet();

		// LinkedHashSet<String> l = new LinkedHashSet<String>();
		// LinkedHashSet<String> l = new LinkedHashSet<String>(20,(float) 0.90);
		
		lhs.add(10);
		lhs.add("aditya");
		lhs.add('a');
		lhs.add(11.289);
		lhs.add(true);
		
		System.out.println(lhs);
		
		System.out.println(lhs.size());
		
		System.out.println(lhs.contains('a'));
		
		System.out.println(lhs.isEmpty());
		
		lhs.remove('a');
		
		System.out.println("after remove : " + lhs);

		
	}

}
