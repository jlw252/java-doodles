package jennyworld;
import java.util.Scanner;
public class NumofDiagonals {
public static void main (String[] arg) {
	Scanner key = new Scanner (System.in);
	// d will be the variable used for input Int d=0;
	// answer is the variable used to display the final answer Int answer=0;
	System.out.println("Diagonal Program");
	System.out.println("by Jenny Wang");
	System.out.print("Please eneter the number of sides: ");
	int d = 0;
	int answer = 0;
	d = key.nextInt();
	answer = d*(d-3)/2;
	System.out.println("The number of diagonals on a "+d+" sided figue is "+answer);
	key.close();
}
		
}
