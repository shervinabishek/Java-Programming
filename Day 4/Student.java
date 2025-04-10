class Student{
	String name="piyumali";
	int marks=87;
	
	Student(){
		name="NoName";
	}
	Student(String n){
		name=n;
	}
	
	Student(String n, int m){
		name=n;
		marks=m;
	}
	
}


class StudentDemo{
	 static void main(String[] args){
		System.out.println("Hi from studentDemo class");
		System.out.println("Creating an object of student class");
		Student s1=new Student("Nice Name",66);
		System.out.println("Creating an object of student class");
		System.out.println("Name value is " +s1.name );
		System.out.println("Marks value " +s1.marks );
		s1.name="Bob";
		s1.marks=56;
		System.out.println("Name value is " +s1.name );
		System.out.println("Marks value " +s1.marks );
		
	}
}