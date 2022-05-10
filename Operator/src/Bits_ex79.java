import java.util.Scanner;

public class Bits_ex79 {

	static int countsettedBits(int x) {
		int count = 0;
		do {
			int b = x % 2;
			if (b == 1)
				count++;
			x = x / 2;
		} while (x != 0);
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		int bs = countsettedBits(n);
		System.out.println("Number of Bits setted is:" + bs);
	}
}
