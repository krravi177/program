package SHISHIRASIR;
import java.util.Scanner;
public class Student {
int id;
String name;
int p,c,m,b;
double per;
public Student(int id,String name, int p,int c,int m,int b) { 
super();    
	this.id = id;
	this.name = name;
	this.p = p;
	this.c = c;
	this.m = m;
	this.b = b;
	this.per=(p+c+m+b)/4.0;
}
	

 String getResult()
{
	if(p<35||c<35||m<35||b<35)
		return "fail";
	if(per>=85)
		return "Distinct";
	if(per>=60)
		return "first class";
	if(per>=50)
		return "second class";
	    return "pass";
}
public String toString()
{
	return "["+id+", "+name+", "+per+", "+getResult()+"]";
}
}
class MainRunner{
	public static void main(String[]args) {
		Student std=new Student(123,"Anup",85,67,87,94);
		System.out.println(std);
	}
}

