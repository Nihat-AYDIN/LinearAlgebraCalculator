package LineerAlgebraCalculator;

import java.util.Scanner;

public class ScalarMultiplication implements MatrixFuncOneArg {

	private static String name = "scalarMultiplication";

	public String getName() {
		return name;
	}

	@Override
	public int[][] calculate(int[][] arr) {

		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the scalar number for scalar multiplication:: ");
	    int scalarnum = sc.nextInt();
	    sc.close();
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j<arr[0].length; j++) {
				
				arr[i][j] *= scalarnum;
			}
		}
		return arr;
	}
	
	

}
