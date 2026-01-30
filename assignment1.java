package practiceAssignmentRecap;
import java.util.Scanner;
public class Main {
	static Scanner input = new Scanner (System.in); //practice remembering - static makes it work anywhere

	public static void main(String[] args) {
		
		
		//2.15 - table of squares and cubes
		System.out.print("number\tsquare\tcube");
		
		for(int i= 0; i<=10; i++) {
			System.out.printf("\n%d\t%d\t%d",i, i*i, i*i*i);
			
		}
		System.out.println("\n"); //spacing
		//3.5 write a program that uses counter-controlled looping to print the following table of values, separate te columns with tab characters:
		System.out.print("N\t10*N\t100*N\t1000*N\n");
		for (int n = 1; n <=5; n++) {
			
			System.out.printf("\n%d\t%d\t%d\t%d",n, 10*n, 100*n,1000*n );
		}
		
		//4.9 - triangle printing program: nested for loops
		System.out.print("\n");
		//using repeat
		System.out.print("Enter number of stars: ");
		int userNum = input.nextInt();
		//outer
		for (int rows = 0; rows<=userNum; rows++) {
			System.out.println("");
			//inner
			for (int columns = 0; columns<rows; columns++) {
				System.out.print("*");
			}
			System.out.print(""); //breaking after each iteration
			
		}
		
		for (int rows2 = 0; rows2<=userNum; rows2--) {
			System.out.println("");
			for (int columns2 = 0; columns2<rows2; columns2++) {
				System.out.print("*");
			}
			System.out.print(""); //breaking after each iteration
		}
		
	}

}
