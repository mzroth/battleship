public class Main {
    public static void main(String[] args) {
        Board player1Board = new Board();
        Cell[][] player1Cells = player1Board.getCells();
        player1Board.print();
        System.out.println(player1Board.checkShip());

        Player player1 = new Player("Mark");
        System.out.println(player1.getName());

        Ship ship = new Ship(4, Direction.HORIZONTAL, player1Cells[1][2]);
        ship.placeShip(player1Board);
        player1Board.print();
        System.out.println(player1Board.checkShip());

        Ship ship2 = new Ship(3, Direction.VERTICAL, player1Cells[3][3]);
        ship2.placeShip(player1Board);
        player1Board.print();

    }
}
