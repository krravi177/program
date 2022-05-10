package SHISHIRASIR;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class DifferentSetDemo {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		hs.add("orchid");
		hs.add("rose");
		hs.add("hibiscous");
		hs.add("lotus");
		hs.add("orchid");
		hs.add("null");
		hs.add("irsl");
		hs.add("null");
		hs.add("lotus");
		System.out.println(hs);
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		lhs.add("orchid");
		lhs.add("rose");
		lhs.add("hibiscous");
		lhs.add("lotus");
		lhs.add("orchid");
		lhs.add("null");
		lhs.add("irsl");
		lhs.add("null");
		lhs.add("lotus");
		System.out.println(lhs);
//TreeSet<String>ts=new TreeSet<>();
		TreeSet<String> ts = new TreeSet<>(Collections.reverseOrder());
		ts.add("orchid");
		ts.add("rose");
		ts.add("hibiscous");
		ts.add("lotus");
		ts.add("orchid");
		ts.add("null");
		ts.add("irsl");
		ts.add("null");
		ts.add("lotus");
		System.out.println(ts);
	}
}
