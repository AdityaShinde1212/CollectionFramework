package HashMap;

import java.util.HashMap;

public class MethodsInHashMap {

	public static void main(String[] args) {
		
		HashMap m = new HashMap();
		m.put(101,"Tom");
		m.put(102, "Jerry");
		m.put(103, "Scoby");
		m.put(104, "Noddy");
		m.put(105, "ShinChan");
		
		System.out.println("HashMap 1 : " + m);
		
		HashMap m2 = new HashMap();
		
		m2.put(106, "dx");
		m2.put(107, "ax");
		
		System.out.println("HashMap 2 : " + m2);
		
		
	
		System.out.println(m.size());
		
		System.out.println(m.get(103));
		
		m.remove(103);
		
		System.out.println("After Remove : " + m);

		System.out.println(m.containsKey(103));
		
		System.out.println(m.containsValue("ShinChan"));
		
		m.putAll(m2);
		
		System.out.println("After put all : " + m);
		
		System.out.println("Before remove all : " + m2);

		m2.clear();
		
		System.out.println("After remove all : " + m2);
		
		
		
		
		
		
		
		
		
	}
	
}
