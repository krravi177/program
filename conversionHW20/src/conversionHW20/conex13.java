package conversionHW20;

import java.util.Scanner;

public class conex13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = i; j >= 1; j--) {
				System.out.print((char) (64 + j) + " ");
			}
			System.out.println();
		}
	}

}
