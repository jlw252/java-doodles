package jennyworld;
import java.util.Scanner;
public class PrimeNumbers {
	public static void main(String[] args) {
		Scanner prime = new Scanner(System.in);
		int x = 0;
		int i = 0;
		//int c = 0;
		System.out.println("Prime Numbers");
		System.out.println("by Jenny Wang");
		System.out.println(" ");
		System.out.print("Enter the number to check if it is a prime number: ");
		x = prime.nextInt();
		System.out.println(" ");
		System.out.println();
		for(i=2; i<=x-1; i++)
		{
			if(x%i == 0)
			{
				System.out.println(x+" is not a prime number. It can be divided by at least " +i);
				//i = x;
				break;
			}
			else //(c == 0)
				{
				System.out.println("The number " +x+ " is a prime number");
				}
			
		}
		//if (c == 0)
		//{
		//System.out.println("The number " +x+ " is a prime number");
		//}
		prime.close();
	}

}
