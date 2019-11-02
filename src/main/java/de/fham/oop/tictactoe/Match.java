package de.fham.oop.tictactoe;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Match extends JPanel implements ActionListener {

    private JButton[][] matchfield = new JButton[3][3];
    private String player = "O";
    private WinnerFrame winnerFrame;


    public Match(WinnerFrame winnerFrame) {
        this.winnerFrame = winnerFrame;

        for (int row = 0; row < 3; row ++) {
            for (int column = 0; column < 3; column ++) {
                JButton checkBox = new JButton();
                checkBox.addActionListener(this);
                matchfield[row][column] = checkBox;
                add(checkBox);
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        checkField(event);

        if(checkForWinner()) {
            winnerFrame.winnerIs(player);
            winnerFrame.setVisible(true);
        }

        nextPlayer();
    }

    private void checkField(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        button.setText(player);
        button.setEnabled(false);
    }

    private boolean checkForWinner() {
        for (int i = 0; i < 3; i++) {
            if (checkRow(i))
                return true;
            if (checkColumn(i))
                return true;
        }
        return checkDiagonal();
    }

    private boolean checkDiagonal() {
        if (player.equals(matchfield[0][0].getText()) &&
                player.equals(matchfield[1][1].getText()) &&
                    player.equals(matchfield[2][2].getText()))
            return true;

        return player.equals(matchfield[0][2].getText()) &&
                player.equals(matchfield[1][1].getText()) &&
                player.equals(matchfield[2][0].getText());
    }

    private boolean checkRow(int row) {
        return player.equals(matchfield[row][0].getText())
                && player.equals(matchfield[row][1].getText())
                && player.equals(matchfield[row][2].getText());
    }

    private boolean checkColumn(int column) {
        return player.equals(matchfield[0][column].getText())
                && player.equals(matchfield[1][column].getText())
                && player.equals(matchfield[2][column].getText());
    }

    private void nextPlayer() {
        if (player.equals("O")) {
            player = "X";
        } else {
            player = "O";
        }
    }
}
