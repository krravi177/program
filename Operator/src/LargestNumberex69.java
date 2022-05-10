import java.util.Scanner;

public class LargestNumberex69 {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	int l=sc.nextInt();
	System.out.println("Enter the integer number:");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	int largest=c>(a>b?a:b)?c:((a>b)?a:b);
	System.out.printf("Largest is"+l);
}
}
