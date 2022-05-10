import java.util.Scanner;

public class Rectangle2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the breath of the Rectangle");
		double l = sc.nextDouble();
		double b = sc.nextDouble();
		System.out.println("Length is" + l);
		System.out.println("breath is" + b);
		double peri = l * b;
		double ar = 2 * (l + b);
		System.out.println("Area is:" + ar);
		System.out.println("Perimeter is:" + peri);
	}
}
