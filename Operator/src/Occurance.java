public class Occurance {
static int countOccurance(String str, String word)
{
	String a[]=str.split(" ");
	int count=0;
	for(int i=0;i<a.length;i++)
	{
		if(word.equals(a[i]))
			count++;
	}
	return count;
}
public static void main(String[] args) 
{
	String str="Occurance or A count";
	String word="Occurance";
	System.out.println(countOccurance(str,word));
}
}
