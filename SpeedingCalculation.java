package jennyworld;
import java.util.Scanner;
public class SpeedingCalculation {

	public static void main(String[] args) {
		//TODO Auto-generated method stub
		Scanner fries = new Scanner(System.in);
		double first=0;
		double chicken=0;
		System.out.println("This program will tell you how many miles per hour you drove.");
		System.out.println("Please enter how many seconds you drove ");
		first = fries.nextInt();
		chicken = 3600/first;
		System.out.println("You drove "+chicken+" miles per hour.");
		fries.close();
}
}
