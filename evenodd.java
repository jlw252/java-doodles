package jennyworld;
import java.util.Scanner;
public class evenodd {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = 0;
		System.out.println("Even or Odd");
		System.out.println("by Jenny Wang");
		System.out.println(" ");
		System.out.println("This program will tel you if a number is even or odd.");
		System.out.println(" ");
		System.out.print("Please enter number: ");
		num = in.nextInt();
		System.out.println(" ");
		if (num/2 == num/2.0)
		{
			System.out.println("The number is even");	
		}
		else
		{
			System.out.println("The number is odd");
		}
		in.close();
	}
}
// line 15: if (num % 2 == 0)