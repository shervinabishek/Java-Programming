class Car{
	String model;
	
	Car(String n){
		model=n;
	}	
}

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

class AllinoneDemo{
	
	static void print (String s){
		System.out.println(s);
	} 
	
	public static void main (String[] args){
		Student s1=new Student("Charlie");
		Student s2=new Student();
		Student s3=new Student("Dao",55);
		
		print("Name of the S1 is " +s1.name+" , Marks = "+s1.marks);
		print("Name of the S2 is " +s2.name+" , Marks = "+s2.marks);
		print("Name of the S3 is " +s3.name+" , Marks = "+s3.marks);
		
		Car c1=new Car("Mazda s3");
		Car c2=new Car("Nissan Navara");
		print("Model of the c1 is " +c1.model);
		print("Model of the c2 is " +c2.model);
		
	}

}