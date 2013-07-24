/**
 * Created with IntelliJ IDEA.
 * User: anti
 * Date: 22.07.13
 * Time: 1:33
 * To change this template use File | Settings | File Templates.
 */
public class Field {
    private final int fieldSize;

    private final char DEAFAULT_CELL_VALUE = '_';

    private char[][] field;

    public Field(int size){
        fieldSize= size;
        field  = new char[fieldSize][fieldSize];
        eraseField();
    }

    public void setCell(int x,int y, char c){
        field[y][x]=c;
    }

    public char getCell(int x,int y){
        return field[y][x];
    }

    public void eraseField(){
        for(int i=0;i<fieldSize;i++){
            eraseColum(i);
        }
    }

    private void eraseColum(int i) {
        for(int j =0;j<fieldSize;j++){
            field[j][i]=DEAFAULT_CELL_VALUE;
        }
    }

    public void display(){
        for(int i=0;i<fieldSize;i++){
            for(int j=0;j<fieldSize;j++){
                System.out.print(field[i][j]+" ");
            }
            System.out.println();

        }
    }

}
