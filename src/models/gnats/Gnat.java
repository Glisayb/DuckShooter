package models.gnats;

import com.company.Main;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Gnat extends Insect implements IFilterImage, MouseListener {

    private boolean active = true;
    private boolean startLeft;
//    private final String pathLeft;
//    private final String pathRight;
    private final String path;
    private int xDistortion = (int) (Math.random()*2);
    private int yDistortion = (int) (Math.random()*2);
    private int xSpeed = 2;
    private int ySpeed = 2;
    private int x;
    private int y = (int) (Math.random()*300 + 10);

    public Gnat(int hp, int points, String pathLeft, String pathRight) {
        super(hp, points);
        this.startLeft = (Math.random() > 0.6);
        this.path = (startLeft ? pathLeft : pathRight);
        this.x = startLeft?-200:640;
    }

    //gnat getters
    public Image getImage() {
        return IFilterImage.filterImage(this.path);
    }
    public String getPath() {
        return path;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public boolean isActive() {return active;}
    //gnat setter
    public void setActive() {
        this.active = true;
    }

    //gnat endings
    public void gnatSurvived(Gnat gnat){
        Main.gnats.remove(gnat);
        Main.lives.reduceLives();
        System.out.println("Uciekł Ci komarek");
    }
    public void gnatKilled(Gnat gnat){
        Main.gnats.remove(gnat);
        Main.points.addPoints(points);
        System.out.println("Zabiłeś komarka :(");
    }
    // gnat cartesian
    public void moveGnat(int n){
        x += ((n%10-xDistortion)+xSpeed)*(startLeft?1:(-1));
        y += (n%10-5+yDistortion)*ySpeed;
    }


    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
