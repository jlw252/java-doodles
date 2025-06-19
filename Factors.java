package jennyworld;
import java.util.Scanner;
public class Factors {
	public static void main (String[] args) {
		Scanner fact = new Scanner(System.in);
		int x = 0;
		int i = 0;
		System.out.println("Factors");
		System.out.println("by Jenny Wang");
		System.out.println(" ");
		System.out.println("This program will find all the factors of any integer you want.");
		System.out.println(" ");
		System.out.print("Please enter the number and I will find all of its factors: ");
		x = fact.nextInt();
		System.out.println(" ");
		System.out.println("The factors of "+x+ " are:");
		for(i=1; i<=x; i++)
		{
			if (x%i == 0)
			{
				System.out.println(i+" and "+x/i);
			}
		}
		
		fact.close();
}
}