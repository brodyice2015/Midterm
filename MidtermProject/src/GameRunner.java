import java.util.Scanner;

public class GameRunner
	{
	static boolean again = true; 
	public static void main(String[] args)
		{
		PlayersMove.greetPlayer();
		System.out.println("Would you like to play a) one player or b) two player?");
		Scanner mode = new Scanner(System.in); 
		String choice = mode.nextLine().toLowerCase(); 
		if(choice.equals("a"))
			{
			onePlayer(); 
			}
		else
			{
			twoPlayer(); 
			}
		}
		
		public static void onePlayer()
			{
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
					if(BoardCreator.checkTie == true)
						{
						System.out.println("TIE GAME!");
						System.exit(0);
						}
					System.out.println("You have won");
					break;
					}
				AI.computerMove();
				BoardCreator.displayBoard();
				BoardCreator.isGameWon();
				if(BoardCreator.isGameWon==true)
				{
					if(BoardCreator.checkTie == true)
					{
					System.out.println("TIE GAME!");
					System.exit(0);
					}
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
		
		public static void twoPlayer()
			{
			System.out.println("Player One will be X. Player 2 will be O.");
			BoardCreator.createBoard1();
			BoardCreator.isGameWon=false;
			while(again==true)
			{
			BoardCreator.displayBoard();
			while(!(BoardCreator.isGameWon))
			{
			PlayersMove.askForMove("X");
			BoardCreator.isGameWon();
			if(BoardCreator.isGameWon==true)
				{
				if(BoardCreator.checkTie == true)
					{
					BoardCreator.displayBoard();
					System.out.println("TIE GAME!");
					System.exit(0);
					}
				System.out.println("Player One has won");
				break;
				}
			BoardCreator.displayBoard();
			PlayersMove.askForMove("O");
			BoardCreator.displayBoard();
			BoardCreator.isGameWon();
			if(BoardCreator.isGameWon==true)
			{
				if(BoardCreator.checkTie == true)
					{
					BoardCreator.displayBoard();
					System.out.println("TIE GAME!");
					System.exit(0);
					}
			System.out.println("Player Two has won.");
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
		
	
