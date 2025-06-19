package jennyworld;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Game {
	public static void main(String[] args) throws FileNotFoundException 
	{
		menu();
	}
	public static void menu() throws FileNotFoundException
	{
		Scanner in = new Scanner(System.in);
		String []t= new String [1001];
		int i = 0;
		int cnt = 0;
		int input = 0;
		boolean loop_read = true;
		boolean loop_main = true;
		String enter = "";
		do
		{
			cls();
			System.out.println("Text Adventures");
			System.out.println("by Jenny Wang");
			System.out.println(" ");
			System.out.println("1. About");
			System.out.println("2. Play the game ");
			System.out.println("3. Quit");
			System.out.println(" ");
			System.out.print("Enter you option: ");
			enter = in.nextLine();
			try
			{
				input = Integer.parseInt(enter);
			}
			catch(Exception err)
			{
				input = 4;
			}
			switch(input)
			{
			case 1:
				 cls();
				 File fin = new File("story.txt");
				 Scanner filein = new Scanner(fin);
				 cnt = 0;
				 loop_read = true;
				 cls();
				 do
				 {
					 try
					 {
						 cnt++;
						 t[cnt] = filein.nextLine();
					 }
					 catch(Exception err)
					 {
						 cnt--;
						 loop_read = false;
					 }
				 }while(loop_read != false);
				 filein.close();
				 for (i=1; i<=cnt; i++)
				 {
					 System.out.println(t[i]);
					 if (i/20 == i/20.0)
					 {
						 System.out.print("Press enter");
						 enter = in.nextLine();
						 cls();
					 }
				 }
				 System.out.println(" ");
				 System.out.print("Press enter to continue.");
				 enter = in.nextLine();
				 break;
			case 2:
				starting_room();
				break;
			case 3: 
				cls();
				System.out.println("Thank you for playing!");
				loop_main = false;
				in.close();
				System.exit(0);
				break;
			default:
				System.out.println("Choices must be a value between 1 and 3");
				System.out.println("Press enter to continue");
				enter = in.nextLine();
			}
		}while(loop_main);
	} //Menu
	public static void cls() //clearing the screen
	{
		for (int i=1; i<=50; i++)
		{
			System.out.println(" ");
		}
	}
	public static void starting_room() //starting room
	{
		Scanner start = new Scanner(System.in);
		int startinput = 0;
		String startenter = "";
		do
		{
			cls();
			System.out.println("Escape the Subjects");
			System.out.println("by Jenny Wang");
			System.out.println(" ");
			System.out.println("You are standing in the starting room.");
			System.out.println(" ");
			System.out.println("You see two doors in front of you. Each door leads to a different game.");
			System.out.println("Which door to do you choose 1 or 2?");
			System.out.println("Press '/' to return to menu.");
			System.out.println(" ");
			System.out.print("Your choice: ");
			startenter = start.nextLine();
			if(startenter.equals("/"))
			{
				try 
				{
					menu();
				} 
				catch (FileNotFoundException e) 
				{
					e.printStackTrace();
				}
			}
			try
			{
				startinput = Integer.parseInt(startenter);
			}
			catch(Exception err)
			{
				startinput = 3;
			}
			switch (startinput)
			{
				case 1: //left door
				{
					history();
					break;
				}
				case 2: //right door
				{
					music();
					break;
				}
				default:
					System.out.println(" ");
					System.out.println("You must choose 1 or 2.");
					System.out.println("Please enter to continue.");
					startenter = start.nextLine(); 
			}
		}while (startinput!=2);
		start.close();
	}//starting room
	public static void music()
	{
		Scanner music = new Scanner(System.in);
		String muscode = "";
		String musenter = "";
		int musinput = 0;
		int musflag = 0;
		do
		{
			cls();
			System.out.println("You have chosen the Music Room!");
			System.out.println("The room is filled with every instrument you could think of. Along with that notes are printed on the board.");
			System.out.println(" ");
			System.out.println("Do you ... ");
			System.out.println("1. Look at the instruments");
			System.out.println("2. Look at the board");
			System.out.println("3. Enter the code to escape this room");
			System.out.println(" ");
			System.out.print("Your choice: ");
			musenter = music.nextLine();
			try
			{
				musinput = Integer.parseInt(musenter);
			}
			catch(Exception err)
			{
				musinput = 4;
			}
			System.out.println(" ");
			switch(musinput)
			{
				case 1: //looking at instruments
				{
					musflag = 0;
					while (musflag == 0)
					{
						cls();
						System.out.println("You see a harp and cello in the right corner.");
						System.out.println("In the left corner you see a flute and guitar.");
						System.out.println("An alto saxophone hangs from the ceiling.");
						System.out.println(" ");
						System.out.print("Press enter to return back to the room to search for clues.");
						musenter = music.nextLine();
						musflag = 1;
					} //while
				}break; //case 1 music
				case 2: //looking at board
				{
					musflag = 0;
					while (musflag == 0)
					{
						cls();
						System.out.println("_____________________________________________");
						System.out.println("                                    O    ");
						System.out.println("_____________________________________________");
						System.out.println("                            O");
						System.out.println("_____________________________________________");
						System.out.println("                   O");
						System.out.println("_____________________________________________");
						System.out.println("          O");
						System.out.println("_____________________________________________");
						System.out.println(" ");
						System.out.print("Press enter to return back to the room to search for clues.");
						musenter = music.nextLine();
						musflag = 1;
					} //while
				 }break;//case 2 music
				case 3: //entering code 
				{
					musflag = 0;
					while (musflag == 0)
					{
						cls();
						System.out.print("Enter the code or '/' to keep search for clues: ");
						muscode = music.nextLine();
						if(muscode.equals("/"))
						{
							music();
							musflag = 1; 
							break;		
						}
						if (muscode.equals("FACE") || muscode.equals("face")|| muscode.equals("Face"))
						{
							System.out.println(" ");
							System.out.println("Congratulations! You got the code right!");
							System.out.print("Press enter to move on: ");
							musenter = music.nextLine();
							computer();
						}
						else 
						{
							System.out.println(" ");
							System.out.println("Wrong code");
							System.out.print("Press enter to try again.");
							musenter = music.nextLine();
						}
					} //while
				}break; //case 3 music
				default:
					System.out.println("Choices must be a value between 1 and 3");
					System.out.println("Press enter to continue");
					musenter = music.nextLine();
			}//switch music	
		}while (musinput!=3);
		music.close();
	}//music
	public static void computer() 
	{
		Scanner computer = new Scanner(System.in);
		int cominput = 0;
		String comenter = "";
		int comflag = 0;
		String comcode  = "";
		do
		{
			cls();
			System.out.println("You are now standing in the computer room!");
			System.out.println("The room is filled with different types of computers. However, you notice one directly in the center.");
			System.out.println(" ");
			System.out.println("Do you ... ");
			System.out.println("1. Look at the screen");
			System.out.println("2. Look at the keyboard");
			System.out.println("3. Enter the code to escape this room");
			System.out.println(" ");
			System.out.print("Your choice: ");
			comenter = computer.nextLine();
			try
			{
				cominput = Integer.parseInt(comenter);
			}
			catch(Exception err)
			{
				cominput = 4;
			}
			System.out.println(" ");
			switch(cominput)
			{
			case 1: //looking at screen
			{
				comflag = 0;
				while (comflag == 0)
				{
					cls();
					System.out.println("   ________________________________________");
					System.out.println("  |          New York Times Wordle         |");
					System.out.println("  |                                        |");
					System.out.println("  |              _  _  _  _  _             |");
					System.out.println("  |              _  _  _  _  _             |");
					System.out.println("  |              _  _  _  _  _             |");
					System.out.println("  |              _  _  _  _  _             |");
					System.out.println("  |              _  _  _  _  _             |");
					System.out.println("  |              _  _  _  _  _             |");
					System.out.println("  |              _  _  _  _  _             |");
					System.out.println("   ________________________________________");
					System.out.println(" ");
					System.out.println(" ");
					System.out.print("Press enter to return back to the room to search for clues. ");
					comenter = computer.nextLine();
					comflag = 1;
				}//while
			}break; //case 1 computer
			case 2: //looking at keyboard
			{
				comflag = 0;
				while(comflag == 0)
				{
				cls();
				System.out.println("  1 2 3 4 5 6 7 8 9 0");
				System.out.println("  Q W E R _ Y U I _ P");
				System.out.println("   A _ D F G H J K _ ;");
				System.out.println("    Z X C V _ N M");
				System.out.println(" ");
				System.out.println(" ");
				System.out.print("Press enter to return back to the room to serach for clues. ");
				comenter = computer.nextLine();
				comflag = 1;
				}
			}break; //case 2 computer
			case 3: //entering code
			{
				comflag = 0;
				while (comflag == 0)
				{
					cls();
					System.out.print("Enter the code or '/' to keep search for clues: ");
					comcode = computer.nextLine();
					if(comcode.equals("/"))
					{
						computer();
						comflag = 1; 
						break;
					}
					if (comcode.equals("Bolts") || comcode.equals("bolts")|| comcode.equals("BOLTS"))
					{
						System.out.println(" ");
						System.out.println("Congratulations! You got the code right!");
						System.out.print("Press enter to move on: ");
						comenter = computer.nextLine();
						escape();
					}
					else 
					{
						System.out.println(" ");
						System.out.println("Wrong code");
						System.out.print("Press enter to try again.");
						comenter = computer.nextLine();
					}
				} //while
			}break; //case 3 computer
			default:
				System.out.println("Choices must be a value between 1 and 3");
				System.out.println("Press enter to continue");
				comenter = computer.nextLine();
			}//switch computer
		} while (cominput!= 3);
		computer.close();
	}//computer
	public static void history() 
	{
		Scanner history = new Scanner(System.in);
		String hisenter = "";
		String hiscode = "";
		int hisinput = 0;
		int hisflag = 0;
		do
		{
			cls();
			System.out.println("You have chosen the history room!");
			System.out.println("A world map surrounds the whole room, there is also a suitcase in the room with a list of destinations to visit.");
			System.out.println("Looks like someone is going on vacation.");
			System.out.println(" ");
			System.out.println("Do you ... ");
			System.out.println("1. Look at the walls");
			System.out.println("2. Look at the suitcase");
			System.out.println("3. Look at the list of destinations");
			System.out.println("4. Enter the code to escape this room");
			System.out.println(" ");
			System.out.print("Your choice: ");
			hisenter = history.nextLine();
			try
			{
				hisinput = Integer.parseInt(hisenter);
			}
			catch(Exception err)
			{
				hisinput = 5;
			}
			System.out.println(" ");
			switch(hisinput)
			{
			case 1: //looking at walls
			{
				hisflag = 0;
				while (hisflag == 0)
				{
					cls();
					System.out.println(" ");
					System.out.println("https://www.mapsofworld.com/maps/world-political-maps.jpg");
					System.out.println(" ");
					System.out.println(" ");
					System.out.print("Press enter to return back to the room to search for clues. ");
					hisenter = history.nextLine();
					hisflag = 1;
				}//while
			}break; //case 1 history
			case 2: //looking at suitcase
			{
				hisflag = 0;
				while(hisflag == 0) 
				{
					cls();
					System.out.println(" ");
					System.out.println("The suitcase contains 2 tshirts, 4 pairs of pants, 3 underwears, and 1 hat.");
					System.out.println("The suitcase also contains a toothbrush and toothpaste.");
					System.out.println(" ");
					System.out.print("Press enter to return back to the room to search for clues. ");
					hisenter = history.nextLine();
					hisflag = 1;
				}//while
			}break; //case 2 history
			case 3: //list of destinations
			{
				hisflag = 0;
				while(hisflag == 0) 
				{
					cls();
					System.out.println("Vacation Plans");
					System.out.println(" ");
					System.out.println("Europe Trip:"); //2
					System.out.println("Germany -> Poland -> Austria -> Hungary");
					System.out.println(" ");
					System.out.println("Africa Trip:"); //2
					System.out.println("Niger -> Libya -> Sudan -> Cameroon -> Ethiopia");
					System.out.println(" ");
					System.out.println("Asia Trip:"); //1
					System.out.println("Russa -> Mongolia -> China ");
					System.out.println(" ");
					System.out.println("South America Trip:"); //7
					System.out.println("Ecuador -> Brazil -> Argentina");
					System.out.println(" ");
					System.out.println(" ");
					System.out.print("Press enter to return back to the room to search for clues. ");
					hisenter = history.nextLine();
					hisflag = 1;
				}//while
			}break; //case 3 history
			case 4: //entering code
			{
				hisflag = 0;
				while (hisflag == 0)
				{
					cls();
					System.out.print("Enter the code or '/' to keep search for clues: ");
					hiscode = history.nextLine();
					if(hiscode.equals("/"))
					{
						history();
						hisflag = 1; 
						break;
					}
					if (hiscode.equals("2217") || hiscode.equals("2 2 1 7"))
					{
						System.out.println(" ");
						System.out.println("Congratulations! You got the code right!");
						System.out.print("Press enter to move on: ");
						hisenter = history.nextLine();
						math();
					}
					else 
					{
						System.out.println(" ");
						System.out.println("Wrong code");
						System.out.print("Press enter to try again.");
						hisenter = history.nextLine();
					}
				}//while 
			}break; //history case 4
			default:
				System.out.println("Choices must be a value between 1 and 4");
				System.out.println("Press enter to continue");
				hisenter = history.nextLine();
			}//swtich history
		} while(hisinput!=4);
		history.close();
	}//history
	public static void math() 
	{
		Scanner math = new Scanner(System.in);
		String mathenter = "";
		int mathflag = 0;
		int mathinput = 0;
		String mathcode = "";
		do
		{
			cls();
			System.out.println("You are standing in the math room!");
			System.out.println("The room looks like math classroom; desks are everywhere.");
			System.out.println(" ");
			System.out.println("Do you ... ");
			System.out.println("1. Look at the desks");
			System.out.println("2. Look at the board");
			System.out.println("3. Enter the code to escape this room");
			System.out.println(" ");
			System.out.print("Your choice: ");
			mathenter = math.nextLine();
			try
			{
				mathinput = Integer.parseInt(mathenter);
			}
			catch(Exception err)
			{
				mathinput = 4;
			}
			System.out.println(" ");
			switch(mathinput)
			{
			case 1: //looking at desk
			{
				mathflag = 0;
				while(mathflag == 0)
				{
				cls();
				System.out.println("Each of the desks have 1 TI-84 Calculator, 1 ruler, 2 pieces of graph paper, and 3 circles.");
				System.out.println("It looks like the students were doing geometry!");
				System.out.println(" ");
				System.out.print("Press enter to return back to the room to serach for clues. ");
				mathenter = math.nextLine();
				mathflag = 1;
				break;
				}//while
			}break; //case 1 math
			case 2: //looking at board
			{
				mathflag = 0;
				while(mathflag == 0)
				{
				cls();
				System.out.println(" _______________________________________");
				System.out.println("|                                       |");
				System.out.println("|                                       |");
				System.out.println("|     0  1  1  2  3  X  8  13  Y  Z     |");
				System.out.println("|                                       |");
				System.out.println("|                                       |");
				System.out.println(" _______________________________________");
				System.out.println(" ");
				System.out.println(" ");
				System.out.print("Press enter to return back to the room to serach for clues. ");
				mathenter = math.nextLine();
				mathflag = 1;
				}//while
			}break; //case 2 math
			case 3: // entering code
			{
				mathflag = 0;
				while (mathflag == 0)
				{
					cls();
					System.out.print("Enter the code or '/' to keep search for clues: ");
					mathcode = math.nextLine();
					if(mathcode.equals("/"))
					{
						math();
						mathflag = 1; 
						break;
					}
					if (mathcode.equals("52134") || mathcode.equals("5 21 34")|| mathcode.equals("5 2 1 3 4"))
					{
						System.out.println(" ");
						System.out.println("Congratulations! You got the code right!");
						System.out.print("Press enter to move on: ");
						mathenter = math.nextLine();
						lit();
					}
					else 
					{
						System.out.println(" ");
						System.out.println("Wrong code");
						System.out.print("Press enter to try again.");
						mathenter = math.nextLine();
					}
				}//while 			
			}break; //case 3 math
			default:
				System.out.println("Choices must be a value between 1 and 3");
				System.out.println("Press enter to continue");
				mathenter = math.nextLine();
			}//switch math
		}while(mathinput!=3);
		math.close();
	}//math
	public static void lit() 
	{
		Scanner lit = new Scanner(System.in);
		String litenter = "";
		String litcode = "";
		int litflag = 0;
		int litinput = 0;
		do
		{
			cls();
			System.out.println("You are standing in the literature room!");
			System.out.println("The walls of the room looks are covered in poems");
			System.out.println(" ");
			System.out.println("Do you ... ");
			System.out.println("1. Look at the walls");
			System.out.println("2. Enter the code to escape this room");
			System.out.println(" ");
			System.out.print("Your choice: ");
			litenter = lit.nextLine();
			try
			{
				litinput = Integer.parseInt(litenter);
			}
			catch(Exception err)
			{
				litinput = 3;
			}
			System.out.println(" ");
			switch(litinput)
			{
			case 1: //looking at wall
			{
				litflag = 0;
				while(litflag == 0)
				{
				cls();
				System.out.println("An old silent pond");
				System.out.println("A frog jumps into the pond - ");
				System.out.println("Splash! Silence again.");
				System.out.println(" ");
				System.out.printf("%20s\n", "A world of dew,"); 
				System.out.printf("%30s\n","And within every dewdrop");
				System.out.printf("%30s\n", "A world of struggle.");
				System.out.println(" ");
				System.out.println("I write, erase, rewrite");
				System.out.println("Erae again, and then ");
				System.out.println("A poppy blooms.");
				System.out.println(" ");
				System.out.print("Press enter to return back to the room to serach for clues. ");
				litenter = lit.nextLine();
				litflag = 1;
				break;
				}//while
			}break; //case 1 lit
			case 2: // entering code
			{
				litflag = 0;
				while (litflag == 0)
				{
					cls();
					System.out.print("Enter the code or '/' to keep search for clues: ");
					litcode = lit.nextLine();
					if(litcode.equals("/"))
					{
						lit();
						litflag = 1; 
						break;
					}
					if (litcode.equals("575") || litcode.equals("5 7 5"))
					{	
						System.out.println(" ");
						System.out.println("Congratulations! You got the code right!");
						System.out.print("Press enter to move on: ");
						litenter = lit.nextLine();
						science();
					}
					else 
					{
						System.out.println(" ");
						System.out.println("Wrong code");
						System.out.print("Press enter to try again.");
						litenter = lit.nextLine();
					}
				}//while 			
			}break; //case 2 lit
			default:
				System.out.println("Choices must be a value of 1 or 2");
				System.out.println("Press enter to continue");
				litenter = lit.nextLine();
			}//switch lit
		}while(litinput!=2);
		lit.close();
	}//lit
	public static void science() 
	{
		Scanner science = new Scanner(System.in);
		String scienter = "";
		String scicode = "";
		int sciinput = 0;
		int sciflag = 0;
		do
		{
			cls();
			System.out.println("You are now standing in the science room!");
			System.out.println("The walls are covered in a huge periodic table of elements. There is also a science experiment going on.");
			System.out.println(" ");
			System.out.println("Do you ... ");
			System.out.println("1. Look at the walls");
			System.out.println("2. Look at the experiment");
			System.out.println("3. Enter the code to escape this room");
			System.out.println(" ");
			System.out.print("Your choice: ");
			scienter = science.nextLine();
			try
			{
				sciinput = Integer.parseInt(scienter);
			}
			catch(Exception err)
			{
				sciinput = 4;
			}
			System.out.println(" ");
			switch(sciinput)
			{
			case 1: //looking at periodic table
			{
				sciflag = 0;
				while (sciflag == 0)
				{
					cls();
					System.out.println("H                                                                   He");
					System.out.println("Li  Be                                          B   C   N   O   F   Ne");
					System.out.println("Na  Mg                                          Al  Si  P   S   Cl  Ar");
					System.out.println("K   Ca  Sc  Ti  V   Cr  Mn  Fe  Co  Ni  Cu  Zn  Ga  Ge  As  Se  Br  Kr");
					System.out.println("Rb  Sr  Y   Zr  Nb  Mo  Tc  Ru  Rh  Pd  Ag  Cd  In  Sn  Sb  Te  I   Xe");
					System.out.println("Cs  Ba  La| Hf  Ta  W   Re  Os  Ir  Pt  Au  Hg  Tl  Pb  Bi  Po  At  Rn");
					System.out.println("Fr  Ra  Ac| Rf  Db  Sg  Bh  Hs  Mt  Ds  Rg  Cn  Nh  Fl  Mc  Lv  Ts  Og");
					System.out.println("          |");
					System.out.println("          | Ce  Pr  Nd  Pm  Sm  Eu  Gd  Tb  Dy  Ho  Er  Tm  Yb  Lu");
					System.out.println("          | Th  Pa  U   Np  Pu  Am  Cm  Bk  Cf  Es  Fm  Md  No  Lr");
					System.out.println(" ");
					System.out.println(" ");
					System.out.print("Press enter to return back to the room to search for clues. ");
					scienter = science.nextLine();
					sciflag = 1;
				}//while
			}break; //case 1 science
			case 2: //experiment
			{
				sciflag = 0;
				while(sciflag == 0)
				{
				cls();
				System.out.println("It looks like an experiment was also taking place as there was slime reacting with some");
				System.out.println("shiny metal that weighs 88.90 grams. The slime was also reacting to a Chalcogen Metalloid.");
				System.out.println(" ");
				System.out.print("Press enter to return back to the room to serach for clues. ");
				scienter = science.nextLine();
				sciflag = 1;
				}
			}break; //case 2 science
			case 3: //entering code
			{
				sciflag = 0;
				while (sciflag == 0)
				{
					cls();
					System.out.print("Enter the code or '/' to keep search for clues: ");
					scicode = science.nextLine();
					if(scicode.equals("/"))
					{
						science();
						sciflag = 1; 
						break;
					}
					if (scicode.equals("Byte") || scicode.equals("byte")|| scicode.equals("BYTE"))
					{
						System.out.println(" ");
						System.out.println("Congratulations! You got the code right!");
						System.out.print("Press enter to move on: ");
						scienter = science.nextLine();
						escape();
					}
					else 
					{
						System.out.println(" ");
						System.out.println("Wrong code");
						System.out.print("Press enter to try again.");
						scienter = science.nextLine();
					}
				} //while
			}break; //case 3 science
			default:
				System.out.println("Choices must be a value between 1 and 3");
				System.out.println("Press enter to continue");
				scienter = science.nextLine();
			}//switch
		} while (sciinput!= 3);
		science.close();
	}//science
	public static void escape() 
	{
		Scanner escape = new Scanner(System.in);
		String escenter = "";
		int escflag = 0;
		while (escflag == 0)
		{
			cls();
			System.out.println("You completed the game! Congratulations!");
			System.out.println(" ");
			System.out.print("Press enter to return to the main menu.");
			escenter = escape.nextLine();
			escflag = 1;
			try
			{
				menu();
			} 
			catch (FileNotFoundException e) 
			{
				e.printStackTrace();
			}
			break;
		}
		escape.close();
	}//escape
} //Game