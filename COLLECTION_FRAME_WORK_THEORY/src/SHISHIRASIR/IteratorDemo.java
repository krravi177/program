package SHISHIRASIR;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class IteratorDemo {
	public static void main(String[] args) {
		Collection<String> ll = new LinkedList<>();
		ll.add("Lotus");
		ll.add("Rose");
		ll.add("Hibscus");
		Iterator<String> itr = ll.iterator();
		/*
		 * System.out.println(itr.next()); System.out.println(itr.next());
		 * System.out.println(itr.next());
		 */
		Iterator<String> itra = ll.iterator();
		while (itr.hasNext())
			;
		{
			String fwr = itr.next();
			System.out.println(fwr);
		}
	}
}
