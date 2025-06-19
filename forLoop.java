package jennyworld;
import java.util.Scanner;
public class forLoop {
	public static void main(String[] args) {
		Scanner LA = new Scanner(System.in);
		int num = 0;
		int c = 0;
		String name = "";
		System.out.print("Please enter your name: ");
		name = LA.nextLine();
		System.out.print("How many time would you like it printed: ");
		num = LA.nextInt();
		for (c=1; c<=num; c=c+1) 
		{
			System.out.println(c + ".)" +name);
			
		}
		System.out.println("Done!!");
		LA.close();
	}
	

}
