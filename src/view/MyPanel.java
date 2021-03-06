package view;

import com.company.Main;
import models.gnats.Gnat;
import models.gnats.IFilterImage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MyPanel extends JPanel implements ActionListener, IFilterImage {

    final int panelWidth = 640;
    final int panelHight = 420;
    Image background;
    Image gnat1;
    Timer timer;
    int y;
    int n = (int) (Math.random()*10);
    int licznik = 0;
    int delay = 100;
    String time;

    MyPanel(){

        this.setPreferredSize(new Dimension(panelWidth,panelHight));
        background = new ImageIcon("jezioro1.jpeg").getImage();

        gnat1 = IFilterImage.filterImage(Main.gnats.get(0).getPath());


        timer = new Timer(delay,this);
        timer.start();
        y = (int) (Math.random()*400);

    }

    public void paint(Graphics gui) {

        Graphics2D gui2d = (Graphics2D) gui;
        gui2d.drawImage(background,0,0,null);
        for(Gnat gnat : Main.gnats) {
            if (gnat.isActive()) {
                gui2d.drawImage(gnat1, gnat.getX(), gnat.getY(), null);
            }
        }
        gui2d.drawString(time,getWidth()-30,15);
        gui2d.drawString("Lives : "+Main.lives.getLives(),getWidth()-160,15);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Main.gnats.get(0).moveGnat(n);
        for(Gnat gnat : Main.gnats) {
            if (gnat.isActive()) {
                gnat.moveGnat(n);
            }
        }
        for(Gnat gnat : Main.gnats) {
            if (-210 > gnat.getX() || gnat.getX() > panelWidth) {
                Main.gnats.get(0).gnatSurvived(Main.gnats.get(0));
            }
        }
        if (Main.lives.getLives() <= 0){
            timer.stop();
        }

        n++;
        licznik++;
        time = (licznik/60000*delay+":"+licznik/1000*delay);
        repaint();
//        x = x + xVelo;
//        y = y + (n%20-10)*yVelo;

    }

    public int getPanelWidth() {
        return panelWidth;
    }
    public int getPanelHight() {
        return panelHight;
    }
}
