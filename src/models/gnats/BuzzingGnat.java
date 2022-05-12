package models.gnats;

import java.awt.*;


public class BuzzingGnat extends Gnat{
    GnatTypes type = GnatTypes.Buzzing;

    String pathLeft = "komar1left.png";
    String pathRight = "komar1right.png";

    public BuzzingGnat(int hp, int points){
        super(hp, points);
    }

    @Override
    public void setImage(String path) {
        super.setImage(path);
    }

    @Override
    public Image getImage() {
        return super.getImage();
    }
}
