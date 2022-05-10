import java.util.Scanner;

public class Details7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name & Mobile No & 10th & 12th Degree:");
		String na = sc.next();
		long ma = sc.nextLong();
		double t1 = sc.nextDouble();
		double t2 = sc.nextDouble();
		double t3 = sc.nextDouble();
		System.out.println("Your name is" + na);
		System.out.println("Your moblie no is" + ma);
		System.out.println("Your 10th% is" + t1);
		System.out.println("Your 2th% is" + t2);
		System.out.println("your degre% is" + t3);
	}
}
