public class Apple extends Fruit{
public Apple() {
	System.out.println("Apple 0 param constructor");
}

public Apple(int price) {
	this();
	System.out.println("Apple param constructor"+price);
}
}