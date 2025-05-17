import java.util.Scanner;

class InputDemo{
	public static void main(String[] args){
		String name;
		int age;
		byte mark;
		Scanner sc=new Scanner(System.in);
		System.out.println("Hi Enter your Name: ");
		name=sc.nextLine();
		System.out.println("Hi Enter your age: ");
		age=sc.nextInt();
		System.out.println("Hi Enter your Marks: ");
		mark=sc.nextByte();
		System.out.println("Hello "+name+" How are you??");
		System.out.println("you are "+age+" years old.");
		System.out.println("your marks is "+mark+" & it's great!!");
		
	}
	
}