package SHISHIRASIR;

public class ComparisionDemo1 {
	public static void main(String[] args) {
		Double d1 = 36.2;
		Double d2 = 36.2;
		Double d3 = 10.7;
		Double d4 = 64.2;
		System.out.println(d1.compareTo(d2));// 0
		System.out.println(d2.compareTo(d3));// 1
		System.out.println(d3.compareTo(d4));// -1

	}
}
