package SHISHIRASIR;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class AlcopyDemo {
	public static void main(String[] args) {
		LinkedHashSet<Double> lho = new LinkedHashSet<Double>();
		lho.add(25.6);
		lho.add(10.6);
		lho.add(6587.24);
		lho.add(95.01);
		ArrayList<Double> List = new ArrayList<Double>(lho);

		System.out.println(lho);
		System.out.println(List);
	}
}
