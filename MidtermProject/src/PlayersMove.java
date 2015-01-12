import java.util.Scanner;
public class PlayersMove
	{
static String userPawn, compPawn;
static String pawn;
public static void greetPlayer()
		{
		Scanner userInput = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = userInput.nextLine();
		System.out.println("Hello, " + name + "!");
		String compliments[] = {"You look good!", "You've been working out!", "Nice tan!", "I like your haircut!", "I like your car!"};
		int randomNumber = (int) (Math.random() * 5);
		System.out.println(compliments[randomNumber]);
		}
public static void askForPawn()
	{
	Scanner userInput = new Scanner(System.in);
	System.out.println("Would you like to be X or O?");
	String choice =userInput.nextLine();
	if (choice.equals("X"))
		{
		userPawn=choice;
		compPawn="O"; 
		}
	else if(choice.equals("O"))
		{
		userPawn = choice; 
		compPawn="X"; 
		}
	else 
		{
		System.out.println("Oh look, just another guy who wants to break me. You are sooooooo cool.");
		askForPawn(); 
		}
	}
public static void askForMove()
	{
	Scanner userInput = new Scanner(System.in);
	System.out.println("Please make a valid move.");
	String move=userInput.nextLine().toLowerCase();
	placePawn(move, userPawn); 
	}

public static void askForMove(String pawn)
{
Scanner userInput = new Scanner(System.in);
System.out.println("Please make a valid move.");
String move=userInput.nextLine().toLowerCase();
placePawn(move, pawn); 
}

public static void placePawn(String move, String pawn)
	{
	switch(move) 
		{
		case "a1":
			{
				if(BoardCreator.board[0][0].equals(" "))
				{
				BoardCreator.board[0][0]=pawn;
				}
				else if(pawn==PlayersMove.userPawn)
					{
					askForMove(); 
					}
				else
					{
					AI.computerMove();
					}
				break;
			}
		case "a2":
			{
				if(BoardCreator.board[0][1].equals(" "))
				{
				BoardCreator.board[0][1]=pawn;
				}
				else if(pawn==PlayersMove.userPawn)
				{
				askForMove(); 
				}
			else
				{
				AI.computerMove();
				}
			break;
			}
		case "a3":
			{
				if(BoardCreator.board[0][2].equals(" "))
				{
				BoardCreator.board[0][2]=pawn;
				}
				else if(pawn==PlayersMove.userPawn)
				{
				askForMove(); 
				}
			else
				{
				AI.computerMove();
				}
			break;
			}
		case "b1":
			{
				if(BoardCreator.board[1][0].equals(" "))
				{
				BoardCreator.board[1][0]=pawn;
				}
				else if(pawn==PlayersMove.userPawn)
				{
				askForMove(); 
				}
			else
				{
				AI.computerMove();
				}
			break;
			}
		case "b2":
			{
				if(BoardCreator.board[1][1].equals(" "))
				{
			BoardCreator.board[1][1]=pawn;
				}
				else if(pawn==PlayersMove.userPawn)
				{
				askForMove(); 
				}
			else
				{
				AI.computerMove();
				}
			break;
			}
		case "b3":
			{
				if(BoardCreator.board[1][2].equals(" "))
				{
				BoardCreator.board[1][2]=pawn;
				}
				else if(pawn==PlayersMove.userPawn)
				{
				askForMove(); 
				}
			else
				{
				AI.computerMove();
				}
			break;
			}
		case "c1":
			{
				if(BoardCreator.board[2][0].equals(" "))
					{
					BoardCreator.board[2][0]=pawn;
					}
				else if(pawn==PlayersMove.userPawn)
				{
				askForMove(); 
				}
			else
				{
				AI.computerMove();
				}
			break;
			}
		case "c2":
			{
				if(BoardCreator.board[2][1].equals(" "))
				{
				BoardCreator.board[2][1]=pawn;
				}
				else if(pawn==PlayersMove.userPawn)
				{
				askForMove(); 
				}
			else
				{
				AI.computerMove();
				}
			break;
			}
		case "c3":
			{
				if(BoardCreator.board[2][2].equals(" "))
					{
					BoardCreator.board[2][2]=pawn;
					}
				else if(pawn==PlayersMove.userPawn)
				{
				askForMove(); 
				}
			else
				{
				AI.computerMove();
				}
			break;
			}	
		default:
			{
			
			}
		}
	}
	}
