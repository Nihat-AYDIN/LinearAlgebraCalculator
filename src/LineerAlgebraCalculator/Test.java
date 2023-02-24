package LineerAlgebraCalculator;

import java.util.Scanner;

public class Test {

	private static Scanner in;

	public static void main(String args[]) {
		in = new Scanner(System.in);
		
		MatCalculator clc1 = new MatCalculator(5);
		
		clc1.addFunction(new MatrixSum());		
		clc1.addFunction(new MatrixTrace());
		clc1.addFunction(new MatrixMultiplication());
		clc1.addFunction(new MatrixTranpoze());
		clc1.addFunction(new ScalarMultiplication());
		
		startCalculator(clc1);
		
	}
	
	public static void startCalculator(Calculator calculator) {
		
		calculator.listMathFunction();
		System.out.println("Please enter the name of the function (or \"x\" for exit):");
		String functionName = in.next(); 
		if(functionName.equalsIgnoreCase("x")) {
			System.out.println("bye!");
			System.exit(0);
		}
		System.out.println("Number of the matrix (1 or 2):");
		String argumentCount = in.next(); 
		
		if(argumentCount.equals("1")) {
			
			calculator.doCalculationOneArg(functionName);	
		}else {
			
			calculator.doCalculationTwoArg(functionName);
		}

		
	}
}
