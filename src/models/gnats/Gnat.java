package models.gnats;

import com.company.StaticClasses;

import javax.swing.*;
import java.awt.*;
import java.awt.image.FilteredImageSource;
import java.awt.image.ImageFilter;
import java.awt.image.ImageProducer;

public class Gnat extends Insect{

    String pathLeft;
    String pathRight;
    double ySpawn = (double) Math.random();
    double movingDistortion = Math.random();
    boolean startLeft = (Math.random()>0.6);
    String path = startLeft?pathLeft:pathRight;
    Image image;



    public Gnat(int hp, int points){

        super(hp, points);
        setImage(path);
    }

    public void setImage (String path){
        Image gnat = new ImageIcon(path).getImage();
        ImageFilter bgFilter = new StaticClasses.BackgroundFilter();
        ImageProducer ip = new FilteredImageSource(gnat.getSource(), bgFilter);
        gnat = Toolkit.getDefaultToolkit().createImage(ip);
        this.image = gnat;
    }
    public Image getImage (){
        return image;
    }

}
