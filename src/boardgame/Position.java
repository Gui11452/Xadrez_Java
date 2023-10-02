package boardgame;

public class Position {
    
    private int row;
    private int column;

    public Position(int row, int column){
        this.row = row;
        this.column = column;
    }

    public void setValues(int row, int column){
        setRow(row);
        setColumn(column);
    }

    public int getRow(){
        return this.row;
    }

    public void setRow(int value){
        this.row = value;
    }

    public int getColumn(){
        return this.column;
    }

    public void setColumn(int value){
        this.column = value;
    }

    @Override
    public String toString(){
        return row + ", " + column;
    }

}
