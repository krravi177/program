import java.util.Scanner;

public class Circle0 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radioud of the circle:");
		double r = sc.nextDouble();
		System.out.println("Radioud is" + r);
		double ar = 3.142 * r * r;
		double cs = 2 * 3.142 * r;
		System.out.println("Area is" + ar);
		System.out.println("Circumfereance is" + cs);
	}
}
