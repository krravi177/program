import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of An Array");
		int n = sc.nextInt();
		double ar[] = new double[n];
		System.out.println("Enter" + n + "values");
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextDouble();
		}
		double total = 0.0;
		for (int i = 0; i < ar.length; i++) {
			total = total + ar[i];
		}
		double avg = total / ar.length;
		System.out.println("Average is:+avg");
	}
}
