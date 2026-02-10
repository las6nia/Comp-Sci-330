package feb10;

public class Methods1 {

	//adding method
		public static double add(double a, double b, double c, double d) {
			//come back
			double addResul = 0;
			double realNum1 = a;
			double imaginaryNum1 = b;
			double realNum2 = c;
			double imaginaryNum2 = d;
			
			if (imaginaryNum1 >=0 && realNum1>=0 && realNum2 == 0 && imaginaryNum2 ==0) { //this will only print if is only stictly 0 for the last 2 conditions
				System.out.printf("%.2f+%.2fi",realNum1,imaginaryNum1); //real Num + positive imaginary
			}
			else if (imaginaryNum1 <0 && realNum2 == 0 && imaginaryNum2 ==0) {
				//if negative
				System.out.printf("%.2f%.2f"+"i",realNum1,imaginaryNum1);
				
			}
			System.out.printf("(%.2f+%.2f)"+"i"+"(%.2f+%.2f)"+"i"+"= (%.2f)+(%.2f)"+"i", realNum1, imaginaryNum1, realNum2, imaginaryNum2,(realNum1+realNum2),(imaginaryNum1+imaginaryNum2));
			return; //fix this
		}
//-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-		
	//subtract method
		public static double subtract(double a, double b, double c, double d) {
			double result; //result of all
			
			double real = x;
			double imaginary = y;
			
			
			
			
			result = (real+imaginary);
			return result;
		}
//-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-
		//multiply method
		public static double multiply(double x, double y) {
			double result;
			double real = x;
			double imaginary = y;
			
			result = (real+imaginary);
			return result;
		}
	
		

}
