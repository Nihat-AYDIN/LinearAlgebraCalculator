package LineerAlgebraCalculator;

import java.util.Scanner;

public class MatCalculator implements Calculator{

	
	private int functionCount;
	private int currentCount = 0;
	
	private MatrixFunction[] functions;
	private double argument;
	
	Matrix matobj = new Matrix();
	
	public MatCalculator(int functionCount) {
		this.functionCount = functionCount;
		functions = new MatrixFunction[functionCount];
	}
		
	public void addFunction(MatrixFunction function) {
		functions[currentCount] = function;
		currentCount++;
	}

	public int[][] doCalculationOneArg(String functionName) {
		int[][] result = null;
		
		boolean isFunctionFound = false;
		for (MatrixFunction function : functions) {
			if (functionName.equalsIgnoreCase(function.getName())) {
				
				int arr[][] = matobj.createMatrix();
				
				System.out.println("İşlem yapılmadan önce matris ::");
				matobj.display(arr);
				
				result = ((MatrixFuncOneArg)function).calculate(arr);
				isFunctionFound = true;
			}
		}
		if(!isFunctionFound)
			System.out.println("No such function found!");
		
		return result;
	}
	
	public int[][] doCalculationTwoArg(String functionName) {
		
		int[][] result = null;
		boolean isFunctionFound = false;
		for (MatrixFunction function : functions) {
			if (functionName.equalsIgnoreCase(function.getName())) {
				
				int arr1[][] = matobj.createMatrix();
				int arr2[][] = matobj.createMatrix();

				System.out.println("İşlem yapılmadan önce matris ::");
				matobj.display(arr1);
				System.out.println();
				matobj.display(arr2);


				result = ((MatrixFuncTwoArg)function).calculate(arr1, arr2);
				isFunctionFound = true;
			}
		}
		if(!isFunctionFound)
			System.out.println("No such function found!");

		return result;
	}

	public void listMathFunction() {
		System.out.println("Available Functions:");
		for (MatrixFunction function : functions)
			System.out.println(function.getName());
	}
}
