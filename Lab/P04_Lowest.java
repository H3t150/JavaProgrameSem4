package Lab;
import java.util.Scanner;

public class Comparition2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number:");
        int a = sc.nextInt();
        System.out.print("Enter 2nd Element:");
        int b = sc.nextInt();
        System.out.print("Enter 3rd Number:");
        int c = sc.nextInt();
        if (a<b) {
            if (a<c) {
                System.out.println("\n"+a+" is lowest");
            }
            else{
                System.out.println("\n"+c+" is lowest");
            }
        }
        else{
            if (b<c) {
                System.out.println("\n"+b+" is lowest");
            }
            else{
                System.out.println("\n"+c+" is lowest");
            }
        } 
        sc.close();
    }         

}
