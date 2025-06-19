package jennyworld;
import java.util.Scanner;
public class Encryption {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	String input = "";
	int i = 0;
	int start = 0;
	int end = 0;
	char x = ' ';
	System.out.print("Enter the starting value for the asc (hint 1): ");
	input = in.nextLine();
	start = Integer.parseInt(input);
	System.out.print("Enter the ending value for the asc (hint 127): ");
	input = in.nextLine();
	end = Integer.parseInt(input);
	System.out.println(" ");
	System.out.print("Press enter to view the characters: ");
	input = in.nextLine();
	for(i=start; i<end; i++)
	{
		x= (char)i;
		System.out.println("The character is "+x+" the ACS value is "+i);
	}
	}
}