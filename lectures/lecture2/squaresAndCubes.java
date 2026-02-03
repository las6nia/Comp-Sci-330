package assignment;
import java.util.Scanner; //scanner
public class squaresAndCubes {

	static Scanner input = new Scanner(System.in); //works everywhere
	public static void main(String[] args) {
		
		System.out.print("number\tsquare\tcubes");
		
		for (int i= 0; i <=10; i++) {
			System.out.printf("\n%d\t%d\t%d",i, i*i, i*i*i);
		}
		//instructor used values to do - squareValue = count *count, int cubeValue = count*squareValue;
		
		
		
		//Second problem
		System.out.print("\n\nControlled loop\n\n");
	//aligned to the right, you are also able to use %10s - 10 spaces aligned to the right, but if you do "%-10s", this will align it to the right
		
		System.out.print("N\t10*N\t100*N\t1000*N");
		for (int count = 0; count <=5; count++) {
			System.out.printf("\n%d\t%d\t%d\t%d", count, count*10, count*100, count*1000);
		}
		
		
		//Third problem - triangle printing
		//Use rows + columns
		System.out.print("\n\nStars amount: ");
		int userInput = input.nextInt(); //test control
		//A
		for (int row = 0; row <= userInput; row++) {
			System.out.println("");
			for (int column = 0; column<=row; column++) {
				System.out.print("*");
			}
		}
		//B - ***Come back****
//		for (int row = 0; row <= userInput; row--) {
//			System.out.println("");
//			for (int column = 0; column<=row; column++) {
//				System.out.print("*");
//			}
//		}
//		
		
		
		
		//hypothenuse calculation
	
		
		
		
		
		

	}
	

}
