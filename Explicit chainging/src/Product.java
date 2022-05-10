public class Product {
int qty,price;
String type;
public Product() {
	System.out.println("product 0 param constrictor");
}
public Product(String type) {
	System.out.println("product 1 param constructor");
	this.type=type;
}
public Product(int qty,int price,String type) {
	this(type);
	System.out.println("product 3 param constructor");
	this.qty=qty;
	this.price=price;
}
}
