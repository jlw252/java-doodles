package jennyworld;
import java.util.Scanner;
public class MiddleCharacter {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int input = 0;
		int middle = 0; //middle character
		//int m1 = 0; //middle for even
		//int m2 = 0; //middle for even
		int flag = 0;
		String enter = "";
		String strvar = "";
		String mid = "";
		do
		{
			cls();
			System.out.println("Middle Character");
			System.out.println("by Jenny Wang");
			System.out.println(" ");
			System.out.println("Enter one of the following commands");
			System.out.println("1 -> Enter a String");
			System.out.println("2 -> Quit");
			System.out.println(" ");
			System.out.print("Enter your option: ");
			enter= in.nextLine();
			try 
			{
				input = Integer.parseInt(enter);
			}
			catch(Exception err)
			{
				input = 3;
			}
			System.out.println(" ");
			switch (input)
			{
			case 1:
				flag = 0;
				while (flag == 0)
				{
					cls();
					System.out.println("Enter a String");
					System.out.println("by Jenny Wang");
					System.out.println(" ");
					System.out.print("Enter a string to find its middle character: ");
					enter = in.nextLine();
					strvar = enter;
					System.out.println(" ");
					middle = strvar.length()/2;
					if (strvar.length()%2 == 1) //odds
					{
						System.out.println(strvar+" has a character length of "+strvar.length());
						System.out.println(strvar+"'s middle character is "+strvar.charAt(middle));
						System.out.println(" ");
					}
					else //evens (strvar.length()%2 ==0)
					{
						//m1 = strvar.length()/2 - 1;
						//m2 = strvar.length()/2;
						System.out.println(strvar+" has a character length of "+strvar.length());
						System.out.println(strvar+"'s middle characters are "+strvar.substring(middle-1,middle+1));
						System.out.println(" ");
					}
					System.out.print("Press enter to restart or / for menu: ");
					enter = in.nextLine();
					if(enter.equals("/"))
					{
						flag = 1;
						break;
					}
				} //case 1 while
			case 2:
				System.out.println("Thank you for using this program.");
				break;
			default:
				System.out.println("Choice must be a value between 1 and 2.");
				System.out.println("Please enter to continue.");
				enter = in.nextLine();
			}//switch
		} while (input != 2);
		in.close();
	}//void main
	public static void cls() 
	{
		for (int i=1; i<=50; i++)
		{
			System.out.println(" ");
		}
	}
}//Middle Character