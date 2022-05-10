package javatheory;
public class Product {
double d=41.8;  // GLOBAL VARIABLE / INSTANCE VARIABLE

// LOCAL VARIABLE DOMINATES THE GLOBAL VARIABLLES //
Product()
{
	double d=34.5; // LOCAL VARIABLE
	System.out.println(d);
	System.out.println(this.d);
}
public static void main(String[] args) {
	Product p=new Product();
}
}
// example of global varialbes and local variable //