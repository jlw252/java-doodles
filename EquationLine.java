package jennyworld;
import java.util.Scanner;
public class EquationLine {
	public static void main(String[] args) {
		Scanner lime = new Scanner (System.in);
		System.out.println("What is my equation?");
		System.out.println("by Jenny Wang");
		System.out.println(" ");
		System.out.println("This program will help you determine your equation from two points in the form y = mx + b. ");
		System.out.println(" ");
		double x = 0;
		double y = 0;
		double x1 = 0;
		double y1 = 0;
		double m = 0;
		double b = 0;
		System.out.print("Please enter the x value from the first point: ");
		x = lime.nextDouble();
		System.out.print("Please enter the y value from the first point: ");
		y = lime.nextDouble();		
		System.out.print("Please enter the x value from the second point: ");
		x1 = lime.nextDouble();
		System.out.print("Please enter the y value from the second point: ");
		y1 = lime.nextDouble();
		System.out.println(" ");
		System.out.println("You entered the following information: ");
		System.out.println("The point (x,y): (" +x+ "," +y+ ")");
		System.out.println("The point (x1,y1): (" +x1+ "," +y1+")");
		System.out.println(" ");
		m = ((y-y1)/(x-x1));
		System.out.println("The slope of your line is "+m);
		b = (y1-m*x1);
		System.out.println("The y intercept of your line is " +b);
		System.out.println("The equation of your line is y = " +m+ "x + " +b);
		lime.close();
	
		
}
}