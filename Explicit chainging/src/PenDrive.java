public class PenDrive extends ElectronicProduct{
int memory;
public PenDrive(int qty,int price,String type,int memory) {
	super(qty,price,type);
	this.memory=memory;
	System.out.println("PenDrive 4 param Constructor");
}
}
