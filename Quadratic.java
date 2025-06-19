package jennyworld;
import java.util.Scanner;
public class Quadratic {
	public static void main (String[] args) {
		Scanner lemonade = new Scanner (System.in);
		double a = 0;
		// the value a
		double b = 0;
		// the value b
		double c = 0;
		// the value c
		double x1 = 0;
		// first x value
		double x2 = 0;
		//second x value
		double s = 0;
		// sqrt(b^2 - 4ac)
		System.out.println("Quadratic Equation Solver");
		System.out.println("by Jenny Wang");
		System.out.println(" ");
		System.out.println("This program will solve quadratic equations using the quadratic formula through the");
		System.out.println("variables a, b, and c resulting with two real roots, one real root, or no real solution.");
		System.out.println(" ");
		System.out.print("Please enter the a value: ");
		a = lemonade.nextDouble();
		System.out.print("Please enter the b value: ");
		b = lemonade.nextDouble();
		System.out.print("Please enter the c value: ");
		c = lemonade.nextDouble();
		System.out.println(" ");
		x1 = (-b+Math.sqrt(b*b-4*a*c))/(2*a);
		x2 = (-b-Math.sqrt(b*b-4*a*c))/(2*a);
		s = (b*b-4*a*c);
		System.out.println("Your entered equation is "+a+"x^2 + "+b+"x + "+c+ " = 0");
		System.out.println(" ");
		if (s > 0)
		{
			System.out.println("Two Real Roots");
			System.out.print("X = ");
			System.out.printf("%.4f\n", x1);
			System.out.println("or");
			System.out.print("X = ");
			System.out.printf("%.4f", x2);
		}
		if (s == 0)
		{
			System.out.println("One Real Root");
			System.out.print("X = ");
			System.out.printf("%.4f\n", x1);
		}		
		if (s < 0)
		{
			System.out.println("No Real Solution");
		}
		lemonade.close();

}
}