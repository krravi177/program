package conversion;

import java.util.Scanner;

public class solution {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the decimal values:");
	int dec=sc.nextInt();
	System.out.println("Binary:"+Integer.toBinaryString(dec));
	System.out.println("Octal:"+Integer.toOctalString(dec));
	System.out.println("Hexadec:"+Integer.toHexString(dec));
}

{
System.out.println(Integer.parseInt("5b",16));
System.out.println(Integer.parseInt("563",8));
System.out.println(Integer.parseInt("1101",2));
}
}