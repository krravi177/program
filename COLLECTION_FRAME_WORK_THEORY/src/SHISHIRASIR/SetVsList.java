package SHISHIRASIR;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class SetVsList {
	public static void main(String[] args) {
		List<String> lst = new LinkedList<>();
		lst.add("mango");
		lst.add("orange");
		lst.add("jackfruit");
		lst.add("mango");
		lst.add("apple");

		Set<String> set = new HashSet<>();
		set.add("mango");
		set.add("orange");
		set.add("jackfruit");
		set.add("mango");
		set.add("apple");
		System.out.println(lst);
		System.out.println(set);
	}
}
