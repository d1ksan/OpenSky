package com.gui;
import javax.swing.*;

public class MainWindow {
    public static void main(String[] args){
        JFrame frame = new JFrame("OpenSky");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
