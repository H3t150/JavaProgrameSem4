package Lab;

import java.util.Scanner;

public class P24_DigitsSum {
    public static void main(String[] args) {
        int ogNum, num, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number :");
        num = sc.nextInt();
        ogNum = num;
        sc.close();
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println("Sum of Digits of " + ogNum + " = " + sum);
    }
}
