package jennyworld;
import java.io.*;
import java.util.Scanner;
public class Treasure {
	public static void main(String[] args) throws FileNotFoundException{
		Scanner in = new Scanner(System.in);
		int cnt = 0;
		int i = 0;
		int j = 0;
		int k = 0;
		double r = 0;
		int x = 0;
		int W = 0;
		int L = 0;
		int input = 0;
		int flag = 0;
		int flagp = 0;
		int flags = 0;
		int col = 0; //column
		int start = 0;
		int end = 0;
		String enter = "";
		// array size = [1001][7]
		String [][] T = new String [1001][10]; 
		String [] d = new String [1001];
		int [] n = new int [12];// hold the number 
		int [] ns = new int [6]; //dummy array to sort for game card selection
		int [] hm = new int [12]; //the number of times the number has been selected
		int [] num_cnt = new int [31]; //counts the numbers up
		do
		{
			cls();
			System.out.println("Treasure Hunt Lottery Program");
			System.out.println("by Jenny Wang");
			System.out.println(" ");
			System.out.println("Enter one of the following commands");
			System.out.println("1. Add Numbers");
			System.out.println("2. Edit Numbers");
			System.out.println("3. Delete Numbers");
			System.out.println("4. Display Numbers");
			System.out.println("5. Generate Game Cards");
			System.out.println("6. Save Numbers");
			System.out.println("7. Load Numbers");
			System.out.println("8. Quit");
			System.out.println(" ");
			System.out.print("Enter your option: ");
			try 
			{
				input = in.nextInt();
				in.nextLine();	
			}
			catch(Exception err)
			{
				System.out.println("Invalid Input");
				in.nextLine();
			}
			System.out.println(" ");
			switch (input)
			{
				case 1: //Add Numbers
					flag = 0;
					while (flag == 0)
					{
						cls();
						System.out.println("Add Numbers");
						System.out.println("by Jenny Wang");
						System.out.println(" ");
						System.out.println("Currently you have "+cnt+" numbers entered");
						System.out.println("The date of the last game entered was: "+T[cnt][0]);
						System.out.println(" ");
						System.out.print("Enter the date (in MM/DD/YYYY form) or / for the menu: ");
						enter = in.nextLine();
						if(enter.equals("/"))
						{
							flag = 1; 
							break;
						}
						d[0]=enter;
						for (i=1; i<=5; i++)
						{
							System.out.println(" ");
							System.out.print("Enter the "+i+" winning number for "+d[0]+": ");
							enter = in.nextLine();
							if(enter.equals("/"))
							{
								flag = 1;
								break;
							}
							try
							{
								x = Integer.parseInt(enter);
							}
							catch (Exception err)
							{
								System.out.println("You entered an invalid option. Press enter to retry or / for the menu.");
								enter = in.nextLine();
								i=i-1;
								if (enter.equals("/"))
								{
									flag = 1;
									break;
								}
							}
							d[i]=enter;
						//checking for a repeating number
						//simple search
							for (j=1; j<i; j++)
							{
								if (d[i].equals(d[j]))
								{
									System.out.println("I am sorry, but that number has already been entered. Please enter to retry or / for the menu.");
									enter = in.nextLine();
									i=i-1;
									if (enter.equals("/"))
									{
										flag = 1;
										break;
									}
								}
							}
						}
						// sorting
						for (i=1; i<=5; i++)
						{
							ns[i] = Integer.parseInt(d[i]);
						}
						j=1;
						do 
						{
							flag = 0;
							for (i=4; i>=j; i=i-1)
							{
								if (ns[i]>ns[i+1])
								{
									ns[0] = ns[i];
									ns[i] = ns[i+1];
									ns[i+1] = ns[0];
									flag = i;
								}
							}
							j=flag;
						} while(flag!=0);
						for (i=1; i<=5; i++)
						{
							d[i] = Integer.toString(ns[i]);
						}
						cnt=cnt+1;
						T[cnt][0] = d[0];
						T[cnt][1] = d[1];	
						T[cnt][2] = d[2];
						T[cnt][3] = d[3]; 
						T[cnt][4] = d[4];
						T[cnt][5] = d[5];
						} break;
				case 2: //Edit
					flag=0;
					while(flag==0)
					{						
						cls();
						System.out.println("Edit/Update Teams");
						System.out.println("by Jenny Wang");
						System.out.println(" ");
						if (cnt == 0)
						{
							System.out.println("No numbers have been entered.");
							System.out.println(" ");
							System.out.print("Press enter to return to the menu.");
							enter = in.nextLine();
							break;
						}
						System.out.print("Enter a part or all of the date you wish to edit, '/' for the menu: ");
						enter = in.nextLine();
						if(enter.equals("/"))
							{
							flag = 1; 
							break;
							}
						flagp = 0;
						for (i=1; i<=cnt; i++)
						{
							if(T[i][1].contains(enter))
							{
								System.out.println(i+ ") "+T[i][0]);
								System.out.println(" ");
								System.out.print("Is this the correct date to edit? ");
								d[0]=in.nextLine();
								if (d[0].equals("yes")||d[0].equals("Yes")||d[0].equals("y")||d[0].equals("Y"))
								{
									flagp = i;
									i=cnt;
								}
							}
						}// end of search for the date. for loop
							if (flagp == 0)
							{
								System.out.println("No item found to edit, press enter to continue.");
								d[0] = in.nextLine();
							}
							j=flagp;
							if (j>=1 && j<=cnt)
							{
								System.out.println("The current values are");
								System.out.printf("%10s", "Date");
					        	for (i = 1; i<=5; i++)
								{
					        		System.out.printf("%10s", "Number"+i);
								}
				        		System.out.println(" ");
					        	for (i=1; i<=6; i++)
								{
					        		System.out.printf("%10s", T[j][i]);
								}
					        	System.out.println(" ");
								System.out.print("Press enter to accept the value or enter the corrected value for the date. ");
								System.out.println(T[j][1]);
								enter = in.nextLine();
								if (enter.equals(""))
									{
									T[j][1] = T[j][1];
									}
								else
								{
									T[j][1] = enter;
								}
								//begins the edit of the numbers
								d[0] = T[j][1];
								for(i=1; i<=5; i++)
								{
									d[i]=T[j][i+1];
								}
								System.out.print("Press enter to accept the value or enter the corrected value. ");
								for(i=1; i<=5; i++)
								{
									System.out.println(" ");
									if (i == 1)
									{
										System.out.println("1st winning number for " + d[0]);
									}
									if (i == 2)
									{
										System.out.println("2nd winning number for " + d[0]);
									}
									if (i == 3)
									{
										System.out.println("3rd winning number for " + d[0]);
									}
									if (i > 3)
									{
										System.out.println(i+"th winning number for " + d[0]);
									}
									System.out.print("The current value is: ");
									System.out.println(T[j][i+1]);
									enter = in.nextLine();
									d[i] = enter;
									try 
									{
										input = Integer.parseInt(enter);
									}
									catch (Exception err)
									{
										d[i] = T[j][i+1];
									}
									//Checking for repeating number
									//Simple search
									for (k=1; k<=5; k++)
									{
										if (d[i].equals(d[k]) && k != i)
										{
											System.out.print("I am sorry, but that number is already in this group. Please try again. ");
											enter = in.nextLine();
											i=i-1;
											k=5;
										}
									}
								} //end of entering the numbers. for loop
								// Reverse Bubble Sort
								for(i=1; i<=5; i++)
								{
									ns[i]=Integer.parseInt(d[i]);
								}
								j=1;
								do 
								{
									flags = 0;
									for (i=4; i>=j; i=i-1)
									{
										if(ns[i]>ns[i+1])
										{
											ns[0] = ns[i];
											ns[i] = ns[i+1];
											ns[i+1] = ns[0];
											flags = i;
										}
									}
									j=flags;
								}while (flags!=0);
								//end of sort						
								//puts sorted array back to the string array
								for(i=1; i<=5; i++)
								{
									d[i] = Integer.toString(ns[i]);
								}		
								for(col = 1; col <= 6; col++)
								{
									T[flagp][col]=d[col-1];
								}
							}
						}while (flag == 0);
						break;
				case 3: //Delete number by data
				flag = 0;
				do
				{
					cls();
					System.out.println("Delete Number");
					System.out.println("by Jenny Wang");
					System.out.println(" ");
					System.out.print("Enter a part or all of the date you wish to delete, '/' for the menu: ");
					enter = in.nextLine();
					if (enter.equals("/"))
					{
						flag = 1;
						break;
					}
					flagp = 0;
					for(i=1; i<=cnt; i++)
					{
						if(T[i][0].contains(enter))
						{
							System.out.println(i+ ") "+T[i][0]);
							System.out.println(" ");
							System.out.print("Is this the correct date to delete? ");
							d[0]=in.nextLine();
							if (d[0].equals("yes")||d[0].equals("Yes"))
							{
								flagp = i;
								i=cnt;
							}
						}
					}
					//flagp is now the tow number to be deleted
					if (flagp == 0);
					{
						System.out.println("No item found to delete. Press enter to continue.");
						d[0] = in.nextLine();
					}
					j=flagp;
					if(j>=1 && j<=cnt)
					{
						for(i=j; i<=cnt; i++);
						{
							for (k=1; k<=6; k++)
							{
								T[i][k]=T[i+1][k];
							}
						}
						cnt=cnt-1;
					}
				}while(flag == 0);
				break;
				case 4: //Display
				cls();
				System.out.println("View Numbers by date");
				System.out.println("by Jenny Wang");
				System.out.println(" ");
				if (cnt == 0)
				{
					System.out.println("No numbers have been enter yet.");
					System.out.println(" ");
					System.out.print("Press enter to return to the menu.");
					enter = in.nextLine();
					break;
				}
				System.out.println(" ");
				System.out.printf("%10s %10s %5s %5s %5s %5s" , "Date", "1st", "2nd", "3rd", "4th", "5th");
				System.out.println(" ");
				for (i=1; i<=cnt; i++)
				{
					System.out.printf("%10s %10s %5s %5s %5s %5s\n",T[i][0], T[i][1], T[i][2], T[i][3], T[i][4], T[i][5]);
					// = Interger.parseInt(str. var));
					// = Interger.toString((num var));
					//System.out.printf("%20s %5s %5s %5s %5s\n",T[i][1],T[i][2],T[i][3],T[i][4],T[i][5]);
					//System.out.println(" ");
					if (i/10 == i/10.0)
					{
						System.out.print("Press enter to see the next 10 or / for menu: ");
						System.out.print(" ");
						enter = in.nextLine();
						if (enter.equals("/"))
						{
							break;
						}
					}
				}
				System.out.println("Press enter to return to the menu");
				enter = in.nextLine();
				break;
				case 5: //Generate Game Cards
					flag = 0;
					do
					{
						cls();
						System.out.println("Generate Game Cards");
						System.out.println("by Jenny Wang");
						System.out.println(" ");
						System.out.println("Enter one of the following commands from the submenu.");
						System.out.println("1. Random Number Selection");
						System.out.println("2. Hot Number Selection");
						System.out.println("3. Cold Number Selection");
						System.out.println("4. Return to Main Menu");
						System.out.println(" ");
						System.out.print("Enter your option: ");
						try 
						{
							input = in.nextInt();
							in.nextLine();	
						}
						catch(Exception err)
						{
							System.out.println("Invalid Input");
							in.nextLine();
						}
						System.out.println(" ");
						switch (input)
						{
						case 1: //Random Number Selection
							flag = 0;
							while (flag == 0)
								{
								cls();
								for (i=0; i<=11; i++)
								{
									n[0] = 0;
								}
								System.out.println("Random Number Selection");
								System.out.println("by Jenny Wang");
								System.out.println(" ");
								for (i=1; i<=11; i++)
								{
									r = Math.random();
									n[0] = (int)(r*30+1);
									flag = 0;
									for (j=1; j<i; j++)
									{
										if (n[j]==n[0])
										{
											j=i;
											i=i-1;
											flag=1;
										}
									}
									if (flag == 0)
									{
										n[i] = n[0];
									}	
								}
								System.out.println("Here are the 11 numbers that I think you should play");
								System.out.print("  ");
								for (i=1; i<=11; i++)
								{
									System.out.printf("%10s", "Num "+i);
								}	
								System.out.println(" ");
								for (i=1; i<=11; i++)
								{
									System.out.printf("%10d", n[i]);
								}
								System.out.println(" ");
								System.out.println(" ");
								//Generating the cards ... easy
								System.out.println("A Simple Display - not in order");
								System.out.println("Game 1: " + n[1] + ", " + n[2] + ", " + n[3] + ", " + n[10] + ", " + n[11]);
								System.out.println("Game 2: " + n[4] + ", " + n[5] + ", " + n[6] + ", " + n[10] + ", " + n[11]);
								System.out.println("Game 3: " + n[7] + ", " + n[8] + ", " + n[9] + ", " + n[10] + ", " + n[11]);
								System.out.println();
								//End of easy display of cards
								//Interesting game card selection and display (in order)
								System.out.println("Interesting Method - display in order");
								for (k=1; k<=3; k++)
								{
									ns[4]=n[10];
									ns[5]=n[11];
									for(L=1;L<=3;L++)
									{
										ns[L] = n[(3*k -2) + (L-1)];
									}
									//begin sort
									j=1;
									do 
									{
										flag = 0;
										for (i = 4; i>=j; i=i-1)
										{
											if(ns[i]>ns[i+1])
											{
												ns[0] = ns[i];
												ns[i] = ns[i+1];
												ns[i+1] = ns[0];
												flag = i;
											}
										}	
										j=flag;
									} while (flag!=0);
									//end of sort
									//display game cards
									System.out.println("Game " + k + ": " + ns[1] + ", " + ns[2] + ", " + ns[3] + ", " + ns[4] + ", " + ns[5]);
								}
								System.out.println(" ");
								System.out.print("Press enter to return the submenu: ");
								enter = in.nextLine();
								break;
								} //while case 1
							break; // end of case 1
						case 2: //Hot Number Selection
							flag = 0;
							while (flag == 0)
							{
								cls();
								System.out.println("Hot Number Selection");
								System.out.println("by Jenny Wang");
								System.out.println(" ");
								for (i=0; i<=11; i++)
								{
									n[i] = 0;
									hm[i] = 0;
								}
								for (i=1; i<=30; i++)
								{
									num_cnt[i] = 0;
								}
								if (cnt <= 10)
								{
									System.out.println("You should enter more data or try the Random Number Card Generator.");
									System.out.print("Press enter to return to the submenu.");
									enter = in.nextLine();
									break;
								}
								end = cnt; //select the last drawing to look at
								start = 1; //select the first drawing to look at
								for (i = start; i<=end; i++)
								{
									for(col=1; col<=5; col++)
									{
										W = Integer.parseInt(T[i][col]);
										num_cnt[W]++;
									}
								}
								for(i=1; i<=30; i++) //insertion sort
								{
									for(j=1; j<=11; j++)
									{
										if(num_cnt[i]>hm[j])
										{
											for(k=10; k>=j; k=k-1)
											{
												hm[k+1]=hm[k];
												n[k+1]=n[k];
											}
											hm[j]=num_cnt[i];
											n[j]=i;
											j=11;
										}
									}
								}
								System.out.println("Here are the 11 hot numbers that I think you should play.");
								System.out.println(" ");
								for (i=1; i<=11; i++)
								{
									System.out.printf("%10s", "Num "+i);
								}
								System.out.println(" ");
								for(i=1; i<=11; i++)
								{
									System.out.printf("%10d", n[i]);
								}
								System.out.println(" ");
								for(i=1;  i<=11; i++)
								{
									System.out.printf("%10d", hm[i]);
								}
								System.out.println(" ");
								//Generating the cards
								System.out.println("Game 1: "+n[1]+", "+n[2]+", "+n[3]+", "+n[10]+", "+n[11]);
								System.out.println("Game 2: "+n[4]+", "+n[5]+", "+n[6]+", "+n[10]+", "+n[11]);
								System.out.println("Game 3: "+n[7]+", "+n[8]+", "+n[9]+", "+n[10]+", "+n[11]);
								System.out.println(" ");
								System.out.print("Press enter to return the submenu: ");
								enter = in.nextLine();
								break;
							} //while case 2
							break;
						case 3: //Cold Number Selection
							flag = 0;
							while (flag == 0)
							{
								cls();
								System.out.println("Cold Number Selection");
								System.out.println("by Jenny Wang");
								System.out.println(" ");
								for (i=0; i<=11; i++)
								{
									n[i] = 0;
									hm[i] = 10;
								}
								for (i=1; i<=30; i++)
								{
									num_cnt[i] = 0;
								}
								if (cnt <= 10)
								{
									System.out.println("You should enter more data or try the Random Number Card Generator.");
									System.out.print("Press enter to return to the submenu.");
									enter = in.nextLine();
									break;
								}
								end = cnt; //select the last drawing to look at
								start = 1; //select the first drawing to look at
								 for (i = start; i<=end; i++)
								{
									for(col=1; col<=5; col++)
									{
										W = Integer.parseInt(T[i][col]);
										num_cnt[W]++;
									}
								}
								for(i=1; i<=30; i++) //insertion sort
								{
									for(j=1; j<=11; j++)
									{
										if(num_cnt[i]<hm[j])
										{
											for(k=10; k>=j; k=k-1)
											{
												hm[k+1]=hm[k];
												n[k+1]=n[k];
											}
											hm[j]=num_cnt[i];
											n[j]=i;
											j=11;
										}
									}
								}
								System.out.println("Here are the 11 cold numbers that I think you should play.");
								System.out.println(" ");
								for (i=1; i<=11; i++)
								{
									System.out.printf("%10s", "Num "+i);
								}
								System.out.println(" ");
								for(i=1; i<=11; i++)
								{
									System.out.printf("%10d", n[i]);
								}
								System.out.println(" ");
								for(i=1;  i<=11; i++)
								{
									System.out.printf("%10d", hm[i]);
								}
								System.out.println(" ");
								//Generating the cards
								System.out.println("Game 1: "+n[1]+", "+n[2]+", "+n[3]+", "+n[10]+", "+n[11]);
								System.out.println("Game 2: "+n[4]+", "+n[5]+", "+n[6]+", "+n[10]+", "+n[11]);
								System.out.println("Game 3: "+n[7]+", "+n[8]+", "+n[9]+", "+n[10]+", "+n[11]);
								System.out.println(" ");
								System.out.print("Press enter to return the submenu: ");
								enter = in.nextLine();
								break;
							} //while case 3
							break;
						case 4: //Return to Main Menu
							cls();
							System.out.println("Return to Main Menu");
							System.out.println("by Jenny Wang");
							System.out.println(" ");
							System.out.println("Press enter to return to the Main Menu.");
							enter = in.nextLine();	
							flag = 1;
							break;
						default:
							System.out.println("Choice must be a value between 1 and 4.");
							System.out.println("Please enter to continue.");
							enter = in.nextLine();		
						}//switch 2
					} while (flag == 0);
					break;
				case 6: //Save
					cls();
					System.out.println("Save Data");
					System.out.println("by Jenny Wang");
					System.out.println(" ");
					System.out.println("Saving data carefully");
					System.out.println(" ");
					PrintWriter questsout = new PrintWriter("treasure.txt");
					questsout.println(cnt);
					//questout.println(variable/text);
					for (i=1; i<=cnt; i++)
					{
						questsout.println(T[i][0]);
						questsout.println(T[i][1]);
						questsout.println(T[i][2]);
						questsout.println(T[i][3]);
						questsout.println(T[i][4]);
						questsout.println(T[i][5]);
						//questsout.println(T[i][6]);
					}
					questsout.close();
					System.out.println("Saving complete. Press enter to return to the menu."); 
					enter = in.nextLine();
					break;
				case 7: //Load
					cls();
					System.out.println("Load Data");
					System.out.println("by Jenny Wang");
					System.out.println(" ");
					System.out.println("Loading data carefully");
					System.out.println(" ");
					File fin = new File("treasure.txt");
					Scanner filein = new Scanner(fin);
					enter = filein.nextLine(); 
					cnt = Integer.parseInt(enter);
					for (i=1; i<=cnt; i++)
					{
						T[i][0]=filein.nextLine();
						T[i][1]=filein.nextLine();
						T[i][2]=filein.nextLine();
						T[i][3]=filein.nextLine();
						T[i][4]=filein.nextLine();
						T[i][5]=filein.nextLine();
						//T[i][6]=filein.nextLine();
					}
					filein.close();
					System.out.println("Loading complete. Please check 'Option 4. Display Numbers'"); 
					System.out.println("Press enter to return to the menu. ");
					enter = in.nextLine();
					break;
				case 8: //Quit
					System.out.println("Thank you for using this program.");
					break;
				default:
					System.out.println("Choice must be a value between 1 and 8.");
					System.out.println("Please enter to continue.");
					enter = in.nextLine();		
			} // switch
			//in.close();
		}while(input!=8);	
	}//main
		public static void cls() 
		{
			for (int i=1; i<=50; i++)
			{
				System.out.println();
			}
		}
}// treasure