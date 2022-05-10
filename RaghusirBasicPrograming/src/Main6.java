import java.util.Scanner;

public class Main6 {
	public static void main(String[] args) {
		float p, r, t, simpleintrest;
		Scanner sc = new Scanner(System.in);
		System.out.println("calculate the simple intrest:");
		double p1 = sc.nextDouble();
		double r1 = sc.nextDouble();
		double t1 = sc.nextDouble();
		double s1 = p1 * r1 * t1;
		System.out.println("Simple intrest is"+s1);

	}
}
