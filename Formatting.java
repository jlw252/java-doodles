package jennyworld;
import java.util.Scanner;
public class Formatting {
	public static void main(String[] args){
		Scanner hotsauce = new Scanner(System.in);
		double input = 0.0;
		System.out.print("Please enter a value: ");
		input = hotsauce.nextDouble();
		System.out.printf("%26.2f\n", input);
		//  \n = hard return
		System.out.println("Hello Future");
		hotsauce.close();

}
}