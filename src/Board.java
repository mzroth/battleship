import java.util.Arrays;

public class Board {

    //Creation of the enum for use in Board objects
    enum CellType {
        HIT, MISS, WATER, SHIP;
    }

    //Creation of the Cell class that contains row and col integers for referencing specific tiles
    //TODO: make this it's own class and update the board to be a 2D array of cells.
    public class Cell {
        private Integer row;
        private Integer col;

        public Cell(Integer row, Integer col) {
            this.row = row;
            this.col = col;
        }

        public Integer getRow() {
            return row;
        }

        public Integer getCol() {
            return col;
        }
    }

    // Board constructor
    //TODO: maybe integrate the createBoard() function into the constructor so it doesn't have to be called.
    public Board() {

    }

    //creates a board 2D array
    public CellType[][] createBoard() {
        CellType[][] board = new CellType[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                board[i][j] = CellType.WATER;
            }
        }
        return board;
    }

    //Checks the CellType of a specific cell
    public CellType checkType(CellType[][] board, Cell cell) {
        CellType type = board[cell.getRow()][cell.getCol()];
        return type;
    }

    //Changes a cell type in the advent of a turn
    public CellType[][] changeCell(CellType[][] board, CellType type, Cell cell) {
        board[cell.getRow()][cell.getCol()] = type;
        return board;
    }

    //Checks to see if there is a SHIP still on the board
    public Boolean checkShip(CellType[][] board) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (board[i][j] == CellType.SHIP) {
                    return true;
                }
            }
        }
        return false;
    }

    //Used for printing a board for the player's to see. Incorporates a grid system to refer to cells with.
    //TODO: eventually I want to improve the board UI
    public void printBoard(CellType[][] board) {
        String columnNames = "    A  B  C  D  E  F  G  H  I  J";
        //removed for appearance not sure if it is functionally better to do it like this though
        //String[] columnNames = new String[] {" ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        String[] rowNums = new String[] {" 1 ", " 2 ", " 3 ", " 4 ", " 5 ", " 6 ", " 7 ", " 8 ", " 9 ", "10 "};
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
        System.out.println(columnNames);
        for (int i = 0; i < 10; i++) {
            System.out.println(rowNums[i] + Arrays.toString(boardForPrint[i]));
        }
    }
}
