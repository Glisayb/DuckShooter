package view;

import com.company.Main;
import models.gnats.IFilterImage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MyPanel extends JPanel implements ActionListener, IFilterImage {

    final int panelWidth = 640;
    final int panelHight = 420;
    Image background;
    Image gnat1;
    Timer timer;
    int xVelo = 5;
    int yVelo = 1;
    int x;
    int y;
    int n = (int) (Math.random()*10);
    int licznik = 0;
    int spawnRatio;
    int delay = 100;
    String time;

    MyPanel(){

        this.setPreferredSize(new Dimension(panelWidth,panelHight));
        background = new ImageIcon("jezioro1.jpeg").getImage();

        gnat1 = IFilterImage.filterImage("komar1right.png");

        timer = new Timer(delay,this);
        timer.start();
        y = (int) (Math.random()*400);

    }

    public void paint(Graphics gui) {
        var rand = new Random();

        Image gnat3 = Main.gnats.get(rand.nextInt(Main.gnats.size()-1)).getImage();

        Graphics2D gui2d = (Graphics2D) gui;
        gui2d.drawImage(background,0,0,null);
        if (Main.gnats.isEmpty() == false) {
            gui2d.drawImage(gnat1, x, y, null);
        }
        gui2d.drawString(time,getWidth()-30,15);
        System.out.println(Main.gnats.size());

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        x = x + xVelo;
        y = y + (n%20-10)*yVelo;
        n++;
        licznik++;
        time = (licznik/60000*delay+":"+licznik/1000*delay);
        repaint();
    }

    public int getPanelWidth() {
        return panelWidth;
    }
    public int getPanelHight() {
        return panelHight;
    }
}
