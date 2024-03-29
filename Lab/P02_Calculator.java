package Lab;
import java.util.Scanner;

public class P02_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number A : ");
        int a = sc.nextInt();
        System.out.print("Enter a number B : ");
        int b = sc.nextInt();

        int sum = a + b ;
        System.out.println("Addition : "+ sum);
        int sub = a - b;
        System.out.println("Subtraction : " + sub );
        int mult = a * b;
        System.out.println("Multiplication : " + mult);
        if (b==0) {
            System.out.println("EROOR");
        }
        else{
            float div = (float)a/b;
            System.out.println("Divition : " + div);
            sc.close();
        }
    }

    
}
