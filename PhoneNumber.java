package jennyworld;
import java.util.Scanner;
public class PhoneNumber {
	public static void main(String[] args) {
		int x =0;
		while (x<=9999)
		{
			System.out.printf("472-%04d", x);
			x=x+1;
			if (x/10 == x/10.0)
			{
				System.out.println();
			}
			System.out.print(" -> ");
			
		}
		
	}

}
