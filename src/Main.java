public class Main {
    public static void main(String[] args) {
        Board player1Board = new Board();
        player1Board.print();
        System.out.println("There is a ship: " + player1Board.checkForShip());

        Cell cell1 = new Cell(1, 2, CellType.SHIP);
        player1Board.placeShip(cell1, 4, Direction.HORIZONTAL);
        player1Board.print();
        Cell cell2 = new Cell(1, 7, CellType.SHIP);
        player1Board.placeShip(cell2, 4, Direction.HORIZONTAL);
        System.out.println("There is a ship: " + player1Board.checkForShip());

        Cell cell3 = new Cell(3,3,CellType.SHIP);
        player1Board.placeShip(cell3, 3, Direction.VERTICAL);
        player1Board.print();
        Cell cell4 = new Cell(8,3,CellType.SHIP);
        player1Board.placeShip(cell4, 3, Direction.VERTICAL);

        Player player1 = new Player("Mark");
        System.out.println(player1.getName());

    }
}
