package assignment;

import java.util.Scanner;

public class duplicateElimination {

	public static void main(String[] args) {
Scanner input = new Scanner (System.in);
		
		int []numbers= new int [5]; //this is the array
		int inputCount = 0;
		int writeIndex = 0; //this will increate the write index- //come back because it is not updating
		
		while (inputCount <5) {
			System.out.println("Enter next number: ");
			int number = input.nextInt();
			
			//adding method to check if the number is new, 
			if (isNew(number, numbers, writeIndex)) {
				numbers[inputCount] = number; 
				writeIndex++; //come back because it is not updating
			}
			
		
			displayNumbers(numbers);
			
			inputCount++; //increment the position
			}
		}
		
	
	//isNew method
		private static boolean isNew(int number, int[] numbers, int writeIndex) {
		// TODO Auto-generated method stub
			for (int index = 0; index < writeIndex; index++) {
				if (number == numbers[index]) {
					return false;
				}
				
			}
			
			return true; //else return true
	}

		private static void displayNumbers(int [] numbers) {
			for (int index = 0; index<5; index++) {
				System.out.print(numbers[index]+" ");
				
			
			System.out.println("]");
		}
			
		
		

	}

}
