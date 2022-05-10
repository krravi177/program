package conversion;
public class Binaryconversion {
	static String decToHex(int dec)
	{
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
}
