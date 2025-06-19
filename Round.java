package jennyworld;
import java.util.Scanner;
public class Round {
	public static void main(String[] args) {
		 Scanner input=new Scanner(System.in);
	        int flag = 0;
	        int ca = 0;
	        int ta = 0;
	        double p = 0.0;
	        int d = 0;
	        String enter = "";    
	    do
	    {
	    cls();
	    System.out.print("Enter the correct number ");
	    ca = input.nextInt();
	    input.nextLine();
	    System.out.println();
	    if (ca<0) {
	        flag = 1;
	        break;
	    }
	    System.out.print("Enter the total number ");
	    ta = input.nextInt();
	    input.nextLine();
	    System.out.println();
	    if (ta<0) {
	        flag = 1;
	        break;
	    }
	    System.out.print("Enter the number of decimal places to round to ");
	    d = input.nextInt();
	    input.nextLine();
	    System.out.println();
	    if (d<0) {
	        flag = 1;
	        break;
	    }
	    p = percent(ca,ta,d);
	    System.out.println();
	    System.out.println("The percent is " + p + "%");
	    System.out.println("Press enter to continue");
	    enter = input.nextLine();    
	    }while (flag !=1);
	    input.close();
	    System.out.println("That's All Folks");
	    }
	    public static void cls() {
	        for(int i=1;i<50;i=i+1)
	        {
	            System.out.println();
	        }
	        }
	    public static double percent (int ca, double ta, int d) {
	        double p = 0.0;
	        p = ca/ta*100.0;
	        p = p*(Math.pow(10, d)) + .5;
	        p = (int) (p)/(Math.pow(10, d));
	        return p;
	        }
	    }