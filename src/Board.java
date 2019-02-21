import java.util.Arrays;

public class Board {

    enum CellType {
        HIT, MISS, WATER, SHIP;
    }

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

    public CellType checkType(CellType[][] board, Cell cell) {
        CellType type = board[cell.getRow()][cell.getCol()];
        return type;
    }


    public CellType[][] changeCell(CellType[][] board, CellType type, Cell cell) {
        board[cell.getRow()][cell.getCol()] = type;
        return board;
    }

    public Boolean checkShip(CellType[][] board) {
        Boolean ship = false;
        outer: for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (board[i][j] == CellType.SHIP) {
                    ship = true;
                    break outer;
                }
            }
        }
        return ship;
    }

    public void printBoard(CellType[][] board) {
        String[] columnNames = new String[] {" ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
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
        System.out.println(Arrays.toString(columnNames));
        for (int i = 0; i < 10; i++) {
            System.out.println(rowNums[i] + Arrays.toString(boardForPrint[i]));
        }
    }
}
