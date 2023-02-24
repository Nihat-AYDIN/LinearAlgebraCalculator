package LineerAlgebraCalculator;

public class MatCalculator implements Calculator{

	private int currentCount = 0;
	
	private MatrixFunction[] functions;
	
	Matrix matobj = new Matrix();
	
	public MatCalculator(int functionCount) {
		functions = new MatrixFunction[functionCount];
	}
		
	public void addFunction(MatrixFunction function) {
		functions[currentCount] = function;
		currentCount++;
	}

	public void doCalculationOneArg(String functionName) {
		int[][] result = null;
		
		boolean isFunctionFound = false;
		for (MatrixFunction function : functions) {
			if (functionName.equalsIgnoreCase(function.getName())) {
				
				int arr[][] = matobj.createMatrix();
				
				System.out.println("İşlem yapılmadan önce matris ::");
				matobj.display(arr);
				
				result = ((MatrixFuncOneArg)function).calculate(arr);
				System.out.println("İşlem yapıldıktan sonra matris ::");
				matobj.display(result);
				isFunctionFound = true;
			}
		}
		if(!isFunctionFound)
			System.out.println("No such function found!");
		
	}
	
	public void doCalculationTwoArg(String functionName) {
		
		int[][] result = null;
		boolean isFunctionFound = false;
		for (MatrixFunction function : functions) {
			if (functionName.equalsIgnoreCase(function.getName())) {
				
				int arr1[][] = matobj.createMatrix();
				int arr2[][] = matobj.createMatrix();

				System.out.println("İşlem yapılmadan önce matrisler ::");
				matobj.display(arr1);
				System.out.println();
				matobj.display(arr2);


				result = ((MatrixFuncTwoArg)function).calculate(arr1, arr2);
				System.out.println("İşlem yapıldıktan sonra matrisler ::");
				matobj.display(result);
				isFunctionFound = true;
			}
		}
		if(!isFunctionFound)
			System.out.println("No such function found!");

	}

	public void listMathFunction() {
		System.out.println("Available Functions:");
		for (MatrixFunction function : functions)
			System.out.println(function.getName());
	}
}
