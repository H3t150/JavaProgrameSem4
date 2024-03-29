package Lab;
import java.util.Scanner;

public class Comparition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number A : ");
        int a = sc.nextInt();
        System.out.print("Enter a number B : ");
        int b = sc.nextInt();
        System.out.print("Enter a number C : ");
        int c = sc.nextInt();
        if (a>b) {
            if (a>c) {
                System.out.println("\n"+a+" is Greatest");
            }
            else{
                System.out.println("\n"+c+" is Greatest");
            }
        }
        else{
            if (b>c) {
                System.out.println("\n"+b+" is Greatest");
            }
            else{
                System.out.println("\n"+c+" is Greatest");
            }
        }
        sc.close();
    }

    
}
