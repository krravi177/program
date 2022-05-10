import java.util.Scanner;

public class Feetcm4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of pi:");
		double pi = sc.nextInt();
		double f = pi * (1.0 / 30.48);
		System.out.println("length of pi in feet" + f);
	}
}
