public class GameRunner
	{
	public static void main(String[] args)
		{
		PlayersMove.greetPlayer();
		BoardCreator.createBoard1();
		PlayersMove.askForPawn();
		BoardCreator.isGameWon=false;
		while(!(BoardCreator.isGameWon))
			{
			PlayersMove.askForMove();
			BoardCreator.isGameWon();
			if(BoardCreator.isGameWon==true)
				{
				break;
				}
			AI.computerMove();
			BoardCreator.isGameWon();
			}
		}
	}
