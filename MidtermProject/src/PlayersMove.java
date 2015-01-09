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
	if (choice.equals("X") || choice.equals("O"))
		{
		userPawn=choice;
		}
	else 
		{
		System.out.println("Oh look, just another guy who wants to break me. You are sooooooo cool.");
		askForPawn(); 
		}
	if(userPawn=="X")
		{
		compPawn="O"; 
		}
	else
		{
		compPawn="X"; 
		
		}
	}
public static void askForMove()
	{
	Scanner userInput = new Scanner(System.in);
	System.out.println("Please make a move.");
	String move=userInput.nextLine().toLowerCase();
	switch(move) 
		{
		case "a1":
			{
			BoardCreator.board[0][0]=pawn;
			BoardCreator.displayBoard();
			break;
			}
		case "a2":
			{
			BoardCreator.board[0][1]=pawn;
			BoardCreator.displayBoard();
			break;
			}
		case "a3":
			{
			BoardCreator.board[0][1]=pawn;
			BoardCreator.displayBoard();
			break;
			}
		case "b1":
			{
			BoardCreator.board[1][0]=pawn;
			BoardCreator.displayBoard();
			break;
			}
		case "b2":
			{
			BoardCreator.board[1][1]=pawn;
			BoardCreator.displayBoard();
			break;
			}
		case "b3":
			{
			BoardCreator.board[1][2]=pawn;
			BoardCreator.displayBoard();
			break;
			}
		case "c1":
			{
			BoardCreator.board[2][0]=pawn;
			BoardCreator.displayBoard();
			break;
			}
		case "c2":
			{
			BoardCreator.board[2][1]=pawn;
			BoardCreator.displayBoard();
			break;
			}
		case "c3":
			{
			BoardCreator.board[2][2]=pawn;
			BoardCreator.displayBoard();
			break;
			}
		default:
			{
			
			}
		}
	}
	}
