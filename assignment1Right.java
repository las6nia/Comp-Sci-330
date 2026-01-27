package lecture1;

public class Assignment1 {

	public static void main(String[] args) {
		
		System.out.printf("Number\tSquare\tCube\n");
		int counter = 0;
		//answer - using for loop
		for (int i =0; i <=10; i++) {
			System.out.printf("%d\t%d\t%d\n", counter, counter*counter, counter*counter*counter);
			counter++;
		}
		System.out.print("\n\n"); //new lines
	
	//Problem 2 - using counter controlled looping 
		System.out.print("N\t\10*N\t100*N\t1000*N\n\n");
		int n=0; //initital number
		
		for (int i = 0; i <=5; i++) {
			System.out.print("%d");
		}
		
		
	}

}
