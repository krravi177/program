import java.util.Scanner;

public class Smallest14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two integer values:");
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		if (n1 > n2)
			System.out.println("This is smallest number:" + n1);
		else
			System.out.println("This is smallest number:" + n2);
	}
}
