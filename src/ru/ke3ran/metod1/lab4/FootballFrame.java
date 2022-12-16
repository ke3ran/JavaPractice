package ru.ke3ran.metod1.lab4;

import javax.swing.*;
import java.awt.*;

public class FootballFrame extends JFrame {

    private final JLabel scoreLabel = new JLabel("Result: 0 X 0", SwingConstants.CENTER);
    private final JLabel lastScorerLabel = new JLabel("Last Scorer: N/A", SwingConstants.CENTER);
    private final JLabel winnerLabel = new JLabel("Winner: DRAW", SwingConstants.CENTER);

    private int milanScore = 0;
    private int madridScore = 0;
    private String lastScorer = "N/A";


    public FootballFrame(String title) throws HeadlessException {
        super(title);
        JButton milanButton = new JButton("AC Milan");
        milanButton.addActionListener(e -> {
            milanScore++;
            lastScorer = "AC Milan";
            updateScores();
        });

        JButton madridButton = new JButton("Real Madrid");
        madridButton.addActionListener(e -> {
            madridScore++;
            lastScorer = "Real Madrid";
            updateScores();
        });
        milanButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        madridButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        lastScorerLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        scoreLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        winnerLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        Font serif = new Font("serif", Font.BOLD, 24);
        milanButton.setFont(serif);
        madridButton.setFont(serif);
        lastScorerLabel.setFont(serif);
        scoreLabel.setFont(serif);
        winnerLabel.setFont(serif);
        setLayout(new GridLayout(2, 3));
        add(lastScorerLabel);
        add(scoreLabel);
        add(winnerLabel);
        add(milanButton);
        add(new JPanel());
        add(madridButton);
    }

    private void updateScores() {
        scoreLabel.setText(String.format("Result: %d X %d", milanScore, madridScore));
        lastScorerLabel.setText(String.format("Last Scorer: %s", lastScorer));
        if (milanScore == madridScore) {
            winnerLabel.setText("Winner: DRAW");
        } else if (milanScore > madridScore) {
            winnerLabel.setText("Winner: AC Milan");
        } else {
            winnerLabel.setText("Winner: Real Madrid");
        }
    }
}
