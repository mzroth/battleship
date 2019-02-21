public class Main {
    public static void main(String[] args) {
        System.out.println("hello world");
        Board test = new Board();
        Board.CellType[][] board = test.createBoard();
        Board.Cell cell = test.new Cell(0,2);
        System.out.println(test.checkShip(board));
        test.changeCell(board, Board.CellType.SHIP, cell);
        test.printBoard(board);
        System.out.println(test.checkType(board, cell));
        System.out.println(test.checkShip(board));

    }
}
