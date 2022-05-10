package conversion;
public class conversion4 {
static int binToDec(int bin)
{
	int dec=0,pw=1;
	do{
		int r=bin%10;
		dec=dec+r*pw;
		bin=bin/10;
		
	}
	while(bin!=0);
		return dec;
}

static int octToDec(int oct)
{
	int dec=0,pw=1;
do {
	int r=oct%10;
	dec=dec+r*pw;
	pw=pw*8;
	oct=oct/10;
	
}
while(oct!=0);
	return dec;
}
}