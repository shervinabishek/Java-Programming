class Student{
	int marks;
	String name;
	
	Student(){
		System.out.println("Creating a Student Object");
		name="Default name";
	}
	Student(String n,int m){
		System.out.println("Creating a Student Object with name "+n+" and marks "+m);
		name=n;
		marks=m;
	}
	
}

class App{
	public static void main(String[] args){
		System.out.println("Welcome to demo class app");
		Student s1=new Student();
		System.out.println(s1.name +" - "+s1.marks);
		s1.marks=98;
		s1.name="Nuwanthika";
		System.out.println(s1.name +" - "+s1.marks);
		
		Student s2=new Student("Kasuni",60);
		//s2.marks=100;
		//s2.name="Vidumini";
		System.out.println(s2.name+" - "+s2.marks);
	}	
}