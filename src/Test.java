import java.util.concurrent.atomic.AtomicMarkableReference;

public class Test {
    public static void main(String[] args) {

        ////test creating a board and verifying there is no ship
        //Board player1Board = new Board();
        //player1Board.print();
        //System.out.println("There is a ship: " + player1Board.checkForShip());
//
        ////tests placing a ship horizontal and out of bounds
        //Cell cell1 = new Cell(1, 2, CellType.SHIP);
        //player1Board.placeShip(cell1, 4, Direction.HORIZONTAL);
        //player1Board.print();
        //Cell cell2 = new Cell(1, 7, CellType.SHIP);
        //player1Board.placeShip(cell2, 4, Direction.HORIZONTAL);
//
        ////tests making sure a ship is still on the board
        //System.out.println("There is a ship: " + player1Board.checkForShip());
//
        ////tests placing a ship vertical valid and out of bounds
        //Cell cell3 = new Cell(3,3,CellType.SHIP);
        //player1Board.placeShip(cell3, 3, Direction.VERTICAL);
        //player1Board.print();
        //Cell cell4 = new Cell(8,3,CellType.SHIP);
        //player1Board.placeShip(cell4, 3, Direction.VERTICAL);
//
        ////tests placement of a ship on top of another
        //Cell cell5 = new Cell(3,2,CellType.SHIP);
        //player1Board.placeShip(cell5,4,Direction.HORIZONTAL);
        //Cell cell6 = new Cell(0,4,CellType.SHIP);
        //player1Board.placeShip(cell6,3, Direction.VERTICAL);
//
        ////tests the player class
        //Player player1 = new Player("Mark");
        //System.out.println(player1.getName());
        Game game = new Game();

    }
}
