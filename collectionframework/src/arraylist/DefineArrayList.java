package arraylist;

import java.util.ArrayList;
import java.util.List;

public class DefineArrayList {

	public static void main(String[] args) {

		ArrayList al = new ArrayList(); // general way

		// method1 add --> 1 orv.add(value) --> 2 orv.add(index,value)

		al.add("Aditya");
		al.add(255);
		al.add(12.75);
		al.add('a');
		al.add(true);
		System.out.println(al);

		al.add(3, "addByIndex");
		System.out.println("After adding by using index : " + al);

		// method2 size() ---> orv.size() --> return int
		System.out.println(al.size());

		// method3 remove() --> orv.remove(index)
		al.remove(3);
		System.out.println("after remove using inedx : " + al);
		al.remove(12.75);
		System.out.println("after remove using object : " + al);

		// method4 get --> orv.get(index)
		System.out.println(al.get(1));

		// method5 set --> orv.set(index, newvalue)
		al.set(1, 127);
		System.out.println("After set : " + al);

		// method6 contains() --> orv.contains(object) --> return boolean
		System.out.println(al.contains("Aditya"));

		// method7 isEmpty() --> orv.isEmpty() --> return boolean
		System.out.println(al.isEmpty());

		// method8 add all()
		// method2 to define ArrayList = generic to restrict collection to accept
		// homogeneous data
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(1);
		ar.add(2);
		ar.add(6);
		ar.add(5);
		ar.add(4);
		System.out.println("Before addAll " + al);
		System.out.println("Before addAll " + ar);

		al.addAll(ar);
		System.out.println("After addAll " + al);

		// method9 remove all()
		// method3 to define ArrayList = using return type list

		List<Integer> as = new ArrayList<Integer>();
		as.add(11);
		as.add(21);
		as.add(31);
		as.add(41);
		as.add(51);
		al.addAll(as);
		System.out.println("before remove all : " + al);

		al.removeAll(as);
		System.out.println("After remove all : " + al);

	}

}
