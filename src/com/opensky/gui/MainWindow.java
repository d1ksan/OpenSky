package com.opensky.gui;

import java.awt.*;
import javax.swing.*;

public class MainWindow {
    private JFrame frame;
    private WeatherPanel weatherPanel;
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MainWindow().createAndShowGUI();
        });
    }
    
    private void createAndShowGUI() {
        frame = new JFrame("OpenSky");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 350);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BorderLayout());

        JPanel buttonPanel = createButtonPanel();
        weatherPanel = new WeatherPanel();
        frame.add(buttonPanel, BorderLayout.NORTH);
        frame.add(weatherPanel, BorderLayout.CENTER);
        frame.setVisible(true);
    }
    
    private JPanel createButtonPanel() {
        JPanel panel = new JPanel();
        panel.setBackground(new Color(220, 220, 240));
        
        JButton mscButton = new JButton("Москва");
        JButton mhkButton = new JButton("Махачкала");
        
        mscButton.setFont(new Font("Arial", Font.BOLD, 14));
        mhkButton.setFont(new Font("Arial", Font.BOLD, 14));
        mscButton.setBackground(new Color(100, 150, 200));
        mhkButton.setBackground(new Color(100, 150, 200));
        mscButton.setForeground(Color.BLACK);
        mhkButton.setForeground(Color.BLACK);
        
        mscButton.addActionListener(e -> weatherPanel.showWeather("Москва"));
        mhkButton.addActionListener(e -> weatherPanel.showWeather("Махачкала"));
        
        panel.add(mscButton);
        panel.add(mhkButton);
        
        return panel;
    }
}