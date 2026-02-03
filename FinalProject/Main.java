
//Walmart Warehouse Management System
package project1;
import java.util.Scanner;

public class Main {
	static Scanner input = new Scanner(System.in); // Scanner that works everywhere

	public static void main(String[] args) {
		//This will be the first section to the log in page
		String userName; 
		String passWord; 
		
		System.out.print("Username: ");
		userName = input.nextLine(); // username
		System.out.print("Password: ");
		passWord = input.nextLine(); //make private when stored
		
		boolean loggedIn = true;
		while (loggedIn) {
				//call this method
		}
		
		
		

	}
	public static void features() {
		System.out.println("1. VIzPicking");
		System.out.println("2. Production");
		System.out.println("3. Spark");
		System.out.println("4. Claims");
	}
	

}
