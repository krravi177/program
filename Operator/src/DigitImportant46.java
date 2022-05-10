import java.util.Scanner;

public class DigitImportant46 {
	public static void main(String[] args) {
		System.out.println("Enter the integer values:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		do {
			count++;
			n = n / 10;
		} while (n != 0);

		System.out.println("No of Digit" + count);

	}
}