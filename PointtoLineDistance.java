package jennyworld;
import java.util.Scanner;
public class PointtoLineDistance {
	/*Variables used 
	a is the coef on the x in the equation
	b is the coef on the y in the equation
	c is the value in the equation
	x is the x value in the point
	y is the y value in the point*/
	public static void main(String[] args) {
	System.out.println("What is the closest distance from my point to my line?");
	System.out.println("by Jenny Wang");
	System.out.println(" ");
	System.out.println("This program will help you determine the closest distance from your line Ax+By+C=0 to your point (x,y).");
	System.out.println(" ");
	Scanner point = new Scanner (System.in);
	double A = 0;
	double B = 0;
	double C = 0;
	double x = 0;
	double y = 0;
	double dist1 = 0;
	double dist2= 0;
	double findist = 0;
	System.out.print("Please enter the value of A: ");
	A = point.nextDouble();
	System.out.print("Please enter the value of B: ");
	B = point.nextDouble();
	System.out.print("Please enter the value of C: ");
	C = point.nextDouble();
	System.out.print("Please enter the value of x: ");
	x = point.nextDouble();
	System.out.print("Please enter the value of y: ");
	y = point.nextDouble();
	dist1 = Math.abs(A*x+B*y+C);
	dist2= Math.sqrt(A*A+B*B);
	findist = dist1/dist2;
	System.out.println(" ");
	System.out.println("The distance between point (" +x+ "," +y+ ") and line " +A+"x + "+B+ "y + " +C+ " = 0 is " +findist+" units");
	point.close();
	}
}

