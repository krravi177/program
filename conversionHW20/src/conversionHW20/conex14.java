package conversionHW20;

import java.util.Scanner;

public class conex14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the integer vallues:");
		int n = sc.nextInt();
		for (int i = n; i >= 1; i--) {
			for (int j = n; j >= 1; j--) {
				System.out.print(j + " ");

			}
			System.out.println();
		}
	}
}