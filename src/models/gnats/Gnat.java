package models.gnats;

import com.company.Main;
import view.Lives;
import view.MyPanel;

import java.awt.*;


public class Gnat extends Insect implements IFilterImage {

    String pathLeft;
    String pathRight;
    String path;
    boolean startLeft = (Math.random() > 0.6);
    double ySpawn = (double) Math.random();
    double movingDistortion = Math.random();
    int speed = 3;
    int y = (int) (Math.random()*400 + 10);
    int x = startLeft?0:640;


    public Gnat(int hp, int points, String pathLeft, String pathRight) {
        super(hp, points);
        this.pathLeft = pathLeft;
        this.pathRight = pathRight;
        this.path = (startLeft ? pathLeft : pathRight);
    }

    public Image getImage() {
        return IFilterImage.filterImage(this.path);
    }
    public String getPath() {
        return path;
    }
    public void gnatSurvived(Gnat gnat){
        Main.gnats.remove(gnat);
        Main.lives.reduceLives();
    }
    public void gnatKilled(Gnat gnat){
        Main.gnats.remove(gnat);
        Main.points.addPoints(points);
    }
    public void moveGnat(){

    }
}
