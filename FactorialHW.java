package jennyworld;
import java.util.Scanner;
public class FactorialHW {
	public static void main (String[] args) {
		Scanner fact = new Scanner(System.in);
		int num = 0;
		double factor = 1;
		double factorw =1; 
		int i = 0;
		System.out.println("Factorials");
		System.out.println("by Jenny Wang");
		System.out.println(" ");
		System.out.println("This program will find the factorial of a number (integer) of your choosing.");
		System.out.println(" ");
		System.out.print("Please enter the number you want the factorial of: ");
		num = fact.nextInt();
		System.out.println(" ");
		System.out.print("For Loop ");
		System.out.printf("%15s", "While Loop");
		System.out.println(" ");
		for (i = 1; i <= num; i++)
		{
			factor = factor * i;
			
		}
		System.out.printf("%.0f",factor);
		i = 1;
		while (i <= num)
		{
			factorw = factorw * i;
			i++;
			
		}
		System.out.printf("%14.0f",factorw);     
		fact.close();	
		
		
			}    

	}
