class Rectangle{
	private int height;
	int width;
	
	Rectangle (int h, int w){
		height=h;
		width=w;
		System.out.println("Just created a rectangle object with size (h*w) "+height+ " and "+width);
		print(w,h);
	}
	
	Rectangle(){
			height=2;
			width=2;
	}
	
	
	void get_detail(){
		System.out.println("Height "+height+" Width "+width);
	}
	
	
	void print(int width, int height){
		for (int i=0; i<height;i++){
			for (int j=0; j<width; j++){
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}

class Main{
	public static void main(String[] args){
		/*for(int i=0; i<10; i++){
			System.out.println("Value of i is "+i);
		}*/
		Rectangle r1=new Rectangle(5,3);
		Rectangle r2=new Rectangle();
		Rectangle r3=r1;
		//r1.height=10;
		r1.width=15;
		r1.get_detail();
		r2.get_detail();
		r3.get_detail();
		
		/*System.out.println("Height "+ r1.height+" Width "+r1.width);
		System.out.println("Height "+ r2.height+" Width "+r2.width);
		System.out.println("Height "+ r3.height+" Width "+r3.width);
	*/
	}
}
