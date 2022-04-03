package com.saltimure.app.sandbox;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createGUI();
            }
        });
    }
    
    public static void createGUI() {
        //Creating jframe
        JFrame jframe = new JFrame("Main");
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Creating label
        JLabel label = new JLabel("MainLabel");
        jframe.getContentPane().add(label);
        //Window display
        jframe.pack();
        jframe.setVisible(true);
    }

}
