/*
 * Written by Kelly Sullivan
 */
import java.util.Scanner;
import java.util.Arrays;

public class VectorMathProblem {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        
        // program main loop
        while (running) {
            System.out.println("Welcome to your Vector Math Helper!");
            System.out.println("What do you need help with today?");
            System.out.println("1. Add Two Vectors");
            System.out.println("2. Subtract Two Vectors");
            System.out.println("3. Find the Magnitude of a Vector");
            System.out.println("4. Exit");
            
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    vectorAddition(scanner);
                    break;
                case 2:
                    vectorSubtraction(scanner);
                    break;
                case 3:
                    vectorMagnitude(scanner);
                    break;
                case 4:
                    running = false;
                    System.out.println("Glad to help! Exiting program!");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter 1, 2, 3, or 4.");
            }
        }
        scanner.close();
    }

    // vector addition function
    public static void vectorAddition(Scanner scanner) {
        System.out.println("Enter the size of the vectors:");
        int size = scanner.nextInt();
        if (size < 1) {
            System.out.println("Error: Vector size must be at least 1.");
            return;
        }

        double[] vector1 = vectorInput(scanner, size, "first");
        double[] vector2 = vectorInput(scanner, size, "second");

        double[] result = new double[size];
        for (int i = 0; i < size; i++) {
            result[i] = vector1[i] + vector2[i];
           
        }
       
        System.out.println(Arrays.toString(vector1) + " + " + Arrays.toString(vector2)+"="+ Arrays.toString(result));
        System.out.println("The result of vector addition is: " + Arrays.toString(result));
    }

    //vector subtraction function
    public static void vectorSubtraction(Scanner scanner) {
        System.out.println("Enter the size of the vectors:");
        int size = scanner.nextInt();
        if (size < 1) {
            System.out.println("Error: Vector size must be at least 1.");
            return;
        }

        double[] vector1 = vectorInput(scanner, size, "first");
        double[] vector2 = vectorInput(scanner, size, "second");

        double[] result = new double[size];
        for (int i = 0; i < size; i++) {
            result[i] = vector1[i] - vector2[i];
        }
        System.out.println(Arrays.toString(vector1) + " - " + Arrays.toString(vector2)+"="+ Arrays.toString(result));
        System.out.println("The result of vector subtraction is: " + Arrays.toString(result));
    }

    // magnitude of a vector function
    public static void vectorMagnitude(Scanner scanner) {
        System.out.println("Enter the size of the vector:");
        int size = scanner.nextInt();
        if (size < 1) {
            System.out.println("Error: Vector size must be at least 1.");
            return;
        }

        double[] vector = vectorInput(scanner, size, "");

        double sumOfSquares = 0;
        for (double v : vector) {
            sumOfSquares += v * v;
        }
        
        double magnitude = Math.sqrt(sumOfSquares);
        System.out.println("The magnitude of the vector is: " + magnitude);
    }

    // function to get vector info
    public static double[] vectorInput(Scanner scanner, int size, String vectorName) {
        double[] vector = new double[size];
        System.out.println("Enter the components of the " + vectorName + " vector:");
        for (int i = 0; i < size; i++) {
            vector[i] = scanner.nextDouble();
        }
        return vector;
    }
}