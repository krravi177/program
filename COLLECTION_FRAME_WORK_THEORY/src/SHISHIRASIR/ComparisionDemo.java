package SHISHIRASIR;

public class ComparisionDemo {
	public static void main(String[] args) {
		Integer i1 = 25;
		Integer i2 = 25;
		Integer i3 = 20;
		Integer i4 = 50;
		System.out.println(i1.compareTo(i2));// 0
		System.out.println(i2.compareTo(i3));// 1
		System.out.println(i3.compareTo(i4));// -1
	}
}
