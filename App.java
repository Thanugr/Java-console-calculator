package firstProg;
import java.util.*;



	public class App {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        boolean run = true;

	        while (run) {
	            System.out.println("\nSimple Calculator");
	            System.out.println("1. Addition");
	            System.out.println("2. Subtraction");
	            System.out.println("3. Multiplication");
	            System.out.println("4. Division");
	            System.out.println("5. Exit");

	            System.out.print("Enter your choice (1/2/3/4/5): ");
	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    add(scanner);
	                    break;
	                case 2:
	                    subtract(scanner);
	                    break;
	                case 3:
	                    multiply(scanner);
	                    break;
	                case 4:
	                    divide(scanner);
	                    break;
	                case 5:
	                    run = false;
	                    System.out.println("Exiting...");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please choose a valid option.");
	            }
	        }
	        scanner.close();
	    }

	    public static void add(Scanner scanner) {
	        double num1 = getNumber(scanner, "Enter first number: ");
	        double num2 = getNumber(scanner, "Enter second number: ");
	        System.out.println("Result: " + (num1 + num2));
	    }

	    public static void subtract(Scanner scanner) {
	        double num1 = getNumber(scanner, "Enter first number: ");
	        double num2 = getNumber(scanner, "Enter second number: ");
	        System.out.println("Result: " + (num1 - num2));
	    }

	    public static void multiply(Scanner scanner) {
	        double num1 = getNumber(scanner, "Enter first number: ");
	        double num2 = getNumber(scanner, "Enter second number: ");
	        System.out.println("Result: " + (num1 * num2));
	    }

	    public static void divide(Scanner scanner) {
	        double num1 = getNumber(scanner, "Enter dividend: ");
	        double num2 = getNumber(scanner, "Enter divisor: ");
	        if (num2 != 0) {
	            System.out.println("Result: " + (num1 / num2));
	        } else {
	            System.out.println("Error! Division by zero is not allowed.");
	        }
	    }

	    public static double getNumber(Scanner scanner, String prompt) {
	        while (true) {
	            try {
	                System.out.print(prompt);
	                return scanner.nextDouble();
	            } catch (Exception e) {
	                System.out.println("Invalid input. Please enter a number.");
	                scanner.next(); // Clear invalid input
	            }
	        }
	    }
	}

