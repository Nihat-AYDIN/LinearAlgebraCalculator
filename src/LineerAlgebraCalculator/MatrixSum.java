package LineerAlgebraCalculator;

public class MatrixSum implements MatrixFuncTwoArg {
		
		private static String name = "Sum";

		public String getName() {
			return name;
		}
		
		// are they suitable for the sum?
		
		public int check(int arr1[][], int arr2[][]) {
			
			if(arr1.length == arr2.length && arr1[0].length == arr2[0].length)
				return 1;
			else
				return -1;
		}
		
		@Override
		public int[][] calculate(int arr1[][], int arr2[][]) {
				
			int[][] myArray = new int[arr1.length][arr1[0].length];
			 
			if(check(arr1, arr2) == 1) {
				
				for(int i=0; i<arr1.length; i++) {
					for(int j=0; j<arr1[0].length; j++) {
						
						myArray[i][j] = arr1[i][j] + arr2[i][j];
			    	}
				} 	  
			}else {
				
				System.out.println("These matrices do not provide sum operation.");
			}
			
			return myArray;
		}
			
}
