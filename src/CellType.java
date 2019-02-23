public enum CellType {

    //creation of enum for use in cells and board
    HIT("H"), MISS("M"), WATER("W"), SHIP("S");

    private String displayValue;

    CellType(String displayValue) {
        this.displayValue = displayValue;
    }

    public String getDisplayValue() {
        return displayValue;
    }

}
