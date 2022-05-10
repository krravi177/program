import java.util.Scanner;

public class Square3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value side of square:");
		double s = sc.nextDouble();
		System.out.println("Value of square side" + s);
		double area = s * s;
		double peri = 4 * s;
		System.out.println("Area of square" + area);
		System.out.println("Perimeter of squqare" + peri);
	}
}
