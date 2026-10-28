import java.util.Scanner;

public class IT26102766Lab6Q1{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.println();
	System.out.print("Enter a number: ");
	int num = input.nextInt();
	
	double square = num*num;
	double squareRoot = Math.sqrt(num);
	
	System.out.println();
	System.out.println("The square of " + num + " is : " + square);
	System.out.println("The square root of " + num + " is : " + squareRoot);
	}
}