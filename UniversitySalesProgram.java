package jennyworld;
import java.util.Scanner;
public class UniversitySalesProgram {
	public static void main (String[] args) {
		Scanner sticker = new Scanner (System.in);
		double oprice = 0;
		//original price
		double disco = 0;
		//discounted
		double discop = 0;
		//discounted price
		double stax = 0;
		//sales tax
		double tprice = 0;
		//total price
		double tsavings = 0;
		//total savings
		System.out.println("University Sales Program");
		System.out.println("by Jenny Wang");
		System.out.println(" ");
		System.out.println("This program will help determine how much money you saved and spent ");
		System.out.println("at the University bookstore on October 24th through the original price.");
		System.out.println(" ");
		System.out.print("Please enter the original price: $");
		oprice = sticker.nextDouble();
		System.out.println(" ");
		if (oprice < 128)
		{
			disco = oprice*0.08;
			discop = oprice - disco;
			stax = (oprice-disco)*0.06;
			tprice = (oprice-disco)+stax;
			tsavings = oprice - tprice;
			System.out.println("Sales Receipt: University Bookstore");
			System.out.printf("Original Price: $" + "%.2f\n", oprice);
			System.out.print("Discounted Price (8%): $");
			System.out.printf("%.2f\n",discop);
			System.out.print("Sales Tax (6%): $");
			System.out.printf("%.2f\n", stax);
			System.out.printf("Total Price: $" + "%.2f\n", tprice);
			System.out.printf("Total Savings: $" + "%.2f\n", tsavings);
			System.out.println(" ");
			System.out.println("Thank You for shopping with us!");
		}
		else
		{
			disco = oprice*0.16;
			discop = oprice - disco;
			stax = (oprice-disco)*0.06;
			tprice = (oprice-disco)+stax;
			tsavings = oprice - tprice;
			System.out.println("Sales Receipt: University Bookstore");
			System.out.printf("Original Price: $" + "%.2f\n", oprice);
			System.out.print("Discounted Price (16%): $");
			System.out.printf("%.2f\n",discop);
			System.out.print("Sales Tax (6%): $");
			System.out.printf("%.2f\n", stax);
			System.out.printf("Total Price: $" + "%.2f\n", tprice);
			System.out.printf("Total Savings: $" + "%.2f\n", tsavings);
			System.out.println(" ");
			System.out.println("Thank You for shopping with us!");
		}
		sticker.close();
}
}