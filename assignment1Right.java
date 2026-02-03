package assignment1;

import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // re-edit on github - need to update
        System.out.print("number\tsquare\tcube");
        for (int i = 0; i <= 10; i++) {
            System.out.printf("\n%d\t%d\t%d", i, i * i, i * i * i);
        }

        System.out.println("\n");

       //3.5 - 
        System.out.print("N\t10*N\t100*N\t1000*N");
        for (int n = 1; n <= 5; n++) {
            System.out.printf("\n%d\t%d\t%d\t%d", n, 10 * n, 100 * n, 1000 * n);
        }

        System.out.println("\n");

        //4.9
        int ROWS = 10;

        // (a) Left increasing
        for (int i = 1; i <= ROWS; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        // (b) Left decrease
        for (int i = ROWS; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        // (c) Right decreasing
        for (int i = ROWS; i >= 1; i--) {
            for (int space = 0; space < ROWS - i; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= i; star++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        //Last - Right increasing
        for (int i = 1; i <= ROWS; i++) {
            for (int space = 0; space < ROWS - i; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= i; star++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
//Next section - come back
        System.out.println("Triangle  Side1  Side2  Hypotenuse");
        System.out.println("1        3.0    4.0    " + hypotenuse(3.0, 4.0));
        System.out.println("2        5.0    12.0   " + hypotenuse(5.0, 12.0));
        System.out.println("3        8.0    15.0   " + hypotenuse(8.0, 15.0));

        System.out.println();

 //Elimication problem
        int[] numbers = new int[5];
        int count = 0;

        System.out.println("Enter fiven numbers between 10 and 100:");

        for (int i = 0; i < 5; i++) {
            int value = input.nextInt();
            boolean duplicate = false;

            for (int j = 0; j < count; j++) {
                if (numbers[j] == value) {
                    duplicate = true;
                }
            }

            if (!duplicate) {
                numbers[count] = value;
                count++;
            }

            System.out.print("Unique values: ");
            for (int j = 0; j < count; j++) {
            }
            System.out.println();
        }
    }
   
    //reusable ***could implement in main too***
    public static double hypotenuse(double a, double b) {
        return Math.sqrt(a * a + b * b);
    }
}
