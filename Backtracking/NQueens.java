

public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println(queens(board,0));

    }

    static int queens(boolean[][] board, int row) {
        if (row == board.length) {
            // all the queens have been placed.
            display(board);
            System.out.println();  //to print a line space.
            return 1;
        }

            //placing the queen and checking for every row and column.

            int count =0;

            for(int col =0; col<board.length; col++){
                //place the queen if it safe.
                if(isSafe(board, row, col)){
                    board[row][col] = true;
                    count += queens(board, row+1);
                    //backtrack..
                    board[row][col] = false;
                }
            }

            return count;

        }


    private static boolean isSafe(boolean[][] board, int row, int col){
        //we need to check the vertical and left right diagonals,
        // we can skip the row below, to where the current queen is present
        // as its not there yet.

        //checking for the vertical
        for (int i =0; i<row; i++){
            if(board[i][col]){
                //it means there is a queen there.
                return false;
            }
        }

        //checking for diagonal left.
        int maxLeft = Math.min(row, col);
        for(int i =1; i <= maxLeft; i++){
            if(board[row-i][col-i]){
                return false;
            }
        }

        int maxRight = Math.min(row, board.length -1 -col);
        for (int i = 1; i <= maxRight; i++){
            if(board[row-i][col+i]){
                return false;
            }
        }

        return true;
    }

    private static void display(boolean[][] board) {
        for(boolean[] row: board){
            for(boolean element : row){
                if(element){
                    System.out.print("Q ");
                }
                else {
                    System.out.print("X ");
                }

            }
            System.out.println();
        }
    }
}
