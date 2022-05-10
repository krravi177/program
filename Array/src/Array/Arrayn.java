package Array;

import java.util.Scanner;

public class Arrayn {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values of an Array:");
		int n = sc.nextInt();
		int ar[] = new int[n];
		System.out.println("Enter" + n + "values");
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();

		}
		int br[] = ar;// alies
		int cr[] = new int[ar.length];
		for (int i = 0; i < ar.length; i++) {
			cr[i] = ar[i];
		}

	}
}
