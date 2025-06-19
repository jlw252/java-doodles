package jennyworld;
import java.util.Scanner;
public class Factorials {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int num = 0;
		int high = 0;
		int low = 1000;
		while (num != -1)
		{
			
		System.out.print("Please enter a postive interger, -1 to and ");
		num = in.nextInt();
		if (num == -1)
		{
			break;
		}
		if (num < low)
		{
			low = num;
		}
		if (num > high)
		{
			high = num;
		}
	
		
		}
		System.out.println(" ");
		System.out.println("The highest value entered was: " +high);
		System.out.println("The lowest value entered was: "+low);
		in.close();
	}
}
