package LineerAlgebraCalculator;

public interface Calculator {
	
	public void doCalculationOneArg(String functionName);
	
	public void doCalculationTwoArg(String functionName);
	
	public void addFunction(MatrixFunction function);
	
	public void listMathFunction();
	
}
