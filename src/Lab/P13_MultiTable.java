package Lab;
import java.util.Scanner;

public class MultiTable {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        if(sc.hasNextInt()){
            int num = sc.nextInt();

             for(int i=0 ;i<=10 ;i++){
                System.out.println(num+"x"+ i + "=" + (num*i));

             }
        }
        else{
            System.out.println("Enter an integer");
        }
        sc.close();
    }
    
}
