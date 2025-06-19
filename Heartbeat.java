package jennyworld;
import java.util.Scanner;
public class Heartbeat {
	public static void main(String[] args) {
		Scanner heart = new Scanner (System.in);
		System.out.println("What is my maximum heart rate during a workout?");
		System.out.println("by Jenny Wang");
		System.out.println(" ");
		System.out.println("This program will help you determine what your maximum heart rate should be depending on the workout intensity. ");
		System.out.println(" ");
		String name = "";
		System.out.print("Please enter the client's name: ");
		name = heart.nextLine();
		int age = 0;
		int max = 0;
		double low = 0;
		double med = 0;
		double high = 0;
		System.out.print("Please enter " +name+ "'s age: ");
		age = heart.nextInt();
		max=220-age;
		System.out.println(name+"'s maximum heart rate is " +max);
		System.out.println(" ");
		System.out.println("Warning: Anything over " +max+ " would be dangerous!");
		System.out.println(" ");
		low= max*0.5;
		med= max*0.7;
		high=max*0.85;
		System.out.println("Heart rate for a moderate intensity workout should be between " +low+ " and " +med);
		System.out.println("Heart rate for a vigorous intensity workout should be between " +med+ " and " +high);
		heart.close();
}
}
/* age int, name string. Calculate their max hear rate then give a range for a moderate intensity workout
max heart rate int
*/