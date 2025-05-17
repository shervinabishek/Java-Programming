/*Type conversion and type casting

boolean
short
long
char
int
float
double
string
*/

class ConverterDemo{
	public static void main(String[] args){
		boolean bo= true;
		short sh=45;
		byte by=127; // -128 to 127
		char ch='a';
		long lo=452665;
		int in=456;
		float fl=7.1245f;
		double db=58.056329874;
		String st="hi";
		
		lo=by;
		sh=(short)lo;
		fl=in;
		in=(int)db;
		in=100;
		ch=(char)in;
		
		
		System.out.println("value of the boolen is "+bo);
		System.out.println("value of the short is "+sh);
		System.out.println("value of the char is "+ch);
		System.out.println("value of the long is "+lo);
		System.out.println("value of the int is "+in);
		System.out.println("value of the float is "+fl);
		System.out.println("value of the double is "+db);
		System.out.println("value of the string is "+st);
		System.out.println("value of the byte is "+by);
		
		
	}
}