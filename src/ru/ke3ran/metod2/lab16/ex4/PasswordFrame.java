package ru.ke3ran.metod2.lab16.ex4;

import javax.swing.*;
import java.awt.*;

public class PasswordFrame extends JFrame {
    /**
     * Метод определения интерфейса панели
     *
     * @param container
     */
    public static void createPanelUI(Container container) {

        container.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

        container.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(5, 10, 5, 10);

        // По умолчанию натуральная высота, максимальная ширина
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weightx = 0.5;
        constraints.gridy = 0;

        JLabel serviceLabel = new JLabel("Service:");
        constraints.gridx = 0;
        constraints.gridy = 0;
        container.add(serviceLabel, constraints);

        JLabel usernameLabel = new JLabel("User Name:");
        constraints.gridx = 0;
        constraints.gridy = 1;
        container.add(usernameLabel, constraints);

        JLabel passwordLabel = new JLabel("Password:");
        constraints.gridx = 0;
        constraints.gridy = 2;
        container.add(passwordLabel, constraints);

        JTextField serviceField = new JTextField(30);
        constraints.weightx = 0.0;
        constraints.gridwidth = 2;
        constraints.gridx = 1;
        constraints.gridy = 0;
        container.add(serviceField, constraints);

        JTextField userName = new JTextField(30);
        constraints.weightx = 0.0;
        constraints.gridwidth = 2;
        constraints.gridx = 1;
        constraints.gridy = 1;
        container.add(userName, constraints);

        JTextField passwordField = new JTextField(30);
        constraints.weightx = 0.0;
        constraints.gridwidth = 2;
        constraints.gridx = 1;
        constraints.gridy = 2;
        container.add(passwordField, constraints);

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("GridBagLayoutTest");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        createPanelUI(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }
}