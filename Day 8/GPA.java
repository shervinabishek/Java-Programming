import java.util.Scanner;

class GPA{
	float gradepoint(String grade){
		float gp=0;
		/*if (grade.equals("A+")|| grade.equals("A")){
			gp=4;
		}else
		{
			if(grade.equals("A-")){
				gp=3.7f;
			}
		}
		*/
		
		switch (grade){
			case "A+":
				gp=4;
				break;
			case "A":
				gp=4;
				break;
			case "A-":
				gp=3.7f;
				break;
			case "B+":
				gp=3.3f;
				break;
			case "B":
				gp=3;
				break;
			case "B-":
				gp=2.7f;
				break;
			case "C+":
				gp=2.3f;
				break;
			case "C":
				gp=2;
				break;
			case "C-":
				gp=1.7f;
				break;
			case "D+":
				gp=1.3f;
				break;
			case "D":
				gp=1;
				break;
			case "E":
				gp=0;
				break;
			default:
				gp=0;
		}
		return gp;
		
	}
}


class Demo{
	static Scanner sc=new Scanner(System.in);
	static GPA g=new GPA();
	static String name;
	static String subjects[]={"IT1113","IT1122","IT1134","IT1144","IT1152"};
	static int credits[]={3,2,4,4,2};
	static String[] grades=new String[5];
	static float[] gps=new float[5];
	
	static float getpoint(String subjectcode, int credit, int index){
		System.out.println("Enter the Grade for "+subjectcode);	
		String grade=sc.nextLine();
		grades[index]=grade;
		gps[index]=g.gradepoint(grade);
		System.out.println("grade point value of the grade "+grade+" is "+g.gradepoint(grade));
		System.out.println("Subject GPA is "+g.gradepoint(grade)*credit);
	return g.gradepoint(grade)*credit;
	}
	
	
	public static void main(String[] args){
		
		float ogpa=0;
		String grade;
		float point;
		
		Scanner sc=new Scanner(System.in);
		GPA g=new GPA();
		
		System.out.println("Enter your name :");
		name=sc.nextLine();
		System.out.println("Hi "+name);
		
		for (int i=0;i<5;i++){
			ogpa+=getpoint(subjects[i], credits[i],i);
		}
		
		/*System.out.println("Enter the Grade for IT1113: ");
		grade=sc.nextLine();
		point=g.gradepoint(grade);
		ogpa=point*3;
		
		System.out.println("Enter the Grade for IT1122: ");
		grade=sc.nextLine();
		point=g.gradepoint(grade);
		ogpa+=point*2;

		System.out.println("Enter the Grade for IT1134: ");
		grade=sc.nextLine();
		point=g.gradepoint(grade);
		ogpa+=point*4;
		
		System.out.println("Enter the Grade for IT1144: ");
		grade=sc.nextLine();
		point=g.gradepoint(grade);
		ogpa+=point*4;

		System.out.println("Enter the Grade for IT1152: ");
		grade=sc.nextLine();
		point=g.gradepoint(grade);
		ogpa+=point*2; */
		
		
		/*ogpa+=getpoint("IT1113",3);
		ogpa+=getpoint("IT1122",2);
		ogpa+=getpoint("IT1134",4);
		ogpa+=getpoint("IT1144",4);
		ogpa+=getpoint("IT1152",2); */

		System.out.println("Final GPA is "+ogpa/15);
		
		for(int i=0; i<5; i++){
			System.out.println("Subject "+subjects[i]+" credits "+credits[i]+" Grade "+grades[i]+" Grade point "+gps[i]);
		}
		
	}
}