import java.util.Scanner;
public class AI
	{
	public static void computerMove()
		{
		int computerMove=(int) (Math.random() * 9);
		String [] possibles = {"a1", "a2", "a3", "b1", "b2", "b3", "c1", "c2", "c3"};
		PlayersMove.placePawn(possibles[computerMove], PlayersMove.compPawn); 
		}
	
	
	
	}