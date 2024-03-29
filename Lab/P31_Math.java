import java.util.Random;

public class Program31_Math {
    public static void main(String[] args) {
        // 1. Math.max() - returns the maximum of two numbers
        int maxNumber = Math.max(10, 20);
        System.out.println("Maximum of 10 and 20: " + maxNumber);

        // 2. Math.min() - returns the minimum of two numbers
        int minNumber = Math.min(10, 20);
        System.out.println("Minimum of 10 and 20: " + minNumber);

        // 3. Math.abs() - returns the absolute value of a number
        double absValue = Math.abs(-5.67);
        System.out.println("Absolute value of -5.67: " + absValue);

        // 4. Math.sqrt() - returns the square root of a number
        double sqrtValue = Math.sqrt(25);
        System.out.println("Square root of 25: " + sqrtValue);

        // 5. Generating a random integer using Random class
        Random random = new Random();
        int randomInt = random.nextInt(100); // Generates a random integer between 0 and 99
        System.out.println("Random integer between 0 and 99: " + randomInt);
    }
}
