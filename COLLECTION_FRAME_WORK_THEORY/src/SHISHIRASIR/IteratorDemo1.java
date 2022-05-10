package SHISHIRASIR;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class IteratorDemo1 {
	public static void main(String[] args) {
		List<String> lst = new LinkedList<>();
		lst.add("Apple");
		lst.add("Mango");
		lst.add("Orange");
		ListIterator<String> ListItrBwkd = lst.listIterator(lst.size());
		while (ListItrBwkd.hasPrevious()) {
			String frt = ListItrBwkd.previous();
			System.out.println(frt);
		}
	}
}
