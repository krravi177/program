package conversionHW20;

import java.util.Scanner;

public class conEx2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values:");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= 1; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
