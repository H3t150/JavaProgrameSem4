package Lab;
import java.util.Scanner;

public class P11_leapYear {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Input the year: ");

		int year = scanner.nextInt();
		boolean x=(year%4)==0;
		boolean y=(year%100)!=0;
		boolean z=(year%100==0)&&(year%400==0);

		if(x&&(y||z))
		{
			System.out.println(year+" is a leap year");

		}
        else
		{
			System.out.println(year+" is not a leap year");
		}
	scanner.close();
    }

}