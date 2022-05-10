package javatheory;
public class Mobile 
{
String model;// global variable
Mobile(String model){
this.model=model;	
}
public static void main(String[] args) 
{
	Mobile m1=new Mobile("iphone13");
	System.out.println(m1.model);
	Mobile m2=new Mobile("Oneplus9R");
	System.out.println(m2.model);
}
}
