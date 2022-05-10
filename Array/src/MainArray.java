import java.util.Scanner;

public class MainArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x[] = new int[n];
		System.out.println("Enter" + n + "values");
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();

		}
		System.out.println("User entered Arrayelement");
		for (int i = 0; i < x.length; i++) {
			System.out.println(i + "-->" + x[i]);
		}

	}
}
