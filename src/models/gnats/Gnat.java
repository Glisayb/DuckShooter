package models.gnats;

import java.awt.*;


public class Gnat extends Insect implements IFilterImage {

    String pathLeft;
    String pathRight;
    double ySpawn = (double) Math.random();
    double movingDistortion = Math.random();
    boolean startLeft = (Math.random() > 0.6);
    String path;

    public Gnat(int hp, int points, String pathLeft, String pathRight) {
        super(hp, points);
        this.pathLeft = pathLeft;
        this.pathRight = pathRight;
        this.path = (startLeft ? pathLeft : pathRight);
    }

    public Image getImage() {
        return IFilterImage.filterImage(this.path);
    }
}
