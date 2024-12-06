/*
 * Written by Kelly Sullivan
 */

import java.util.Scanner;

public class SortingRects {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		// TODO Auto-generated method stub
		

        int size = userSizes(keyboard);

        // make array for rectangles
        Rectangle[] rectangles = new Rectangle[size];

        // runs the method
        enterData(keyboard, rectangles);

        // prompts user choice and runs method
        while (true) {
            displayMenu();
            int choice = keyboard.nextInt();
            keyboard.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    sortAscending(rectangles);
                    break;
                case 2:
                    sortDescending(rectangles);
                    break;
                case 3:
                    findAverageArea(rectangles);
                    break;
                case 4:
                    displayMinimumArea(rectangles);
                    break;
                case 5:
                    displayMaximumArea(rectangles);
                    break;
                case 6:
                    System.out.println("Thanks for sorting with us!");
                    keyboard.close();
                    return;
                default:
                    System.out.println("Invalid option. Try again!");
            }
        }
    }

    // introduces users
    private static int userSizes(Scanner keyboard) {
        int size;
        do {
        	System.out.println("Welcome to the rectangle sorter!");
        	System.out.println("How many rectangles are we sorting today?");
            size = keyboard.nextInt();
            if (size <= 0) {
                System.out.println("Please enter a number greater than 0.");
            }
        } while (size <= 0);
        return size;
    }

    // takes in user data
    private static void enterData(Scanner keyboard, Rectangle[] rectangles) {
        for (int i = 0; i < rectangles.length; i++) {
            System.out.println("Enter data for Rectangle " + (i + 1) + ":");
            System.out.print("Length: ");
            double length = keyboard.nextDouble();
            System.out.print("Width: ");
            double width = keyboard.nextDouble();
            rectangles[i] = new Rectangle(length, width);
        }
    }

    // sorts small to large
    private static void sortAscending(Rectangle[] rectangles) {
        // Bubble sort implementation
        for (int i = 0; i < rectangles.length - 1; i++) {
            for (int j = 0; j < rectangles.length - i - 1; j++) {
                if (rectangles[j].getArea() > rectangles[j + 1].getArea()) {
                    Rectangle temp = rectangles[j];
                    rectangles[j] = rectangles[j + 1];
                    rectangles[j + 1] = temp;
                }
            }
        }
        // Display sorted areas
        System.out.println("Rectangles sorted from small to large");
        for (Rectangle rectangle : rectangles) {
            System.out.println("Area: " + rectangle.getArea());
        }
    }

    // Method to sort rectangles by area in descending order
    private static void sortDescending(Rectangle[] rectangles) {
        // Bubble sort implementation
        for (int i = 0; i < rectangles.length - 1; i++) {
            for (int j = 0; j < rectangles.length - i - 1; j++) {
                if (rectangles[j].getArea() < rectangles[j + 1].getArea()) {
                    Rectangle temp = rectangles[j];
                    rectangles[j] = rectangles[j + 1];
                    rectangles[j + 1] = temp;
                }
            }
        }
        // Display sorted areas
        System.out.println("Rectangles sorted from largest to smallest");
        for (Rectangle rectangle : rectangles) {
            System.out.println("Area: " + rectangle.getArea());
        }
    }

    // Method to display the average area of rectangles
    private static void findAverageArea(Rectangle[] rectangles) {
        double sum = 0;
        for (Rectangle rectangle : rectangles) {
            sum += rectangle.getArea();
        }
        double average = sum / rectangles.length;
        System.out.println("The average area of the rectangles is " + average);
    }

    // Method to display the minimum area of rectangles
    private static void displayMinimumArea(Rectangle[] rectangles) {
        double minArea = Double.MAX_VALUE;
        for (Rectangle rectangle : rectangles) {
            double area = rectangle.getArea();
            if (area < minArea) {
                minArea = area;
            }
        }
        System.out.println("The smallest rectangle has an area of " + minArea);
    }

    // Method to display the maximum area of rectangles
    private static void displayMaximumArea(Rectangle[] rectangles) {
        double maxArea = Double.MIN_VALUE;
        for (Rectangle rectangle : rectangles) {
            double area = rectangle.getArea();
            if (area > maxArea) {
                maxArea = area;
            }
        }
        System.out.println("The largest rectangle has an area of " + maxArea);
    }

    // Method to display the menu options
    private static void displayMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Sort rectangles smallest to largest");
        System.out.println("2. Sort rectangles largest to smallest");
        System.out.println("3. Find average area of rectangles");
        System.out.println("4. Find smallest area");
        System.out.println("5. Find biggest area");
        System.out.println("6. Quit");
        System.out.print("Enter your choice: ");
    }
}

class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }
}
