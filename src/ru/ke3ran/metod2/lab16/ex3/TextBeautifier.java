package ru.ke3ran.metod2.lab16.ex3;

import javax.swing.*;
import java.awt.*;

public class TextBeautifier extends JFrame {

    Font timesNewRoman = new Font("Times New Roman", Font.PLAIN, 20);
    Font sansSerif = new Font("Serif", Font.PLAIN, 24);
    Font courierNew = new Font("Courier", Font.PLAIN, 28);

    Color blue = Color.BLUE;
    Color black = Color.BLACK;
    Color red = Color.RED;

    public TextBeautifier() {
        super("Text Beautifier");
        this.setSize(500, 300);

        TextArea textArea = new TextArea("", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
        this.getContentPane().add(textArea);

        MenuBar menuBar = new MenuBar();
        this.setMenuBar(menuBar);
        Menu color = new Menu("Color");
        Menu font = new Menu("Font");
        menuBar.add(color);
        menuBar.add(font);

        MenuItem timesItem = new MenuItem("Times New Roman");
        timesItem.addActionListener(e -> textArea.setFont(timesNewRoman));
        font.add(timesItem);

        MenuItem sansSerifItem = new MenuItem("MS Sans Serif");
        sansSerifItem.addActionListener(e -> textArea.setFont(sansSerif));
        font.add(sansSerifItem);

        MenuItem courierItem = new MenuItem("Courier New");
        courierItem.addActionListener(e -> textArea.setFont(courierNew));
        font.add(courierItem);

        MenuItem redItem = new MenuItem("Red");
        redItem.addActionListener(e -> textArea.setForeground(red));
        color.add(redItem);

        MenuItem blueItem = new MenuItem("Blue");
        blueItem.addActionListener(e -> textArea.setForeground(blue));
        color.add(blueItem);

        MenuItem blackItem = new MenuItem("Black");
        blackItem.addActionListener(e -> textArea.setForeground(black));
        color.add(blackItem);

        setVisible(true);
    }

    public static void main(String[] args) {
        new TextBeautifier();
    }

}
