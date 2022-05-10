import java.util.Scanner;

public class MethodAvg {
	static double avg(int a) {
		int sum = 0;
		int count = 0;
		do {
			int r = a % 10;
			sum = sum + r;
			a = a / 10;
			count++;
		} while (a != 0);
		double average = sum / count;
		return average;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter the number:");
		double z = avg(n);
		System.out.println(z);
	}

}
