package Lab;

import java.util.Scanner;

public class P10_Vowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read a single character from the user
        System.out.print("Enter a single character from the alphabet: ");
        String input = scanner.nextLine();

        // Check if the input is a single character
        if (input.length() == 1 && Character.isLetter(input.charAt(0))) {
            char ch = Character.toLowerCase(input.charAt(0));

            // Check if the character is a vowel or a consonant
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("The entered character is a Vowel.");
            } 
            else {
                 System.out.println("The entered character is a Consonant.");
            }
        } 
        else {
            System.out.println("Error: Please enter a single character from the alphabet.");
        }

        scanner.close();
    }

}
    

