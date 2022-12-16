package ru.ke3ran.metod2.lab15.ex2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;

public class CountryInfoApp extends JFrame {

    public CountryInfoApp() {
        super("Demo program for custom combobox");
        setLayout(new FlowLayout());

        CountryComboBox customCombobox = new CountryComboBox();
        customCombobox.setPreferredSize(new Dimension(120, 60));
        customCombobox.setEditable(true);
        String[][] countryList = {{"USA", "C:\\Users\\valen\\IdeaProjects\\Java-Mirea\\src\\ru\\yakaska\\metod2\\lab15\\ex2\\us.png"}, {"India", "C:\\Users\\valen\\IdeaProjects\\Java-Mirea\\src\\ru\\yakaska\\metod2\\lab15\\ex2\\in.png"}, {"Vietnam", "C:\\Users\\valen\\IdeaProjects\\Java-Mirea\\src\\ru\\yakaska\\metod2\\lab15\\ex2\\vn.png"}, {"Germany", "C:\\Users\\valen\\IdeaProjects\\Java-Mirea\\src\\ru\\yakaska\\metod2\\lab15\\ex2\\de.png"}, {"Canada", "C:\\Users\\valen\\IdeaProjects\\Java-Mirea\\src\\ru\\yakaska\\metod2\\lab15\\ex2\\ca.png"}, {"Japan", "C:\\Users\\valen\\IdeaProjects\\Java-Mirea\\src\\ru\\yakaska\\metod2\\lab15\\ex2\\jp.png"}, {"Great Britain", "C:\\Users\\valen\\IdeaProjects\\Java-Mirea\\src\\ru\\yakaska\\metod2\\lab15\\ex2\\gb.png"}, {"France", "C:\\Users\\valen\\IdeaProjects\\Java-Mirea\\src\\ru\\yakaska\\metod2\\lab15\\ex2\\fr.png"}};
        customCombobox.addItems(countryList);
        JTextArea infoArea = new JTextArea();
        customCombobox.addItemListener(e -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                String selectedItem = ((String[]) e.getItem())[0];
                switch (selectedItem) {
                    case "USA":
                        infoArea.setText("The United States of America (U.S.A. or USA)\n" +
                                ", commonly known as the United States (U.S. or US) \n" +
                                "or America, is a country located in North America\n");
                        break;
                    case "India":
                        infoArea.setText("India, officially the Republic of India\n" +
                                " (Hindi: Bhārat Gaṇarājya), is a country in South Asia. \n" +
                                "It is the seventh-largest country by area, the second-most\n" +
                                " populous country, and the most populous democracy in the world.\n");
                        break;
                    case "Vietnam":
                        infoArea.setText("Vietnam, or Viet Nam (Vietnamese: Việt Nam,\n" +
                                " [vîət nāːm] (listen)), officially the Socialist Republic of Vietnam, \n" +
                                "is a country in Southeast Asia, at the eastern edge of mainland Southeast Asia\n");
                        break;
                    case "Germany":
                        infoArea.setText("Germany, officially the Federal \n" +
                                "Republic of Germany, is a country in Central Europe. \n" +
                                "It is the second most populous country in Europe after Russia, \n" +
                                "and the most populous member state of the European Union.\n");
                        break;
                    case "Canada":
                        infoArea.setText("Canada is a country in North America.\n" +
                                " Its ten provinces and three territories extend from the Atlantic Ocean \n" +
                                "to the Pacific Ocean and northward into the Arctic Ocean\n");
                        break;
                    case "Japan":
                        infoArea.setText("Japan is an island country in East Asia. \n" +
                                "It is situated in the northwest Pacific Ocean\n");
                        break;
                    case "Great Britain":
                        infoArea.setText("Great Britain is an island in the North\n" +
                                " Atlantic Ocean off the northwest coast of continental Europe.\n");
                        break;
                    case "France":
                        infoArea.setText("France (French: [fʁɑ̃s] ),\n" +
                                " officially the French Republic (French: République française), is\n" +
                                " a transcontinental country predominantly located in Western Europe\n");
                        break;
                }
            }
        });
        setSize(600, 600);
        add(customCombobox);
        add(infoArea);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CountryInfoApp().setVisible(true));
    }

}