import java.util.Scanner;

public class TTTBoard
{
    final static int ROWS = 3;
    final static int COLS = 3;
    static String board[][];

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String player = "X";
        boolean done = false;
        int row = 0;
        int col = 0;
        board = new String[ROWS][COLS];
        clearBoard();
        showBoard();


        do
        {
            do
            {
                row = SafeInput.getRangedInt(in, "Player " + player + " Enter your row", 1, 3);
                col = SafeInput.getRangedInt(in, "Player " + player + " Enter your col", 1, 3);
                row--;
                col--;
                if(!board[row][col].equals("X") || board[row][col].equals("Y")){
                    recordMove(player,row,col);
                }
                showBoard();
            }while(isValidMove(row,col));

            if(!isValidMove(row,col))
            {
                player = "O";
            }
            else
                player = "X";
        }while(!done);





    }
    private static void clearBoard()
    {
        for(int r = 0; r < ROWS; r++)
        {
            for(int c = 0; c < COLS; c++)
                board[r][c] = " ";
        }

    }
    private static void showBoard()
    {
        {
            for(int r = 0; r < ROWS; r++)
            {
                System.out.print("|");
                for(int c = 0; c < COLS; c++){
                    System.out.print(board[r][c]+ "|");
                }
                System.out.println();
            }

        }
    }
    private static boolean isValidMove(int r, int c)
    {
        boolean retVal = false;
        if( r < 0 || r> ROWS)
        {
            System.out.println("Row param out of range: " + r);
        }
        if( c < 0 || c > COLS)
        {
            System.out.println("Cow param out of range: " + c);
        }

        if(board[r][c].equals(" "))
        {
            retVal = true;
        }
        return retVal;
    }
    private static void recordMove(String player, int r, int c)
    {
        board[r][c] = player;
    }
}
