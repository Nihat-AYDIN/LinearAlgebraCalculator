package LineerAlgebraCalculator;

public class MatrixMultiplication implements MatrixFuncTwoArg {
		
		private static String name = "Multiplication";

		public String getName() {
			return name;
		}
		
		// are they suitable for the multiplication?
		public int check(int arr1[][], int arr2[][]) {
			
			if(arr1[0].length == arr2.length)
				return 1;
			else
				return -1;
		}

		@Override
		public int[][] calculate(int arr1[][], int arr2[][]) {
				
			int[][] myArray = new int[arr1.length][arr2[0].length];

			if(check(arr1, arr2) == 1) {
				
				for(int i=0; i<arr1.length; i++) {
					
					for(int j=0; j<arr2[0].length; j++) {
						
						for(int k = 0; k<arr2.length; k++) {
							
							myArray[i][j] += arr1[i][k] * arr2[k][j];
						}
			    	}
				} 	  
			}else {
				
				System.out.println("These matrices cannot be multiplied.");
			}			
			return myArray;
		}	
				
}
