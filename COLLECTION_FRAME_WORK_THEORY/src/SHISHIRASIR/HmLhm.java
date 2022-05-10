package SHISHIRASIR;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class HmLhm {
	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<>();
		hm.put("dohni", "csk");
		hm.put("abd", "rcb");
		hm.put("rohit", "mi");
		hm.put("jadeja", "csk");
		hm.put("null", "rr");
		hm.put("kohli", "rcb");
		System.out.println(hm);
		LinkedHashMap<String, String> ltm = new LinkedHashMap<>();
		ltm.put("dohni", "csk");
		ltm.put("abd", "rcb");
		ltm.put("rohit", "mi");
		ltm.put("jadeja", "csk");
		ltm.put("null", "rr");
		ltm.put("kohli", "rcb");
		System.out.println(ltm);
	}
}
