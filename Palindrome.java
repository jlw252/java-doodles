package jennyworld;
import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	String input = "";
	String reverse = "";
	int i = 0;
	System.out.println("Palindrome Quiz");
	System.out.println("by Jenny Wang");
	System.out.print("Please input a word to see if it is a palidrome: ");
	input = in.nextLine();
	System.out.println(" ");
	System.out.println("The original input was "+input);
	System.out.println("The orginal input in all caps would be "+input.toUpperCase());
	input = input.toUpperCase();
	for(i=0; i<input.length(); i++)
		{
			reverse = input.substring(i,i+1) + reverse;
		}
	System.out.println("The reverse is "+reverse);
	if (input.equals(reverse))
		{
			System.out.println("It is a Palindrome");
		}
	else
		{
			System.out.println("It is NOT a Palindrome");
		}
	} //main void
} //Palindrome