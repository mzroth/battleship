import java.util.Arrays;

public class Board {

    enum CellType {
        HIT, MISS, WATER, SHIP;
    }

    public Board() {

    }

    public CellType[][] createBoard() {
        CellType[][] board = new CellType[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                board[i][j] = CellType.WATER;
            }
        }
        return board;
    }

    public void printBoard(CellType[][] board) {
        String[][] boardForPrint = new String[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (board[i][j] == CellType.WATER) {
                    boardForPrint[i][j] = "W";
                } else if (board[i][j] == CellType.HIT) {
                    boardForPrint[i][j] = "H";
                } else if (board[i][j] == CellType.MISS) {
                    boardForPrint[i][j] = "M";
                } else {
                    boardForPrint[i][j] = "S";
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(Arrays.toString(boardForPrint[i]));
        }
    }

}
