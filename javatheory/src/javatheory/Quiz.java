package javatheory;
public class Quiz {
int i=55; // global variable
{
	int i=33; // local variable
	System.out.println(i);//33
	System.out.println(this.i);//55
}
public static void main(String[] args) {
	Quiz q1=new Quiz();
}
}
