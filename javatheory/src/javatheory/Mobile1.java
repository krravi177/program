package javatheory;
public class Mobile1 {
String model="One plus";// global variablle //
Mobile1 (String model)
{
	System.out.println(model);// iphone13
	System.out.println(this.model); //oneplus9R
}
public static void main(String[] args) {
	Mobile1 m1=new Mobile1("iphone13");
}
}

