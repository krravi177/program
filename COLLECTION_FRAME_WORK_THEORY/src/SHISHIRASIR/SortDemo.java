package SHISHIRASIR;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortDemo {
	public static void main(String[] args) {
		String[] names = { "balya", "yash", "alluarjun", "salman" };
		for (String name : names) {
			System.out.println(name);
		}
		Arrays.sort(names);
		System.out.println("--------");
		for (String name : names) {
			System.out.println(name);
		}
		System.out.println("-------------------------");
		List<String> lst = new ArrayList();
		lst.add("tiger");
		lst.add("loin");
		lst.add("donkey");
		lst.add("Zebra");
		lst.add("alligator");
		lst.add("deer");
		System.out.println(lst);
		Collections.sort(lst);
		System.out.println(lst);
		Collections.sort(lst, Collections.reverseOrder());
		System.out.println(lst);

	}

}
