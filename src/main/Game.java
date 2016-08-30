package main;

import javax.swing.JFrame;

public class Game {

    public static void main(String[] args) {
            //Test git
            JFrame window = new JFrame();
            window.setTitle("State Based Game");
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           
            window.setContentPane(new GamePanel());
           
            window.setResizable(false);
            window.pack();
            window.setVisible(true);
           
    }
}
