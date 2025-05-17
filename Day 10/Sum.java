import java.util.Scanner;

class Sum{
	public static void main (String[] args){
		int sum=0;
		int[] nu=new int[10];
		
		
			for(int i=0; i<10; i++){
			 System.out.println("Enter number " +(i+1)+": ");
		try{
			Scanner sc=new Scanner(System.in);
			nu[i]=sc.nextInt();
			sum+=nu[i];
		}
		catch(Exception e){
			System.out.println("Exception error is "+ e.getMessage());
			i=i-1;
		}
		
		}
		
		
		 System.out.println("Sum is: "+sum);
	}
}








