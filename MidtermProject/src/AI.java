import java.util.Scanner;
public class AI
	{
	public static void computerMove()
	{
	int computerMove=(int) (Math.random() * 9) + 1;
	placePawn(computerMove, PlayersMove.compPawn); 
	}
	
	public static void placePawn(int computerMove, String pawn)
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