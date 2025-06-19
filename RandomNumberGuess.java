package jennyworld;
import java.util.Scanner;
public class RandomNumberGuess {
	public static void main(String[] args) {
		Scanner guess = new Scanner(System.in);
		int l = 1; //lowest value
		int h = 1000; //highest value
		double r = 0; // random number
		int input = 0;
		int g = 0; //Computer's guess
		int X = 0; //random number that the computer will generate for each game
		int gc = 0; //guess count
		do 
		{	
			cls();
			System.out.println("Guess that Number");
			System.out.println("by Jenny Wang");
			System.out.println(" ");
			System.out.println("1. Computer will guess your number."); //computer plays
			System.out.println("2. Guess the computer's number"); //user plays
			System.out.println("3. Quit");
			System.out.println(" ");
			System.out.print("Enter your option: ");
			input = guess.nextInt();
			guess.nextLine();
			System.out.println(" ");
			switch(input)
			{
			case 1: // computer guesses
				cls();
				g = 500;
				int c =0;
				l = 1;
				h = 1000;
				int t = 0;
				String enter = "";
				System.out.println("Computer will guess your number.");
				System.out.println("by Jenny Wang");
				System.out.println(" ");
				while(!enter.equals("c"))
				{
					System.out.println("Is your number "+g+"?");
					System.out.println("Press l if the number is lower.");
					System.out.println("Press h if the number is higher number.");
					System.out.println("Press c if the number is correct.");
					enter = guess.nextLine();
					t++;
					if (enter.equals("l")|| enter.equals("L"))
					{
						h=g;
						g=l+(h-l)/2;
						System.out.println(" ");
					}
					if (enter.equals("h")|| enter.equals("H"))
					{
						l=g;
						g=g+(h-g)/2;
						System.out.println(" ");
					}
					if (t == 12)
					{
						System.out.println("You must have made a mistake! I know how to play this game.");
						enter = guess.nextLine();
						break;
					}
				}
				System.out.println("I win! Your number was: "+ g);
				System.out.println(" ");
				System.out.println("Please enter to return to the menu.");
				enter = guess.nextLine();
				break;
			case 2 : // user guesses
				c=0;
				cls();
				r = Math.random();
				X = (int)(r*1000)+1;
				System.out.println("Guess the computer's number");
				System.out.println("by Jenny Wang");
				System.out.println(" ");
				System.out.println("I have chosen a number between 1 and 1000, try to guess my number.");
				System.out.println("I will tell you if your guess is too high or low.");
				System.out.println(" ");
				do
				{
					System.out.println("My number is between "+l+" and "+h);
					System.out.print("You have guessed "+gc+" times. What is your next guess? ");
					g = guess.nextInt();
					guess.nextLine();
					gc++;
					if (g != X)
					{
						if (g > X)
						{
							System.out.println("Incorrect, you guessed too high");
							h=g;
						}
						if (g < X)
						{
							System.out.println("Incorrect, the number you guessed is too low");
							l=g;
						}
					}
					if (g == X) 
					{
						System.out.println("Correct. You guessed with "+gc+" tries!");
							
						if (c<=6)
						{
							System.out.println("That was quick!");
							System.out.println(" ");
						}
						if (c>6 && c<=11)
						{
							System.out.println("You're average at this game.");
							System.out.println(" ");
						}
						if (c>12)
						{
							System.out.println("Take a break.");
						}
					}
						System.out.println("Press enter to continue");
						enter = guess.nextLine();
						System.out.println(" ");
				} while(X != g);
				break;
				case 3: // Quit
				System.out.println("Thank you for using this program.");
			default:
				System.out.println("Choice must be a value between 1 and 3.");
				System.out.println("Please enter to continue.");
				enter = guess.nextLine();
			}
		
		}while (input != 3);
		guess.close();
	}
	public static void cls() {
        for(int i=1;i<50;i=i+1)
        {
            System.out.println(" ");
        }
        }

}
