import java.util.Scanner;

public class Biggest35 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter four double type values:");
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		double n3 = sc.nextDouble();
		double n4 = sc.nextDouble();
		double big = (n1 > n2 && n1 > n3 && n1 > n4) ? n1 : (n1 > n3 && n2 > n4) ? n2 : (n3 > n4) ? n3 : n4;
		System.out.println(big);

	}
}
