public class Main {
    public static void main(String[] args) {
        Board player1Board = new Board();
        Cell[][] player1Cells = player1Board.getCells();
        player1Board.print();
        System.out.println(player1Board.checkShip());
        player1Cells[1][2].setType(CellType.SHIP);
        player1Board.print();
        System.out.println(player1Board.checkShip());

        Player player1 = new Player("Mark");
        System.out.println(player1.getName());

    }
}
