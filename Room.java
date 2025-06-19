package jennyworld;
import java.util.Scanner;
public class Room {
	public static void main(String[] args) {
		Scanner method = new Scanner(System.in);
		double length = 0;
		double width = 0;
		double height = 0;
		double flag = 0;
		double vol = 0; //volume
		double floora= 0; //floor area
		double per = 0; //perimeter
		String enter = "";
		do 
		{
			cls();
			System.out.println("Methods");
			System.out.println("by Jenny Wang");
			System.out.println(" ");
			System.out.println("This program will ask the user for the length, width and height of a room to find the volume,");
			System.out.println("area, and perimeter. If any of the values are negative, then the program will end.");
			System.out.println("");
			System.out.print("Please enter the length: ");
			length = method.nextDouble();
			method.nextLine();
			if (length < 0 )
			{
				System.out.println(" ");
				System.out.println("The program has ended. Have a good day!");
				break;
			}
			System.out.print("Please enter the width: ");
			width = method.nextDouble();
			method.nextLine();
			if (width < 0 )
			{
				System.out.println(" ");
				System.out.println("The program has ended. Have a good day!");
				break;
			}
			System.out.print("Please enter the height: ");
			height = method.nextDouble();
			method.nextLine();	
			if (height < 0 )
			{
				System.out.println(" ");
				System.out.println("The program has ended. Have a good day!");
				break;
			}
			System.out.println(" ");
			vol = volm(length,width, height);
			System.out.printf("%13s","Volume");
			System.out.printf("%25s", "Floor Area");
			System.out.printf("%25s\n", "Perimeter");
			System.out.printf("%1.2f", vol);
			System.out.printf("%5s", " Cubic Units");
			floora = flooram(length, width);
			System.out.printf("%15.2f", floora);
			System.out.printf("%5s", " Sq. Units");
			per = perm(length, width);
			System.out.printf("%15.2f", per);
			System.out.printf("%5s", " Units");
			System.out.println(" ");
			System.out.println("Press enter to continue ");
			enter = method.nextLine();
			
	
		}while(flag != 1);
		method.close();
		
		
	}
	
	public static void cls() {
		for (int i=1; i<=50; i++)
		{
			System.out.println(" ");
		}
	}
	
	public static double volm(double x, double y, double z) { // volume method
		return(x*y*z);
	}
	
	public static double flooram(double x, double y) { // floor area method
		return(x*y);
	}
	
	public static double perm(double x, double y) { // perimeter method
		return(2*x+2*y);
	}
	
	
} //Room

//