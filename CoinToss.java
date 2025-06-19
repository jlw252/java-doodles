package jennyworld;
import java.util.Scanner;
public class CoinToss {
	public static void main(String[] args) {
		Scanner coin = new Scanner(System.in);
		//int input = 0;
		int x= 0; // # of tosses
		double n = 0;
		int toss = 0; // i loop variable
		String t = "";
		//int r= 0;
		System.out.println("Coin Toss Program");
		System.out.println("by Jenny Wang");
		System.out.println(" ");
		System.out.println("This program will generate random numbers. If the number is less than .5 it will indicate tails,");
		System.out.println("if greater than .5 it will indicate heads.  If it is exactly .5 then it will indicate “on edge”. ");
		System.out.println(" ");
		do 
		{	
			for(toss=1; toss<=50;toss++) // clears screen
			{
				System.out.println();
			}
			System.out.print("Please enter the number of tosses (a negative value to end the program): ");
			x = coin.nextInt();
			coin.nextLine();
			int heads = 0;
			int tails = 0;
			int edge =0;
			/*if (x<0)
			{
				break;
			}*/
			for (toss=1; toss<=x; toss++)
				{
					n = Math.random();
					//r = (int)(n*10)
					// System.out.println(i+" -> " +r);
					if(n < 0.5)
					{
						tails++;
					}
					if (n > 0.5)
					{
						heads++;
					}
					if (n == 0.5)
					{
						edge++;
					}
				}
			if (heads > 0)
			{
				System.out.println("Heads = " +heads);
			}
			if (tails > 0)
			{
				System.out.println("Tails = " +tails);
			}
			if (edge > 0)
			{
				System.out.println("On edge" +edge);
			} 
			System.out.println(" ");
			System.out.println();
			System.out.println("Press Enter to continue");
			t = coin.nextLine();
		} while (x >= 0);
		System.out.println("Thanks for using my coin toss, have a great day!");
			coin.close();
}
}
// while or do (outer loop)