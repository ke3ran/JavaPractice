package ru.ke3ran.metod2.lab16.ex2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AroundTheMoscow extends JFrame{


    public AroundTheMoscow() {
        super("Moscow");

        Button center = new Button("Центр");
        center.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в ЦАО", "Приветствие", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        Button north = new Button("Север");
        north.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в САО", "Приветствие", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        Button south = new Button("Юг");
        south.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в ЮАО", "Приветствие", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        Button west = new Button("Запад");
        west.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в ЗАО", "Приветствие", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        Button east = new Button("Восток");
        east.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в ВАО", "Приветствие", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        Container container = getContentPane();
        container.add(center, BorderLayout.CENTER);
        container.add(north, BorderLayout.NORTH);
        container.add(south, BorderLayout.SOUTH);
        container.add(west, BorderLayout.WEST);
        container.add(east, BorderLayout.EAST);

        setSize(400, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new AroundTheMoscow();
    }

}
