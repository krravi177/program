import java.util.Scanner;

public class MainNS42 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the reange:");
		int n = sc.nextInt();
		int sum = 0;
		while (n > 0) {
			sum = sum = sum + n;
			n--;

		}
		System.out.println("Sum of Natural number:" + sum);
	}
}
