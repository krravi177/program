import java.util.Scanner;

public class LeapYear34 {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Year is LeapYear:");
int n=sc.nextInt();
String str=(n%4==0)&&(n%100!=0)||(n%400==0)?"LeapYear":"Not leapyear";
System.out.println(str);
}
}
