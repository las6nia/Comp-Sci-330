package feb10;
import java.util.Scanner;

public class Main {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		//module 1 assignment - complex number - imaginary and real num
		// 2 string method - 
		
		double realNum;
		double imaginaryNum;
		//can be positive & need to be double .2f
		String complexNumber;
		
		System.out.print("Enter your real num: ");
		realNum = input.nextDouble();
		
		System.out.print("Enter your imaginary num: ");
		imaginaryNum= input.nextDouble();
		
		if (imaginaryNum>0 || imaginaryNum <0) { //still perform
			double result = Methods1.add(realNum,imaginaryNum,0,0); //comeBack to this 
			//System.out.println(result); //result
			
		System.out.println("\n-----Second part-----");
		// add - (a+bi) + (c+di) = (a+c) + (b+d)i
		System.out.print("Enter your real num 1: ");
		double realNum1 = input.nextDouble();
		
		System.out.print("Enter your imaginary num: ");
		double imaginaryNum1= input.nextDouble();
		
		
		System.out.print("Enter your real num 2: ");
		double realNum2= input.nextDouble();
		System.out.print("Enter your imaginary num 2: ");
		double imaginaryNum2= input.nextDouble();
		
		double fullResult = Methods1.add(realNum1,imaginaryNum1 ,realNum2, imaginaryNum2); //full result of = (a+bi) + (c+di) = (a+c) + (b+d)i
		System.out.printf("");
		
		}
		
	}
	
}
