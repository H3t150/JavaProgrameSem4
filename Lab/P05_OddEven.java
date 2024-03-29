package Lab;
import java.util.Scanner;

public class P05_OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = sc.nextInt();

        if (a%2==0) {
            System.out.println("\n"+a+" is Even");
        }
        else{
            System.out.println("\n"+a+" is Odd");
        }
    sc.close(); 
    } 

}
