import java.util.Scanner;
import java.text.DecimalFormat;

public class LA3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//get numbers from console
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter three numbers");
		
		double num1 = scanner.nextDouble();
		double num2 = scanner.nextDouble();
		double num3 = scanner.nextDouble();
		
		//Enter operation
		System.out.print("Enter operation");
		String operation = scanner.next();
		
		//decimal format
		DecimalFormat df = new DecimalFormat("0.00");
		//possible string operations
		
		switch (operation) {
		
			//min of all numbers
			case "min": operation = ""; 
					double min;
					min = Math.min(num1, Math.min(num3, num2));
					System.out.println(" Min(" + num1 + ", " +  num2 + ", " + num3 + ") = "+ df.format(min));
			break;
			
			//absolute value
			case "l1" : operation = ""; 
			double absnum1;
			double absnum2;
			double absnum3;
			
			//get absolute
			absnum1 = Math.abs(num1);
			absnum2 = Math.abs(num2);
			absnum3 = Math.abs(num3);
			
			System.out.println(" l1(" + num1 + ", " +  num2 + ", " + num3 + ") = "+ df.format(absnum1 + absnum2 + absnum3));
			
			break;
			
			//sqrt of sum
			case "l2" : operation = ""; 
			
			
			double sqrtnum1;
			double sqrtnum2;
			double sqrtnum3;
			
			//get sqrt
			double sqnum1 = num1 * num1;
			double sqnum2 = num2 * num2;
			double sqnum3 = num3 * num3;
			
			sqrtnum1 = Math.sqrt(sqnum1);
			sqrtnum2 = Math.sqrt(sqnum2);
			sqrtnum3 = Math.sqrt(sqnum3);
			
			double sqrtsum = sqrtnum1 + sqrtnum2 + sqrtnum3;
			System.out.println(sqrtnum1);
			System.out.println(sqrtnum2);
			System.out.println(sqrtnum2);
			
			//output
			System.out.println(" l2(" + num1 + ", " +  num2 + ", " + num3 + ") = "+ df.format(sqrtsum));
			
			break;
		}
		
	}

}
