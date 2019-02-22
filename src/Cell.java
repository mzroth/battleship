public class Cell {

    //Creation of the Cell class that contains row and col integers for referencing specific tiles
    private Integer row;
    private Integer col;
    private CellType type;

    public Cell(Integer row, Integer col, CellType type) {
        this.row = row;
        this.col = col;
        this.type = type;
    }

    //Getters and Setters
    public void setRow(Integer row) { this.row = row; }

    public void setCol(Integer col) { this.col = col; }

    public void setType(CellType type) { this.type = type; }

    public Integer getRow() { return row; }

    public Integer getCol() { return col; }

    public CellType getType() { return type; }
}


