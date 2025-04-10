import p1.MyClass;
import p2.MyClass2;
import p1.p3.*;

class App{
	public static void main(String[] ar){
		MyClass mc=new MyClass();
		mc.display();
		
		MyClass2 c2=new MyClass2();
		c2.display();
		
		Class4 pc=new Class4();
		pc.display();
	}
}