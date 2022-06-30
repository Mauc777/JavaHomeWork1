package Queen777;

public class Position {
    private int row;
    private int column;

    public int getRow(){
        return row;
    }

    public int getColumn(){
        return column;
    }

    public Position(int row, int column){
        this.row = row;
        this.column=column;
    }

    public boolean Attak(Position position){
        // row
        if(this.row == position.getRow()) {
            return true;
        }
        // column
        if(this.column == position.getColumn()){
            return true;
        }

        // Diag
        int rowOffset = Math.abs(this.row - position.getRow());
        int colOffset = Math.abs(this.column - position.getColumn());
        if(rowOffset == colOffset){
            return true;
        }

        return false;
    }
    
}
