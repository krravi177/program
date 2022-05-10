import java.util.Scanner;

public class Average_of_Digit59 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the integer number:");
		int n = sc.nextInt();
		float sum = 0;
		int count=0;
		do {
			int d = n / 10;
			sum = sum + d;
			count++;
			n = n / 10;
		} while (n != 0);
		System.out.println("Average is sum:");
	}
}
