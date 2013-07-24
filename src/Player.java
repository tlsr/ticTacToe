/**
 * Created with IntelliJ IDEA.
 * User: anti
 * Date: 24.07.13
 * Time: 3:56
 * To change this template use File | Settings | File Templates.
 */
import java.io.InputStream;
import java.lang.*;
public class Player {

    private String name;

    private boolean isHuman;

    private InputStream stream;

    public Player(){
        this.name = "UnNamed";
        isHuman=false;
        this.stream = System.in;
    }

    public Player(String name, boolean isHuman, InputStream stream){
        this.name=name;
        this.isHuman=isHuman;
        this.stream=stream;
    }


    public boolean isHuman() {
        return isHuman;
    }

    private void setHuman(boolean human) {
        isHuman = human;
    }

    public void display(){
        System.out.println("Name: "+name);
    }
}
