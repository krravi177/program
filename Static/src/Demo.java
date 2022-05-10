public class Demo {
static {
	System.out.println("Static block K:");
}
public static void main(String[] args) {
	System.out.println("main");
	new Demo();
	new Demo();
	new Demo();
	new Demo();
	new Demo();
	new Demo();
}
static {
	System.out.println("Static block D");
}
}
