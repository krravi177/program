import java.util.Scanner;

public class DInteger27 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		if (x > y && x < z || x < y && x > z)
			System.out.println(x + "is Middle values:");
		else if (y > x && y < z || y < x && y > x)
			System.out.println(y + "is Middle value:");
		else
			System.out.println(z + "is Middle values");
	}
}
