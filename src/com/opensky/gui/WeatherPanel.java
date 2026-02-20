package com.opensky.gui;

import java.awt.*;
import javax.swing.*;

public class WeatherPanel extends JPanel {
    private JLabel cityLabel;
    private JLabel tempLabel;
    private JLabel descLabel;
    private JLabel humidityLabel;
    private JLabel windLabel;
    
    public WeatherPanel() {
        setupPanel();
        createLabels();
        layoutLabels();
        
        // Показываем сообщение по умолчанию
        showWeather("default");
    }
    
    private void setupPanel() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        setBackground(new Color(240, 248, 255)); // Светло-голубой
    }
    
    private void createLabels() {
        // Город
        cityLabel = new JLabel("", SwingConstants.CENTER);
        cityLabel.setFont(new Font("Arial", Font.BOLD, 24));
        cityLabel.setForeground(new Color(50, 50, 150));
        cityLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        // Температура
        tempLabel = new JLabel("", SwingConstants.CENTER);
        tempLabel.setFont(new Font("Arial", Font.BOLD, 48));
        tempLabel.setForeground(new Color(0, 100, 200));
        tempLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        // Описание
        descLabel = new JLabel("", SwingConstants.CENTER);
        descLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        descLabel.setForeground(new Color(80, 80, 80));
        descLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        // Влажность
        humidityLabel = new JLabel("", SwingConstants.CENTER);
        humidityLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        humidityLabel.setForeground(new Color(100, 100, 100));
        humidityLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        // Ветер
        windLabel = new JLabel("", SwingConstants.CENTER);
        windLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        windLabel.setForeground(new Color(100, 100, 100));
        windLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
    }
    
    private void layoutLabels() {
        add(Box.createVerticalGlue());
        add(cityLabel);
        add(Box.createRigidArea(new Dimension(0, 10)));
        add(tempLabel);
        add(Box.createRigidArea(new Dimension(0, 5)));
        add(descLabel);
        add(Box.createRigidArea(new Dimension(0, 20)));
        add(humidityLabel);
        add(Box.createRigidArea(new Dimension(0, 5)));
        add(windLabel);
        add(Box.createVerticalGlue());
    }
    
    public void showWeather(String city) {
        if (city.equals("Москва")) {
            cityLabel.setText("МОСКВА");
            tempLabel.setText("-5°C");
            descLabel.setText("Облачно, снег");
            humidityLabel.setText("💧 Влажность: 82%");
            windLabel.setText("💨 Ветер: 4.6 м/с");
        } 
        else if (city.equals("Махачкала")) {
            cityLabel.setText("МАХАЧКАЛА");
            tempLabel.setText("12°C");
            descLabel.setText("Солнечно");
            humidityLabel.setText("💧 Влажность: 65%");
            windLabel.setText("💨 Ветер: 3.2 м/с");
        }
        else {
            cityLabel.setText("OpenSky");
            tempLabel.setText("🌤️");
            descLabel.setText("Выберите город");
            humidityLabel.setText("");
            windLabel.setText("");
        }
    }
}