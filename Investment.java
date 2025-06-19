package jennyworld;
import java.util.Scanner;
public class Investment {
	public static void main (String[] args) {
		Scanner money = new Scanner(System.in);
		double balance = 0; //investment amount
		double rate = 0; //interest rate
		double targetamount = 0; //goal amount
		double interest = 0; //as a decimal
		double year = 0; //in years
		System.out.println("Investment Program");
		System.out.println("by Jenny Wang");
		System.out.println(" ");
		System.out.println("This program will ask for the amount of money to invest, the rate of interest");
		System.out.println("earned per year and the target amount to find how many years it will take. ");
		System.out.println(" ");
		System.out.print("Please enter the amount of money to invest: $");
		balance = money.nextDouble();
		System.out.print("Please enter the rate of interest earned per year (example: 5% = 0.05): ");
		rate = money.nextDouble();
		System.out.print("Please enter target amount: $");
		targetamount = money.nextDouble();
		System.out.println(" ");
		System.out.print("Investment amount: $");
		System.out.printf("%1.2f\n", balance);
		System.out.print("Interest rate: ");
		System.out.printf("%1.2f\n", rate);
		System.out.print("Target amount: $");
		System.out.printf("%1.2f\n", targetamount);
		System.out.println(" ");
		System.out.print("Year #");
		System.out.printf("%15s", "Interest");
		System.out.printf("%15s\n", "Balance");
		// Year 0
		System.out.print("0");
		System.out.printf("%17s", "$0.00");
		System.out.printf("%12s", "$");
		System.out.printf("%1.2f\n", balance);
		while (balance < targetamount)
		{
			year = year + 1;
			System.out.printf("%1.0f",year);
			interest = balance * rate;
			balance = balance + interest;	
			System.out.printf("%13s","$");
			System.out.printf("%1.2f", interest);
			System.out.printf("%10s","$");
			System.out.printf("%1.2f\n", balance);
		}
		
		
		
		
		
		money.close();
}
}
// interest = ending balance * interest rate
// balance = ending balance + interest
// while Loop