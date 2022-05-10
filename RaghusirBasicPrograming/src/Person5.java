import java.util.Scanner;

public class Person5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Height:");
		double l = sc.nextDouble();
		double b = sc.nextDouble();
		double BMI = (l * b);
		System.out.println("BMI is" + BMI);
	}
}
