public class Main {
    public static void main(String[] args) {
        System.out.println("hello world");
        Board test = new Board();
        Board.CellType[][] board = test.createBoard();
        test.changeCell(board, Board.CellType.SHIP, 1, 3);
        test.printBoard(board);
    }
}
