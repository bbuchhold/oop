package de.fham.oop.tictactoe.bb;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToe extends JPanel implements ActionListener {

    private JButton[][] matchfield = new JButton[3][3];
    private String nächsterSpieler = "x";
    private WinnerWindow winnerFrame;
    public TicTacToe(){

        for(int x = 0; x<3 ;x++){
            for(int y = 0;y<3;y++){
            JButton button = new JButton();
            add(button);
            button.addActionListener(this);
            matchfield[x][y] = button;
            }
        }

        this.winnerFrame = new WinnerWindow(this);
        this.winnerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.winnerFrame.setSize(250, 250);
    }

    public static void main(String[] args) {

        JFrame f = new JFrame("Hello World!");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(300, 200);
        f.add(new TicTacToe());
        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() instanceof JButton) {
            JButton jButton = (JButton) e.getSource();
            jButton.setText(nächsterSpieler);
            jButton.setEnabled(false);
            if (nächsterSpieler.equals("x")) {
                nächsterSpieler = "o";
            } else {
                nächsterSpieler = "x";
            }
            String winner = this.checkForWinner();
            // winner will be "1" or "2" if a player has one
            // and "0" if there is no winner, yet.
            if (!winner.equals("0")) {
                this.endGame(winner);
            }
        }
    }

    private void endGame(String winner) {
        enableDisableAll(false);
        String num = "1";
        if (winner.equals("o")) {
            num = "2";
        }
        displayWinnerFrame(num);
        System.out.println("Congratulations player " + num);
    }

    private void displayWinnerFrame(String num) {
        winnerFrame.setWinnerName(num);
        winnerFrame.setVisible(true);
    }

    private void enableDisableAll(boolean enabled) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matchfield[i][j].setEnabled(enabled);
            }
        }
    }

    private String checkForWinner() {
        String winner;
        for (int i = 0; i < 3; i++) {
            winner = checkRow(i);
            if (!winner.equals("0")) {
                return winner;
            }
        }
        for (int j = 0; j < 3; j++) {
            winner = checkColumn(j);
            if (!winner.equals("0")) {
                return winner;
            }
        }
        return checkDiagonal();
    }

    private String checkDiagonal() {
        String checkFor = matchfield[0][0].getText();
        if (checkFor.equals("")) {
            return "0";
        }
        for (int i = 1; i < 3; i++) {
            String text = matchfield[i][i].getText();
            if (!text.equals(checkFor)) {
                return "0";
            }
        }
        return checkFor;
    }


    private String checkRow(int i) {
        String checkFor = matchfield[i][0].getText();
        if (checkFor.equals("")) {
            return "0";
        }
        for (int j = 1; j < 3; j++) {
            String text = matchfield[i][j].getText();
            if (!text.equals(checkFor)) {
                return "0";
            }
        }
        return checkFor;
    }

    private String checkColumn(int j) {
        String checkFor = matchfield[0][j].getText();
        if (checkFor.equals("")) {
            return "0";
        }
        for (int i = 1; i < 3; i++) {
            String text = matchfield[i][j].getText();
            if (!text.equals(checkFor)) {
                return "0";
            }
        }
        return checkFor;
    }


    public void restartGame() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matchfield[i][j].setText("");
            }
        }
        enableDisableAll(true);
    }



    private String checkForWinnerOld() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                JButton button = matchfield[i][j];
                String thisFieldPlayer = button.getText();
                if (!thisFieldPlayer.equals("")) {
                    boolean winner = checkColumnOld(thisFieldPlayer, j);
                    if (!winner) {
                        winner = checkRowOld(thisFieldPlayer, i);
                    }
                    if (!winner && i == j) {
                        winner = checkDiagonalOld(thisFieldPlayer);
                    }
                    if (winner) {
                        return thisFieldPlayer;
                    }
                    System.out.println("Field [" + i + "][" + j + "]: "
                            + button.getText());
                }
            }
        }
        return "0";
    }

    private boolean checkColumnOld(String thisFieldPlayer, int j) {
        for (int i = 0; i < 3; i++) {
            String text = matchfield[i][j].getText();
            System.out.println(text);
            if (!text.equals(thisFieldPlayer)) {
                return false;
            }
        }
        return true;
    }

    private boolean checkRowOld(String thisFieldPlayer, int i) {
        for (int j = 0; j < 3; j++) {
            String text = matchfield[i][j].getText();
            if (!text.equals(thisFieldPlayer)) {
                return false;
            }
        }
        return true;
    }

    private boolean checkDiagonalOld(String thisFieldPlayer) {
        for (int i = 0; i < 3; i++) {
            String text = matchfield[i][i].getText();
            if (!text.equals(thisFieldPlayer)) {
                return false;
            }
        }
        return true;
    }
}