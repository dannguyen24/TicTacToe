public class Board {
    private char[][] board;

    public Board() {
        board = new char[3][3];
    } 

    public void printBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = ' ';
            }
        }
        //Display the board
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j]);
                if (j != board[i].length -1) {
                    System.out.print('|');
                }

            }
            System.out.println();
            if (i != board.length -1) {
                System.out.println("-+-+-");
            }
        }

    }
    
    
    
}
