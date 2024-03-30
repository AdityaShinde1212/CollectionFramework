package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrayToArrayList {

	public static void main(String[] args) {

		String[] str = { "java", "c#", "c++", "ruby" };
		List al = new ArrayList(Arrays.asList(str));

		System.out.println(al);
	}

}
