package view;

import javax.swing.*;

public class Window extends JFrame implements Runnable {

    public Window() {

        JPanel panel = new JPanel();

        add(panel);
        setSize(640,480);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        run();

    }

    @Override
    public void run() {

    }
}
