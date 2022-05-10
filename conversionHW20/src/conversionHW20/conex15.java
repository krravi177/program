package conversionHW20;

import java.util.Scanner;

public class conex15 {
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter the integer values:");
	int n=sc.nextInt();
	for(int i=n; i>=1; i--)
	{
		for(int j=i; j<=n; j++)
		{
			System.out.print(j+" ");
		}
		System.out.println();
	}
}
}
