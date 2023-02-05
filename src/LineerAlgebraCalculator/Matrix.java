package LineerAlgebraCalculator;

import java.util.Scanner;

public class Matrix {	
	
	public  int[][] createMatrix() {
	      Scanner sc = new Scanner(System.in);
	      System.out.print("Enter the size of the array row that is to be created:: ");
	      int sizerow = sc.nextInt();
	      System.out.print("Enter the size of the array column that is to be created:: ");
	      int sizecolumn = sc.nextInt();
	      int[][] myArray = new int[sizerow][sizecolumn];
	      System.out.println("Enter the elements of the array ::");

	      for(int i=0; i<sizerow; i++) {
	    	  for(int j=0; j<sizecolumn; j++) { 
	    		  myArray[i][j] = sc.nextInt();
	    	  }	  
	      }
		  sc.close();
	      return myArray;
	}
	
	public void display(int arr[][]) {
	    System.out.println("Matrix ::");
		
		for(int i=0; i<arr.length; i++) {
	    	  for(int j=0; j<arr[i].length; j++) {
	    		  
	    		  System.out.print(arr[i][j] + " ");
	    	  } 
	    	  System.out.println("");
		}

	}

}
