/* 
 * Written by Kelly Sullivan
 */
import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Welcome to the matrix subtractor!");
		


        // get matrix dimensions
        int rowsA = dimensions("How many rows does the first matrix have?", keyboard);
        int colsA = dimensions("How many columns does the first matrix have?", keyboard);
        int rowsB = dimensions("How many rows does the second matrix have?", keyboard);
        int colsB = dimensions("How many columns  does the first matrix have?", keyboard);

        
        
        if (rowsA != rowsB || colsA != colsB) {
            System.out.println("These Matrices don't have the same dimentions and cannot be subtracted.");
            return;
            }
            
            
        // Create matrices
        int[][] matrixA = makeMat(rowsA, colsA, keyboard);
        int[][] matrixB = makeMat(rowsB, colsB, keyboard);
       
        
    
        // Subtract matrices
        int[][] result = sub(matrixA, matrixB);

        // print the matrices and results
        System.out.println("Matrix A:");
        print(matrixA);
        System.out.println("Matrix B:");
        print(matrixB);
        System.out.println("Matrix A-B:");
        print(result);

        keyboard.close();
    }

    // get dimensions from user
    private static int dimensions(String prompt, Scanner keyboard) {
        System.out.print(prompt + " ");
        return keyboard.nextInt();
        
     
    }

    // create and fill matrix
    private static int[][] makeMat(int rows, int cols, Scanner keyboard) {
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter matrix values:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter value for index (" + i + ", " + j + "): ");
                matrix[i][j] = keyboard.nextInt();
            }
        }
        return matrix;
    }

    // subtract the matrices
    private static int[][] sub(int[][] matrixA, int[][] matrixB) {
        int rows = matrixA.length;
        int cols = matrixA[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrixA[i][j] - matrixB[i][j];
            }
        }
        return result;
    }

    // print out the matrix
    private static void print(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
