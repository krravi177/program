
public class CONVERSION {
static String decToBinary(int dec) {
	String bin=" ";
	do {
		int b=dec%2;
		bin=b+bin;
		dec=dec%2;
		bin=b+bin;
		dec=dec/2;
	}while(dec!=0);
	return bin;
}

static String decToBinaryOct(int dec) {
	String oct=" ";
	do {
		int b=dec%8;
		oct=b+oct;
		dec=dec/8;
		
	}while(dec!=0);
	return oct;
	
}
static String decToHex(int dec) {
	String hex=" ";
do {
	int b=dec%16;
	if(b<10)
		hex=b+hex;
	else {
		switch(b)
		{
		case 10: hex='A'+hex;
		break;
		case 11: hex='B'+hex;
		break;
		case 12: hex='C'+hex;
		break;
		case 13: hex='D'+hex;
		break;
		case 14: hex='E'+hex;
		break;
		case 15: hex='F'+hex;
		break;
		}
	}
	dec=dec/16;
}while(dec!=0);
return hex;
}
public static void main(String[]args)
{
	System.out.println(decToBinary(73));
	System.out.println(decToBinaryOct(73));
	System.out.println(decToHex(91));
		}
	
}

