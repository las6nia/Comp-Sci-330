package assignment;
import java.util.Scanner;

public class HypothenuseCalculation {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter the first number: ");
		double side1 = input.nextDouble(); //next double
		
		System.out.println("Enter the second number: ");
		double side2= input.nextDouble(); //next double
		
		double hypothenuseValue = hypothenuse(side1, side2);
		
		System.out.printf("\nThe hypothenuse calculated is: %d",hypothenuse(side1, side2) ); //***********Come back *******
		System.out.printf("\nValue from math library: %d", Math.hypot(side1, side2)); //using math library
	}
	
	
	
	public static double hypothenuse (double side1, double side2) {
		double squareSide1 = Math.pow(side1, 2);
		double squareSide2 = Math.pow(side2, 2);
		
		double sumSquares = squareSide1 + squareSide2;
		
		return Math.sqrt(squareSide1+squareSide2);
		
	}

}
