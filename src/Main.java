/**
 * Created with IntelliJ IDEA.
 * User: anti
 * Date: 22.07.13
 * Time: 2:32
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args){
        Field field = new Field(3);
        field.display();
        field.setCell(0,0,'X');
        field.setCell(0,1,'X');
        field.display();
        field.eraseColum(0);
        field.display();
    }
}
