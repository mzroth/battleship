public class Main {
    public static void main(String[] args) {
        System.out.println("hello world");
        Board test = new Board();
        Board.CellType[][] board = test.createBoard();
        test.printBoard(board);
    }
}
