import java.util.Scanner;

class Mainptt2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.of lines");
		int n = sc.nextInt();// 7
		int star = n, space = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print("  ");
			}
			int x = 1;
			for (int j = 1; j <= star; j++) {
				System.out.print( x+" ");
				if (j <= star / 2)
					x++;
				else
					x--;
			}
			System.out.println();
			if (i <= n / 2) {
				space++;
				star = star - 2;
			} else {
				space--;
				star = star + 2;
			}
			System.out.println();
		}
	}
}
