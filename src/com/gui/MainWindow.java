package com.gui;
import java.awt.BorderLayout;

import javax.swing.*;

public class MainWindow {
    public static void main(String[] args){
        JFrame frame = new JFrame("OpenSky");
        JPanel buttonsPanel = new JPanel();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,600);
        frame.setLocationRelativeTo(null);
        JButton msc = new JButton("Москва");
        JButton mhk = new JButton("Махачкала");
        buttonsPanel.add(msc);
        buttonsPanel.add(mhk);
        frame.getContentPane().add(BorderLayout.NORTH, buttonsPanel);
        frame.setVisible(true);
    }
}
