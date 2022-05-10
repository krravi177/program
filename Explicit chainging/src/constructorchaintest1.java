public class constructorchaintest1 {
public static void main(String[] args) {
	System.out.println("main Start");
	PenDrive p=new PenDrive(2,100,"PenDrive",40);
	System.out.println(p.qty+" "+p.memory+"GB"+p.type+"Cost Rs"+p.price);
	System.out.println("Main end");
}
}
