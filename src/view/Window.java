package view;

import javax.swing.*;

public class Window extends JFrame implements Runnable {

    MyPanel panel;

    public Window() {

        panel = new MyPanel();

        add(panel);
        pack();
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    @Override
    public void run() {

    }
}
