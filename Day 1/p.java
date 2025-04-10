class One{
	int a;
	int b;
	
	void printDetails(){
		System.out.println("From class one a= " + a);
		System.out.println("From class one b= " + b);
	}
} 

class Two{
	int a,c;
	
	void printDetails(){
		System.out.println("From class two a= " + a);
		System.out.println("From class two c= " + c);
	}
} 

class App{
	public static void main(String[] args){
		One o1=new One();
		Two t1=new Two();
		
		o1.printDetails();
		o1.b=100;
		o1.printDetails();
		t1.printDetails();
		t1.a=20;
		t1.c=10;
		t1.printDetails();
	}
}