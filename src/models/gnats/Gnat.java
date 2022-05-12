package models.gnats;

import java.awt.*;


public class Gnat extends Insect implements IFilterImage {

    String pathLeft;
    String pathRight;
    double ySpawn = (double) Math.random();
    double movingDistortion = Math.random();
    boolean startLeft = (Math.random() > 0.6);
    String path = (startLeft ? pathLeft : pathRight);

    public Gnat(int hp, int points) {
        super(hp, points);
    }

    public Image getImage() {
        return IFilterImage.filterImage(this.path);
    }
}
