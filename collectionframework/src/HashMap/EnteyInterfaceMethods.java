package HashMap;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class EnteyInterfaceMethods {

	public static void main(String[] args) {

		HashMap<Integer, String> m = new HashMap<Integer, String>();
		m.put(101, "Tom");
		m.put(102, "Jerry");
		m.put(103, "Scoby");
		m.put(104, "Noddy");
		m.put(105, "ShinChan");

		// METHDO 1
		Set keys = m.keySet(); // return SET all values are unique

		System.out.println(keys);

		for (Object key : keys) {

			System.out.println(key);
		}

		System.out.println();

		// METHOD 2
		for (Object key : keys) {

			System.out.println(m.get(key)); // Returns Values of Keys
		}

		System.out.println();

		// METHOD 3
		Collection values = m.values(); // Return collection because duplicates are allowed

		System.out.println(values);

		for (Object value : values) {

			System.out.println(value);

		}

		System.out.println();
		
		// METHOD 4

		// for (Map.Entry<Integer, String> entry : m.entrySet()){

		// or

		for (Map.Entry entry : m.entrySet()) {

			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		System.out.println();
		
		//Method 5
		
		
	 Set s =  m.entrySet();
	 
	 Iterator it = s.iterator();
	 
	 while(it.hasNext()) {
		 
	      Map.Entry entry = (Entry) it.next();
	      
	      System.out.println(entry.getKey() + "  " + entry.getValue());
	 }
		
		
	}

}
