package LineerAlgebraCalculator;

public class MatrixTranpoze implements MatrixFuncOneArg {
		
		private static String name = "Transpoze";

		public String getName() {
			return name;
		}
		
		@Override
		public int[][] calculate(int arr1[][]) {
			
			int[][] myArray = new int[arr1[0].length][arr1.length];
			
			for(int i=0; i<arr1[0].length; i++) {
				
				for(int j=0; j<arr1.length; j++) {
					
					myArray[i][j] = arr1[j][i];
				}
			}
			
			return myArray;
		}
			
}
