package LineerAlgebraCalculator;

public interface Calculator {
	
	public int[][] doCalculationOneArg(String functionName);
	
	public int[][] doCalculationTwoArg(String functionName);
	
	public void addFunction(MatrixFunction function);
	
	public void listMathFunction();
	
}
