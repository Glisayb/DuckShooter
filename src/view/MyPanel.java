package view;

import com.company.Main;
import com.company.StaticClasses;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.FilteredImageSource;
import java.awt.image.ImageFilter;
import java.awt.image.ImageProducer;
import java.util.Random;

public class MyPanel extends JPanel implements ActionListener {

    final int panelWidth = 640;
    final int panelHight = 450;
    Image background;
    Image gnat1;
    Timer timer;
    int xVelo = 5;
    int yVelo = 1;
    int x;
    int y;
    int n;
    int spawnRatio;

    MyPanel(){

        this.setPreferredSize(new Dimension(panelWidth,panelHight));
        background = new ImageIcon("jezioro1.jpeg").getImage();

        gnat1 = new ImageIcon("komar1right.png").getImage();
        ImageFilter bgFilter = new StaticClasses.BackgroundFilter();
        ImageProducer ip = new FilteredImageSource(gnat1.getSource(), bgFilter);
        gnat1 = Toolkit.getDefaultToolkit().createImage(ip);

        timer = new Timer(100,this);
        timer.start();
        y = (int) (Math.random()*400);
        n = (int) (Math.random()*10);
    }

    public void paint(Graphics gui) {
        var rand = new Random();
        var gnats = Main.gnats;

        Graphics2D gui2d = (Graphics2D) gui;
        gui2d.drawImage(background,0,0,null);
        if (gnats.isEmpty() == false) {
            gui2d.drawImage(gnats.get(rand.nextInt(gnats.size()-1)).getImage(), x, y, null);
        }
        gui2d.drawString("21:37",getWidth()-30,15);
        System.out.println(gnats.size());

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        x = x + xVelo;
        y = y + (n%20-10)*yVelo;
        n++;
        repaint();
    }
}
