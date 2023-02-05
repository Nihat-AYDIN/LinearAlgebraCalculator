package LineerAlgebraCalculator;

public class MatrixTrace implements MatrixFunction {
		
		private static String name = "Trace";

		public String getName() {
			return name;
		}
		
		// are they suitable for the trace?
		public int check(int arr[][]) {
			
			if(arr.length == arr[0].length)
				return 1;
			else
				return -1;
		}

		public int calculate(int arr[][]) {
			
			int matTrace = 0;
			
			if(check(arr) == 1) {
				
				for(int i=0; i<arr.length; i++) {
					
					matTrace += arr[i][i];
				}
				
			}else {
				
				System.out.println("This matrix not a traceable matrix.");
			}
			return matTrace;
		}
			
}
