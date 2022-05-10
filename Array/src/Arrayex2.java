import java.util.Scanner;

public class Arrayex2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of array: ");
	int x[]= {34,56,87,32,29};
	System.out.println(x);
	System.out.println(x.length);
	System.out.println(x[0]);
	System.out.println(x[2]);
	   x[3]=23;
	   for(int i=0; i<x.length; i++)
	   {
		   System.out.println(i+"->"+x[i]);
	   }
}
}
