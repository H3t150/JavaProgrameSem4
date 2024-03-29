package Lab;
import java.util.Scanner;

public class Floating {   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first floating-point number: ");
        double num1 = scanner.nextDouble();

        // Read the second floating-point number from the user
        System.out.print("Enter the second floating-point number: ");
        double num2 = scanner.nextDouble();

        // Check if the numbers are the same up to three decimal places
        if (EqualThreeDecimal(num1, num2)) {
            System.out.println("The numbers are the same up to three decimal places.");
        } else {
            System.out.println("The numbers are different.");
        }

        scanner.close();
    }

    // Function to check if two numbers are equal up to three decimal places
    private static boolean EqualThreeDecimal(double num1, double num2) {
        // Multiply by 1000 to move the decimal point three places to the right
        int scaledNum1 = (int) (num1 * 1000);
        int scaledNum2 = (int) (num2 * 1000);

        // Check if the scaled numbers are equal
        return scaledNum1 == scaledNum2;
    }
}

    

