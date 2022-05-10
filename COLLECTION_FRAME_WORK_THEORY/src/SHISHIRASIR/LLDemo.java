package SHISHIRASIR;

import java.util.LinkedList;

public class LLDemo {
	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<>();
		ll.add("lotus");
		ll.add("rose");
		ll.add("jasmine");
		ll.add("hibscus");
		ll.add(2, "orchid");
		System.out.println(ll);
	}
}
