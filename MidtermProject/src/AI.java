import java.util.Scanner;
public class AI
	{
	static int computerMove;
	static int possibleMoves;
	public static void chooseRandomMove()
		{
		int computerMove = (int) (Math.random() * 9) + 1;
		String[]possibleMoves={"a1", "a2", "a3", "b1", "b2", "b3", "c1", "c2", "c3"};
		}
	public static void computerMove()
		{
		if(computerMove==1)
			{
			BoardCreator.board[0][0]="O";
			}
		else if(computerMove==2)
			{
			BoardCreator.board[0][1]="O";
			}
		else if(computerMove==3)
			{
			BoardCreator.board[0][2]="O";
			}
		else if(computerMove==4)
			{
			BoardCreator.board[1][0]="O";
			}
		else if(computerMove==5)
			{
			BoardCreator.board[1][1]="O";
			}
		else if(computerMove==6)
			{
			BoardCreator.board[1][2]="O";
			}
		else if(computerMove==7)
			{
			BoardCreator.board[2][0]="O";
			}
		else if(computerMove==8)
			{
			BoardCreator.board[2][1]="O";
			}
		else if(computerMove==9)
			{
			BoardCreator.board[2][2]="O";
			}
		}
	}