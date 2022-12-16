package ru.ke3ran.metod2.lab15.ex3;

import javax.swing.*;
import java.awt.*;

public class Notepad extends JFrame {
    public Notepad() {
        this.setSize(500, 300);
        this.setTitle("Notepad");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        TextArea textArea = new TextArea("", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
        textArea.setFont(new Font("Century Gothic", Font.BOLD, 12));
        this.getContentPane().setLayout(new FlowLayout());
        this.getContentPane().add(new Button("Button 1"));
        this.getContentPane().add(new Button("Button 2"));


        MenuBar menuBar = new MenuBar();
        this.setMenuBar(menuBar);
        Menu file = new Menu();
        Menu edit = new Menu();
        Menu help = new Menu();
        menuBar.add(file);
        menuBar.add(edit);
        menuBar.add(help);

        file.setLabel("File");
        edit.setLabel("Edit");
        help.setLabel("Help");

        MenuItem saveFile = new MenuItem();
        saveFile.setLabel("Save");
        file.add(saveFile);

        MenuItem exit = new MenuItem();
        exit.setLabel("Exit");
        file.add(exit);

        MenuItem copy = new MenuItem();
        copy.setLabel("Copy");
        edit.add(copy);
        MenuItem paste = new MenuItem();
        paste.setLabel("Paste");
        edit.add(paste);
        MenuItem insert = new MenuItem();
        insert.setLabel("Insert");
        edit.add(insert);
        pack();
    }

    public static void main(String[] args) {
        Notepad app = new Notepad();
        app.setVisible(true);
    }
}