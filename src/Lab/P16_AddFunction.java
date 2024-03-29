package Lab;
import java.util.Scanner;

       class Adder {
   
        int add(int num1, int num2) {
            return num1 + num2;
        }
    }
public class AdderFunction {    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    
            Adder adder = new Adder();
    
            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();
    
            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();
    
            int sum = adder.add(num1, num2);
    
            System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);
            sc.close();
        }
    }
    
    

