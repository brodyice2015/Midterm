import java.util.Scanner;
public class BoardCreator
	{
	public static String[][] board=new String[3][3];
	public static boolean isGameWon=false;
	public static boolean checkTie; 
public static void createBoard1()
	{
	for(int i=0; i<3;i++) 
		{
		for (int j=0; j<3;j++) 
			{
			board[i][j]=" ";
			}
		}
	}
public static void displayBoard()
	{
	System.out.println("   1   2   3");
	System.out.println("--------------");
	System.out.println("A | " + board[0][0] + " | " + board[0][1] + " | " + board[0][2] + " | ");
	System.out.println("--------------");
	System.out.println("B | " + board[1][0] + " | " + board[1][1] + " | " + board[1][2] + " | ");
	System.out.println("--------------");
	System.out.println("C | " + board[2][0] + " | " + board[2][1] + " | " + board[2][2] + " | ");
	System.out.println("--------------");
	System.out.println("");
	}
public static void isGameWon()
	{
	if ((board[0][0].equals(board[0][1])) && (board[0][1].equals(board[0][2])) && (!(board[0][0].equals(" ")))||
	((board[1][0].equals(board[1][1])) && (board[1][1].equals(board[1][2])) && (!(board[1][0].equals(" "))))||
	((board[2][0].equals(board[2][1])) && (board[2][1].equals(board[2][2])) && (!(board[2][0].equals(" "))))||
	((board[0][0].equals(board[1][0])) && (board[1][0].equals(board[2][0])) && (!(board[0][0].equals(" "))))||
	((board[0][1].equals(board[1][1])) && (board[1][1].equals(board[2][1])) && (!(board[0][1].equals(" "))))||
	((board[0][2].equals(board[1][2])) && (board[1][2].equals(board[2][2])) && (!(board[2][2].equals(" "))))||
	((board[0][0].equals(board[1][1])) && (board[1][1].equals(board[2][2])) && (!(board[0][0].equals(" "))))||
	((board[0][2].equals(board[1][1])) && (board[1][1].equals(board[2][0])) && (!(board[2][0].equals(" ")))))
		{
		isGameWon=true;
		System.out.println("The game is over");
		}
	checkTie=true;
	for(int i=0; i<3; i++)
		{
		for(int z=0; z<3; z++)
			{
			if(board[i][z].equals(" "))
				{
				checkTie=false;
				}
			}
		}
	if(checkTie == true)
		{
		isGameWon=true;
		}
	}
}