package jennyworld;
import java.io.*;
import java.util.Scanner;
public class FootballProject {
	public static void main(String[] args) throws FileNotFoundException{
		Scanner in = new Scanner(System.in);
		int cnt = 0; //number of teams
		int input = 0;
		int flag = 0;
		int i = 0;
		int j = 0;
		int x = 0;
		int wins = 0;
		int losses = 0;
		double P = 0.0; //percent
		int w = 0; //win parse
		int l = 0; //lose parse
		int t1 = 0; //team 1
		int t2 = 0; //team 2
		double cow1 = 0; //chance of winning team 1
		double cow2 = 0; //chance of winning team 2
		String enter = "";
		//only 1 array T[100][4]
		String [][] T = new String [100][4]; 
		String [] d = new String [100];
		do
		{
			cls();
			System.out.println("Football Project");
			System.out.println("by Jenny Wang");
			System.out.println(" ");
			System.out.println("Enter one of the following commands");
			System.out.println("1 -> Add Teams");
			System.out.println("2 -> Edit/Update Teams");
			System.out.println("3 -> Delete Teams");
			System.out.println("4 -> Display Teams Stats");
			System.out.println("5 -> Prediction Option");
			System.out.println("6 -> Save Teams");
			System.out.println("7 -> Load Teams");
			System.out.println("8 -> Quit");
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
			//Convert. cnt = Integer.parseInt(string variable);
			//This will be used when reading in a text file
				case 1: //Add Teams
					flag = 0;
					while (flag == 0)
					{
						cls();
						System.out.println("Add Teams");
						System.out.println("by Jenny Wang");
						System.out.println(" ");
						System.out.print("Enter the team name or / for menu: ");
						enter = in.nextLine();
						if(enter.equals("/"))
						{
							flag = 1; 
							break;
						}
						d[1] = enter;
						System.out.print("Enter the number of wins (an error will be automatically set to 0) for "+d[1]+": "); 
						enter = in.nextLine();
						if(enter.equals("/"))
						{
							flag = 1; 
							break;
						}
						d[2] = enter;
						try 
						{
							x = Integer.parseInt(enter);
						}
						catch (Exception err)
						{
							d[2] = "0";
						}
						System.out.print("Enter the number of loses (an error will be automatically set to 0) for "+d[1]+": "); 
						enter = in.nextLine();
						if(enter.equals("/"))
						{
							flag = 1; 
							break;
						}
						d[3] = enter;
						try 
						{
							x = Integer.parseInt(enter);
						}
						catch (Exception err)
						{
							d[3] = "0";
						}
						System.out.println(" ");
						System.out.println(" ");
						cnt = cnt+ 1;
						T[cnt][1] = d[1];	
						T[cnt][2] = d[2];
						T[cnt][3] = d[3];
				} 
					break;
				case 2: //Edit/Update Teams
					flag=0;
					while(flag==0)
					{						
						cls();
						System.out.println("Edit/Update Teams");
						System.out.println("by Jenny Wang");
						System.out.println(" ");
						if (cnt == 0)
						{
							System.out.println("No teams have been entered.");
							System.out.println(" ");
							System.out.println("Press enter to return to the menu.");
							enter = in.nextLine();
							break;
						}
						for (i=1; i<=cnt; i++)
						{
							System.out.println(i+") "+T[i][1]);
						}
						System.out.print("Enter the the number of the item to edit or / for menu. ");
						enter = in.nextLine();
						if(enter.equals("/"))
							{
							flag = 2; 
							break;
							}
						System.out.println(" ");
						System.out.println(" ");
						try
						{
							j = Integer.parseInt(enter);
						}
						catch (Exception err)
						{
							System.out.println("I am sorry, you entered an invalid response.");
							System.out.println("Press enter to continue");
							enter = in.nextLine();
							break;
						} 
						if (j>=1 && j<=cnt)
						{
							System.out.println("Press 'enter' to accept the team or enter the corrected name.");
							System.out.println("Team Name: "+T[j][1]);
							enter = in.nextLine();
							if(enter.contentEquals(""))
							{
								T[j][1]=T[j][1];
							}
							else
							{
								T[j][1]=enter;
							}
							System.out.println("Press 'enter' to accept the number wins or enter the corrected number. ");
							System.out.println("An invalid answer will result with a 0.");
							System.out.println("Wins: "+T[j][2]);
							enter = in.nextLine();
							if(enter.contentEquals(""))
							{
								T[j][2]=T[j][2];
							}
							else
							{
								try 
								{
									x = Integer.parseInt(enter);
								}
								catch (Exception err)
								{
									enter = "0";
								}
								T[j][2]=enter;
							}
							System.out.println("Press 'enter' to accept the number loses or enter the corrected number. ");
							System.out.println("An invalid answer will result with a 0.");
							System.out.println("Loses: "+T[j][3]);
							enter = in.nextLine();
							if(enter.contentEquals(""))
							{
								T[j][3]=T[j][3];
							}
							else
							{
								try 
								{
									x = Integer.parseInt(enter);
								}
								catch (Exception err)
								{
									enter = "0";
								}
								T[j][3]=enter;
							}
						}
					} break;
				case 3: //Delete Team
					flag = 0;
					while (flag == 0)
					{
						cls();
						System.out.println("Delete Teams");
						System.out.println("by Jenny Wang");
						System.out.println(" ");
						if(cnt == 0)
						{
							System.out.println("No teams have been entered.");
							System.out.println(" ");
							System.out.println("Press enter to return to the menu.");
							enter = in.nextLine();
							break;
						}
						for (i=1; i<=cnt; i++)
						{
							System.out.println(i+") "+T[i][1]);
						}
						System.out.println(" ");
						System.out.print("Enter the number to delete or / for menu: ");
						enter = in.nextLine();
						if(enter.equals("/"))
							{
							flag = 1; 
							break;
							}
						try
						{
							j = Integer.parseInt(enter);
						}
						catch (Exception err)
						{
							System.out.println(" ");
							System.out.println("I am sorry, you entered an invalid response.");
							//break;
						}
						if (j>=1 && j<=cnt)
						{
							for (i=j; i<=cnt; i++)
							{
								T[i][1] = T[i+1][1];	
								T[i][2] = T[i+1][2];
								T[i][3] = T[i+1][3];
							}
							cnt=cnt-1;
						}
						else 
						{
							System.out.println(" ");
							System.out.println("Invalid answer");
							System.out.println("Press enter to continue");
							enter = in.nextLine();
						}
					} break;
				case 4: //Display Team Stats
					cls();
					System.out.println("Display Team Stats");
					System.out.println("by Jenny Wang");
					if (cnt == 0)
					{
						System.out.println("No teams have been entered yet.");
					}
					System.out.println(" ");
					System.out.printf("%30s %20s %20s %20s" , "Team Name", "Wins", "Losses", "Percent");
					System.out.println(" ");
					for (i=1; i<=cnt; i++)
					{
						//System.out.println("Team "+i+"-"+T[i][1]);
						//System.out.println("Wins "+i+"-"+T[i][2]);
						//System.out.println("Loses "+i+"-"+T[i][3]);
						System.out.printf("%30s %20s %20s", T[i][1], T[i][2], T[i][3]);
						try 
						{
							wins = Integer.parseInt(T[i][2]);
						}
						catch(Exception err)
						{
							System.out.println(" ");
							System.out.println("Sorry, there is an invalid entry "+T[i][2]+" in the wins column for team"+T[i][1]);
							System.out.println("Press enter to continue");
							enter = in.nextLine();
							break;
						}
						try 
						{
							losses = Integer.parseInt(T[i][3]);
						}
						catch(Exception err)
						{
							System.out.println(" ");
							System.out.println("Sorry, there is an invalid entry "+T[i][3]+" in the losses column for team"+T[i][1]);
							System.out.println("Press enter to continue");
							enter = in.nextLine();
							break;
						}
						w = Integer.parseInt(T[i][2]);
						l = Integer.parseInt(T[i][3]);
						if (w + l == 0)
						{
							System.out.printf("%20s\n","N/A");
						}
						else
						{
						P = w*1000/(w+l);
						P = P/10.0;
						System.out.printf("%20.3f", P);
						System.out.printf("%1s\n","%");
						}
					}
					System.out.println(" ");
					System.out.println("Press enter to return to the menu.");
					enter = in.nextLine();
					break;
				case 5: //Prediction Option
					flag = 0;
					while (flag == 0)
					{
						cls();
						System.out.println("Prediction Option");
						System.out.println("by Jenny Wang");
						System.out.println(" ");
						System.out.println("This option will predict which team will win between two teams.");
						System.out.println(" ");
						if(cnt == 0)
						{
							System.out.println("No teams have been entered.");
							System.out.println(" ");
							System.out.println("Press enter to return to the menu.");
							enter = in.nextLine();
							break;
						}
						for (i=1; i<=cnt; i++)
						{
							System.out.println(i+") "+T[i][1]);
						}
						System.out.println(" ");
						System.out.print("Enter the number for a team or / for menu : ");
						enter = in.nextLine();
						if(enter.equals("/"))
						{
							flag = 1; 
							break;
						}
						try
						{
							t1 = Integer.parseInt(enter);
						}
						catch(Exception err)
						{
							System.out.println(" ");
							System.out.println("Invalid team number.");
							System.out.println("Press enter to return to menu.");
							enter = in.nextLine();
							break;
						}
						System.out.print("Enter another number for a team to compare or / for menu: ");
						enter = in.nextLine();
						if(enter.equals("/"))
						{
							flag = 1; 
							break;
						}
						try
						{
							t2 = Integer.parseInt(enter);
						}
						catch(Exception err)
						{
							System.out.println(" ");
							System.out.println("Invalid team number.");
							System.out.println("Press enter to return to menu.");
							enter = in.nextLine();
							break;
						}
						if (t1 == t2)
						{
							System.out.println(" ");
							System.out.println("The team cannot play itself.");
							System.out.println("Press enter to return to menu.");
							enter = in.nextLine();
							break;
						}
						//loop begin here, do loop
						w = Integer.parseInt(T[t1][2]);
						l = Integer.parseInt(T[t1][3]);
						cow1 = (((Math.random()*cnt+Math.random()*cnt*w)-(Math.random()*cnt+Math.random()*cnt*l)*3)+7);
						w = Integer.parseInt(T[t2][2]);
						l = Integer.parseInt(T[t2][3]);
						cow2 = (((Math.random()*cnt+Math.random()*cnt*w)-(Math.random()*cnt+Math.random()*cnt*l)*3)+7);
						//check if  cow1 = cow2, then repeat loop
						System.out.println("The chance of winning for "+T[t1][1]+" is "+cow1+"%");
						System.out.println("The chance of winning for "+T[t2][1]+" is "+cow2+"%");
						if (cow1>cow2)
						{
							System.out.println("The winning team will be "+T[t1][1]);
						}
						if (cow1<cow2)
						{
							System.out.println("The winning team will be "+T[t2][1]);
						}
						if (cow1 == cow2)
						{
							System.out.println(T[t1][1]+" and "+T[t2][1]+" will tie.");
						}
						System.out.println(" ");
						System.out.println("Press enter to continue.");
						enter = in.nextLine();
					}break;
				case 6: //Save Teams
					//Create a PrintWriter object (opens the file). PrintWriter questout = new PrintWriter("test.txt");
					//write to the file as you would to the System. questsout.println(variable/text);
					//close the file. questout.close();
					cls();
					System.out.println("Save Teams");
					System.out.println("by Jenny Wang");
					System.out.println(" ");
					System.out.println("Saving data carefully");
					System.out.println(" ");
					//file name will be football.txt
					PrintWriter questsout = new PrintWriter("football.txt");
					questsout.println(cnt);
					//questout.println(variable/text);
					for (i=1;i<=cnt;i++)
					{
						questsout.println(T[i][1]);
						questsout.println(T[i][2]);
						questsout.println(T[i][3]);
					}
					questsout.close();
					System.out.println("Saving complete. Press enter for the menu."); 
					enter = in.nextLine();
					break;
				case 7: //Load Teams
					//Create a file Object (the file name). File fin = new File("test.txt");
					//Create a Scanner object (this opens the file). Scanner filein = new Scanner(fin);
					//Read the file. variable = filein.nextLine();
					//Close file. file.close();
					cls();
					System.out.println("Load Teams");
					System.out.println("by Jenny Wang");
					System.out.println(" ");
					System.out.println("Loading data carefully");
					System.out.println(" ");
					//file name will be football.txt
					File fin = new File("football.txt");
					Scanner filein = new Scanner(fin);
					T[0][0] = filein.nextLine(); 
					cnt = Integer.parseInt(T[0][0]);
					for (i=1; i<=cnt; i++)
					{
						T[i][1]=filein.nextLine();
						T[i][2]=filein.nextLine();
						T[i][3]=filein.nextLine();
					}
					filein.close();
					System.out.println("Loading complete. Press enter for the menu."); 
					enter = in.nextLine();
					break;
				case 8: //Quit
					System.out.println("Thank you for using this program.");
					break;
				default:
					System.out.println("Choice must be a value between 1 and 8.");
					System.out.println("Please enter to continue.");
					enter = in.nextLine();		
			} //switch
		} while(input!=8);
		in.close();
	}//main
			public static void cls() 
			{
				for (int i=1; i<=50; i++)
				{
					System.out.println();
				}
			}

}//FootballProject
