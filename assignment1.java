package lecture1;

public class Assignment1 {

	public static void main(String[] args) {
		
		System.out.printf("Number\tSquare\tCube\n");
		int counter = 1;
		int counter2 = 1;
		int counter3 = 1;
		
		
		
		//use array???
		while (counter<=10 && counter2 <=10 && counter3 <=10) {
			System.out.printf("%d\n",counter);
			counter++;
			
			
			
		}
		
		
		
		
		while (counter2<=10) {
			System.out.printf("\t%d\n",counter2*counter2);
			counter2++;
			counter2=counter2;
		}
			//Need help adding into same row (array?) as well as looping through all elements and updating value
		
		while (counter3<=10) {
			System.out.printf("\t\t%d\n", counter3*counter3*counter3);
			counter3++;
			
			counter3=counter3*3;

			
		}
		
		
	
	}

}
