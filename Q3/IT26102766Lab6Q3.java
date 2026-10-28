import java.util.Scanner;

public class IT26102766Lab6Q3{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println();
		System.out.println("Enter positive integers (terminate input with -99):");
		
		int num = 0;
		int sqrtsum = 0;
		int N = 1;
		
		while(num != -99){
			
	    System.out.print("Enter a number : ");
	    num = input.nextInt();
		
		
		int square = num*num;
		
			if (num > 0){
				sqrtsum = sqrtsum + square;
				N++;		
		}
		
		else if (num != -99) {
			System.out.println("Invalid input. Please enter a positive integer or -99 to terminate");
		}	
		
		}
		
		double RMS = Math.sqrt(sqrtsum/N);
		
		System.out.println();
		if (N > 0){
		System.out.print("The Root Mean Square (RMS) is: " + RMS);
		}  
		
		System.out.println();
	
}

}