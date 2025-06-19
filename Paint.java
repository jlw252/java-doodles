package jennyworld;
import java.util.Scanner;
public class Paint {
	public static void main (String[] arg) {
		Scanner purple = new Scanner (System.in);
		// g will be the variable used for input Int d=0;
		// answer is the variable used to display the final answer Int answer=0;
		System.out.println("How many gallons do I need?");
		System.out.println("by Jenny Wang");
		System.out.println(" ");
		String name = "";
		System.out.print("Please enter the client's name: ");
		name = purple.nextLine();
		double length = 0;
		double width = 0;
		double height = 0;
		double totarea= 0;
		double gallon= 0;
		System.out.print("Please enter length in feet: ");
		length = purple.nextInt();
		System.out.print("Please enter width in feet: ");
		width = purple.nextInt();
		System.out.print("Please enter height in feet: ");
		height = purple.nextInt();
		totarea = 2*length*height + 2*width*height;
		System.out.println(" ");
		System.out.println("The walls' areas is "+totarea+" square feet");
		gallon = totarea/400;
		System.out.println("You will need "+gallon+" gallons of paint");
		System.out.println("Note: 1 gallon of paint will cover 400 square feet");
		purple.close();
		
	}		
	}
