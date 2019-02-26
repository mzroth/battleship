public class Ship {

    private Integer length;
    private Direction direction;
    private Cell startCell;

    public Ship (Integer length, Direction direction, Cell startCell) {
        this.length = length;
        this.direction = direction;
        this.startCell = startCell;
    }

    public void checkShip() {
        
    }

    public void placeShip(Board board) {
        switch (direction) {
            case HORIZONTAL:
                for (int i = 0; i < length; i++) {
                    board.getCells()[startCell.getRow()][startCell.getCol() + i].setType(CellType.SHIP);
                }
                break;
            default:
                for (int i = 0; i < length; i++) {
                    board.getCells()[startCell.getRow() + i][startCell.getCol()].setType(CellType.SHIP);
                }
                break;
        }
    }


}
