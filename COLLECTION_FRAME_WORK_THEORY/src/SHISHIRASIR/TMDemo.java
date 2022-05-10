package SHISHIRASIR;

import java.util.Collections;
import java.util.TreeMap;

public class TMDemo {
	public static void main(String[] args) {
		// TreeMap<String, String>tm=new TreeMap<>();
		TreeMap<String, String> tm = new TreeMap<>(Collections.reverseOrder());
		tm.put("dohni", "csk");
		tm.put("abd", "rcb");
		tm.put("rohit", "mi");
		tm.put("jadeja", "csk");
		tm.put("null", "rr");
		tm.put("kohli", "rcb");
		System.out.println(tm);
	}
}
