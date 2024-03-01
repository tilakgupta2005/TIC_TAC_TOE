import java.util.*;

class Tic_tac_toe
{
  public static int i, j, pos;
  public static boolean e = false;
  public static boolean draw = false;
  public static boolean wino = false;
  public static boolean winx = false;
  public static boolean gamerunning = true;
  public static int k = 1;
  public static String game[][] = new String[7][7];

  public static void main (String[]args)
  {
	gameBoard ();
	System.out.println ("Welcome to the  tic tac toe game\n");
	System.out.
	  println ("Enter the value where you want to place your X or O\n");
	System.out.
	  println
	  ("-------\n|1|2|3|\n-------\n|4|5|6|\n-------\n|7|8|9|\n-------\n");
	print ();
	Scanner in = new Scanner (System.in);
	while (gamerunning)
	  {
		chance (in);
		if (winx || wino || draw || e)
		  break;
	  }
	in.close ();
  }

  private static void check ()	// check for win
  {
	if (game[1][1].equals (game[1][3]) && game[1][3].equals (game[1][5]) && game[1][1] != (" "))	// 1st row
	  {
		if (game[1][1].equals ("X"))
		  winx = true;
		else if (game[1][1].equals ("0"))
		  wino = true;
	  }
	else if (game[3][1].equals (game[3][3]) && game[3][3].equals (game[3][5]) && game[3][1] != (" "))	// 2nd row
	  {
		if (game[3][1].equals ("X"))
		  winx = true;
		else if (game[3][1].equals ("0"))
		  wino = true;
	  }
	else if (game[5][1].equals (game[5][3]) && game[5][3].equals (game[5][5]) && game[5][1] != (" "))	// 3rd row
	  {
		if (game[5][1].equals ("X"))
		  winx = true;
		else if (game[5][1].equals ("0"))
		  wino = true;

	  }
	else if (game[1][1].equals (game[3][1]) && game[3][1].equals (game[5][1]) && game[1][1] != (" "))	// 1st coloumn
	  {
		if (game[1][1].equals ("X"))
		  winx = true;
		else if (game[1][1].equals ("0"))
		  wino = true;
	  }
	else if (game[1][3].equals (game[3][3]) && game[3][3].equals (game[5][3]) && game[1][3] != (" "))	// 2nd coloumn
	  {
		if (game[1][3].equals ("X"))
		  winx = true;
		else if (game[1][3].equals ("0"))
		  wino = true;
	  }
	else if (game[1][5].equals (game[3][5]) && game[3][5].equals (game[5][5]) && game[1][5] != (" "))	// 3rd coloumn
	  {
		if (game[1][5].equals ("X"))
		  winx = true;
		else if (game[1][5].equals ("0"))
		  wino = true;
	  }
	else if (game[1][1].equals (game[3][3]) && game[3][3].equals (game[5][5]) && !game[1][1].equals (" "))	// 1st diagonal
	  {
		if (game[1][1].equals ("X"))
		  winx = true;
		else if (game[1][1].equals ("0"))
		  wino = true;
	  }
	else if (game[5][1].equals (game[3][3]) && game[3][3].equals (game[1][5]) && !game[5][1].equals (" "))	// 2nd diagonal
	  {
		if (game[5][1].equals ("X"))
		  winx = true;
		else if (game[5][1].equals ("0"))
		  wino = true;
	  }
	else
	  {
		gamerunning = true;
	  }

	if (winx || wino || draw || e)
	  {
		gamerunning = false;
	  }
  }


  private static void gameBoard ()	// creates the game Board
  {
	for (int j = 0; j <= 7; j += 2)
	  {
		for (int i = 0; i < 7; i++)
		  {
			game[j][i] = "-";
		  }
	  }
	for (i = 1; i < 7; i += 2)
	  {
		for (j = 0; j < 7; j++)
		  {
			if (j % 2 != 0)
			  {
				game[i][j] = " ";
			  }
			else
			  {
				game[i][j] = "|";
			  }
		  }
	  }
	return;
  }

  private static void print ()	// prints all the screen
  {
	if (winx)
	  {
		System.out.println ("X Won the game");
		return;
	  }
	else if (wino)
	  {
		System.out.println ("0 Won the game");
		return;
	  }
	else if (draw)
	  {
		System.out.println ("Draw");
		return;
	  }
	else if (e)
	  {
		System.out.println ("Error");
		return;
	  }
	else
	  for (i = 0; i < 7; i++)
		{
		  for (j = 0; j < 7; j++)
			{
			  System.out.print (game[i][j]);
			}
		  System.out.println ();
		}
	if (k % 2 != 0)
	  {
		System.out.println ("X Chance");
		return;
	  }
	else
	  {
		System.out.println ("0 Chance");
		return;
	  }
  }

  private static void x ()		// locates x
  {
	if (pos == 1 && game[1][1].equals (" "))
	  game[1][1] = "X";
	else if (pos == 2 && game[1][3].equals (" "))
	  game[1][3] = "X";
	else if (pos == 3 && game[1][5].equals (" "))
	  game[1][5] = "X";
	else if (pos == 4 && game[3][1].equals (" "))
	  game[3][1] = "X";
	else if (pos == 5 && game[3][3].equals (" "))
	  game[3][3] = "X";
	else if (pos == 6 && game[3][5].equals (" "))
	  game[3][5] = "X";
	else if (pos == 7 && game[5][1].equals (" "))
	  game[5][1] = "X";
	else if (pos == 8 && game[5][3].equals (" "))
	  game[5][3] = "X";
	else if (pos == 9 && game[5][5].equals (" "))
	  game[5][5] = "X";
	else
	  e = true;
  }

  private static void o ()		// locates O
  {
	if (pos == 1 && game[1][1].equals (" "))
	  game[1][1] = "0";
	else if (pos == 2 && game[1][3].equals (" "))
	  game[1][3] = "0";
	else if (pos == 3 && game[1][5].equals (" "))
	  game[1][5] = "0";
	else if (pos == 4 && game[3][1].equals (" "))
	  game[3][1] = "0";
	else if (pos == 5 && game[3][3].equals (" "))
	  game[3][3] = "0";
	else if (pos == 6 && game[3][5].equals (" "))
	  game[3][5] = "0";
	else if (pos == 7 && game[5][1].equals (" "))
	  game[5][1] = "0";
	else if (pos == 8 && game[5][3].equals (" "))
	  game[5][3] = "0";
	else if (pos == 9 && game[5][5].equals (" "))
	  game[5][5] = "0";
	else
	  e = true;
  }
  private static void chance (Scanner in)
  {
	check ();
	if (wino || winx || draw || e)
	  return;
	pos = in.nextInt ();
	if (k % 2 != 0 && k <= 9)
	  x ();
	else if (k % 2 == 0 && k <= 9)
	  o ();
	else if (k == 9)
	  {
		draw = true;
		print ();
		return;
	  }
	else
	  {
		e = true;
		print ();
		return;
	  }
	k++;
	print ();
  }
}
