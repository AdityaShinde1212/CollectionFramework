package HashSet;

import java.util.HashSet;

public class DefiningHashSet {

	public static void main(String[] args) {
	
		//Defining
		HashSet hs = new HashSet();
//		HashSet hs1 = new HashSet(100);
//		HashSet hs2 = new HashSet(100,0.90f);

		hs.add(11);
		hs.add(2.77);
		hs.add('a');
		hs.add("abc");
		hs.add(false);
		System.out.println(hs);
	
	   System.out.println(hs.size());
	   
	   System.out.println(hs.contains("abc"));
	   
	   System.out.println(hs.isEmpty());
	
	   hs.remove('a');
	   
	   System.out.println(hs);
	   
	   
	  
	}
	
}
