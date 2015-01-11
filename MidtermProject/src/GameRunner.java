import java.util.Scanner;

public class GameRunner
	{
	static boolean again = true; 
	public static void main(String[] args)
		{
		PlayersMove.greetPlayer();
		while(again==true)
		{
		BoardCreator.createBoard1();
		PlayersMove.askForPawn();
		BoardCreator.isGameWon=false;
		BoardCreator.displayBoard();
		while(!(BoardCreator.isGameWon))
			{
			PlayersMove.askForMove();
			BoardCreator.isGameWon();
			if(BoardCreator.isGameWon==true)
				{
				System.out.println("You have won");
				break;
				}
			AI.computerMove();
			BoardCreator.displayBoard();
			BoardCreator.isGameWon();
			if(BoardCreator.isGameWon==true)
			{
			System.out.println("You have lost.");
			}
			}
		System.out.println("Would you like to play again?");
		Scanner userInput4 = new Scanner(System.in); 
		String again1 = userInput4.nextLine();
		again1=again1.toLowerCase().substring(0,1); 
		if(again1.equals("y"))
			{
			again=true; 
			}
		else
		{
			System.out.println("Thanks for playing!");
			again=false; 
		}
		}
		}
	}
