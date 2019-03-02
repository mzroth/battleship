import java.util.Scanner;

public class Game {

    private static final Integer CARRIER = 5;
    private static final Integer BATTLESHIP = 4;
    private static final Integer CRUISER = 3;
    private static final Integer SUBMARINE = 3;
    private static final Integer DESTROYER = 2;

    private Player player1;
    private Player player2;

    private Board player1ShipBoard;
    private Board player1AttackBoard;
    private Board player2ShipBoard;
    private Board player2AttackBoard;

    private final String ANSI_CLS = "\u001b[2J";
    private final String ANSI_HOME = "\u001b[H";

    public Game() {
        Scanner reader = new Scanner(System.in);
        startGame(reader);


    }

    private void startGame(Scanner reader) {
        String player1Name = userInput("Player 1 please enter your name: ", reader);
        this.player1 = new Player(player1Name);
        this.player1AttackBoard = new Board();
        this.player1ShipBoard = new Board();
        String player2Name = userInput("Player 2 please enter your name: ", reader);
        this.player2 = new Player(player2Name);
        this.player2AttackBoard = new Board();
        this.player2ShipBoard = new Board();
        passComputer(player1, reader);
        placeShips(reader, player1ShipBoard, player1);
        passComputer(player2, reader);
        placeShips(reader, player2ShipBoard, player2);
    }

    private void placeShips(Scanner reader, Board board, Player player) {
        System.out.println(player.getName() + "'s Board");
        board.print();
        startShip(reader, CARRIER, "Carrier", board);
        clearScreen();
        System.out.println(player.getName() + "'s Board");
        board.print();
        startShip(reader, BATTLESHIP, "Battleship", board);
        clearScreen();
        System.out.println(player.getName() + "'s Board");
        board.print();
        startShip(reader, CRUISER, "Cruiser", board);
        clearScreen();
        System.out.println(player.getName() + "'s Board");
        board.print();
        startShip(reader, SUBMARINE, "Submarine", board);
        clearScreen();
        System.out.println(player.getName() + "'s Board");
        board.print();
        startShip(reader, DESTROYER, "Destroyer", board);
    }

    private void passComputer(Player player, Scanner reader) {
        String nextStep = "n";
        while (!nextStep.equalsIgnoreCase("y")) {
            nextStep = userInput("Please pass the computer to " + player.getName() + " and press 'y': ", reader);
        }
        clearScreen();
    }

    private void startShip(Scanner reader, Integer shipLength, String shipName, Board board) {
        System.out.println("Please select a starting square and direction for your " + shipName + ": size " + shipLength);
        String dir = "";
        Direction direction = null;
        boolean placed = false;
        while (!placed) {
            while ((!dir.equalsIgnoreCase("v") && (!dir.equalsIgnoreCase("h")))) {
                dir = userInput("Direction horizontal or vertical (h/v): ", reader);
                switch (dir) {
                    case "h":
                        direction = Direction.HORIZONTAL;
                        break;
                    case "v":
                        direction = Direction.VERTICAL;
                        break;
                    default:
                        System.out.println("Please select 'h' or 'v': ");
                        break;
                }
            }
            String startSpace = "";
            while (startSpace.length() != 2) {
                startSpace = userInput("Start space (List capital letter then number): ", reader);
                String[] startColRow = startSpace.split("");
                if (startColRow.length == 2) {
                    Integer col = startColRow[0].codePointAt(0) - 65;
                    Integer row = Integer.valueOf(startColRow[1]) - 1;
                    if (row >= 0 && row <= 9) {
                        if (col >= 0 && col <= 9) {
                            Cell startCell = new Cell(row, col, CellType.SHIP);
                            placed = board.placeShip(startCell, shipLength, direction);
                        } else {
                            System.out.println("Please make sure to put the column first and use capital letters");
                        }
                    } else {
                        System.out.println("Please stop trying to break my code Eric");
                    }
                } else {
                    System.out.println("Please pick a square and type only the column letter and row number");
                }
            }
            if (!placed) {
                System.out.println("Your ship cannot go here");
                dir = "";
            }
        }
    }

    private String userInput(String text, Scanner reader) {
        System.out.println(text);
        return reader.next();
    }

    private void clearScreen() {
        System.out.print(ANSI_CLS + ANSI_HOME);
        System.out.flush();
    }

}
