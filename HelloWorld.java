package jennyworld;
import java.util.Scanner;
public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println("by Jenny Wang");
		Scanner neo = new Scanner(System.in);
		int first=0;
		int second = 0;
		int total=0;
		System.out.print("Please enter the first number: ");
		first = neo.nextInt();
		System.out.print("Please enter the second number: ");
		second= neo.nextInt();
		total = first + second;
		System.out.println("Did you know that "+first+" + "+second+" = " +total);
		total = first - second;
		System.out.println(first+" - "+second+" = "+total);
		total = first * second;
		System.out.println(first+ " * "+second+" = "+total);
		total = first / second;
		System.out.println(first+ " / "+second+" = " +total);
		total = first % second;
		System.out.println(first+ " % " +second+" = " +total);
		double sr = 8;
		sr = Math.sqrt(total);
		System.out.println("sq root of "+total+" is "+sr);
		System.out.println(first+" %  -- "+second+" is "+total);
		total = first % --second;
		System.out.println("--second = "+--second);
		neo.close();
		
	}

}
