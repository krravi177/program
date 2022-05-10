import java.util.Scanner;

public class Diviser51 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values:");
		int n = sc.nextInt();
		int count = 1;
		for (int j = 1; j <= n / 2; j++) {
			if (n % j == 0)
				count++;
		}
		System.out.println("No. of Diviser:" + count);
	}
}
