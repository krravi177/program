import java.util.Scanner;

public class Arrarex1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of array:");


int ar[]=new int[5];

System.out.println(ar.length);


ar[0]=89;
ar[2]=45;

for(int i=0; i<ar.length; i++)
{
System.out.println(i+"->"+ar[i]);
}
}
}
