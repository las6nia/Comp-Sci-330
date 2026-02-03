package assignment;

public class stars {

	public static void main(String[] args) {
		drawPattern1();
		
		drawPattern2();

		drawPattern3();
	}

	private static void drawPattern3() {
		for (int row =0; row <10; row++) {
			System.out.println(" ");
			for (int column = 0; column<=row; column++) { 
				System.out.print("*");
				
			}
			for (int column = 0; column<10-row; column++) { 
				System.out.print("*"); //Come back here******FIX******
				}
			
		}
		
	}

	private static void drawPattern2() {
		// TODO Auto-generated method stub
		for (int row =0; row <10; row++) {
			for (int column = 0; column<10-row; column++) { //answer here - we just decrease the row 
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static void drawPattern1() {
		// TODO Auto-generated method stub
		for (int row =0; row <10; row++) {
			for (int column = 0; column<=row; column++) { 
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
