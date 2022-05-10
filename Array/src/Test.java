
public abstract class Test {
	abstract void m1();
	abstract void m2();
	void m3()
	{
		System.out.println("m3 method");
	}

}
class Test1 extends Test
{

	@Override
	void m1() {
	System.out.println("m1 methode");	
	}

	@Override
	void m2() {
	System.out.println("m2 method");	
	}
	public static void main(String[]args)
	{
		Test1 t=new Test1();
				t.m3();
	}
}
