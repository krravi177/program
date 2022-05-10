import java.util.Scanner;

public class Trailing_Zero {
static void trailing(int n) {
	int count=0;
	while(n>5)
	{
		n=n/5;
		count=count+n;
	}
	System.out.println(count);
	
}
public static void main(String[] args) {
	System.out.println("Enter the Number:");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	trailing(n);
			
}
}
