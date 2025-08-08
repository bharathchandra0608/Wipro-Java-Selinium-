package arrays;

import java.util.Scanner;


public class userinput{

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        // Ask user for number of rows and columns
	        System.out.print("Enter number of rows: ");
	        int rows = sc.nextInt();
	        System.out.print("Enter number of columns: ");
	        int cols = sc.nextInt();

	        // Create a 2D array
	        int[][] matrix = new int[rows][cols];

	        // Input elements into the matrix
	        System.out.println("Enter " + (rows * cols) + " elements:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                System.out.print("Element at [" + i + "][" + j + "]: ");
	                matrix[i][j] = sc.nextInt();
	            }
	        }

	        // Print the matrix2
	        
	        System.out.println("\nMatrix elements:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                System.out.print(matrix[i][j] + " ");
	           
	            }
	            System.out.println();

	        }
	}
	
}
