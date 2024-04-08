package HashMap;

import java.util.HashMap;
import java.util.Map;

public class DefiningHashMap {

	public static void main(String[] args) {

		HashMap hm = new HashMap();

		// HashMap<Integer, String> m = new HashMap<Integer ,String>();
		// Map<Integer, String> m = new HashMap<Integer ,String>();

		hm.put(101, "Tom");
		hm.put(102, "Toss");
		hm.put(103, "fed");
		hm.put(104, "jack");
		hm.put(101, "john"); // Duplicate key not allowed old value replace with new one
		hm.put(null, "jerry"); // Only single null key allowed
		hm.put(105, "Tom"); // Duplicate values are allowed

		System.out.println("HashMap 1 : " + hm);

	}

}
