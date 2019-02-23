import java.util.Arrays;

public class Board {
    private static final int BOARD_SIZE = 10;
    private Cell[][] cells;

    // Board constructor
    public Board() {
        cells = createCells();

    }

    //Getters and Setters
    public Cell[][] getCells() { return cells; }

    //creates a 2D array of Cells
    private Cell[][] createCells() {
        Cell[][] cells = new Cell[BOARD_SIZE][BOARD_SIZE];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                cells[i][j] = new Cell(i, j, CellType.WATER);
            }
        }
        return cells;
    }

    //Checks to see if there is a SHIP still on the board
    public Boolean checkShip() {
        for (Cell[] cellRow : cells) {
            for (Cell cell : cellRow) {
                if (cell.getType() == CellType.SHIP) {
                    return true;
                }
            }
        }
        return false;
    }

    //Used for printing a board for the player's to see. Incorporates a grid system to refer to cells with.
    //TODO: eventually I want to improve the board UI
    public void print() {
        String columnNames = "    A  B  C  D  E  F  G  H  I  J";
        //removed for appearance not sure if it is functionally better to do it like this though
        //String[] columnNames = new String[] {" ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        String[] rowNums = new String[] {" 1 ", " 2 ", " 3 ", " 4 ", " 5 ", " 6 ", " 7 ", " 8 ", " 9 ", "10 "};
        String[][] boardForPrint = new String[cells.length][cells[0].length];
        for (Cell[] cellRow : cells) {
            for (Cell cell: cellRow) {
                boardForPrint[cell.getRow()][cell.getCol()] = cell.getType().getDisplayValue();
            }
        }
        System.out.println(columnNames);
        for (int i = 0; i < 10; i++) {
            System.out.println(rowNums[i] + Arrays.toString(boardForPrint[i]));
        }
    }
}
