package jennyworld;
import java.util.Scanner;
public class NestingLoops {
	public static void main (String[] args) {
		Scanner star = new Scanner(System.in);
		int rows = 0;
		int x = 0;
		int y = 0;
		System.out.print("I will print a triangle for you. How many rows would you like? ");
		rows = star.nextInt();
		System.out.println(" ");
		for(x=1; x<=rows ; x=x+1) 
		{
			for(y=1; y<=x; y=y+1)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		star.close();
	}

}
