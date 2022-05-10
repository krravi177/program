package conversionHW20;

import java.util.Scanner;

public class classpraticex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the integer values:");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(i % 2 + " ");
			}
			System.out.println();
		}
	}
}
