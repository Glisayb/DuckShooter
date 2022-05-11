package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel implements ActionListener {

    final int panelWidth = 640;
    final int panelHight = 450;
    Image background;
    Image gnat1;
    Timer timer;
    int xVelo = 5;
    int yVelo = 2;
    int x;
    int y;

    MyPanel(){

        this.setPreferredSize(new Dimension(panelWidth,panelHight));
        background = new ImageIcon("jezioro1.jpeg").getImage();

        gnat1 = new ImageIcon("komar1.png").getImage();

        timer = new Timer(100,this);
        timer.start();
    }

    public void paint(Graphics gui) {

        y = (int) (Math.random()*400);
        Graphics2D gui2d = (Graphics2D) gui;
        gui2d.drawImage(background,0,0,null);
        gui2d.drawImage(gnat1,x,y,null);
        gui2d.drawString("21:37",getWidth()-30,15);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        x = x + xVelo;
        // co tu kurwa nie dziala
//        if (timer%1000 > 500)
        y = y - yVelo;
        repaint();

    }
}
