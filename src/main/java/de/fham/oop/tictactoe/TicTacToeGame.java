package de.fham.oop.tictactoe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToeGame implements ActionListener {

    private static final String TIC_TAC_TOE = "Tic Tac Toe";

    public static void main(String[] args) {
        JFrame f = new JFrame(TIC_TAC_TOE);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(300, 200);

        WinnerFrame winnerFrame = new WinnerFrame();
        winnerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        winnerFrame.setSize(300, 200);

        JButton restartButton = new JButton("Restart Game");
        restartButton.addActionListener(new TicTacToeGame());
        winnerFrame.add(restartButton);

        f.add(new Match(winnerFrame));
        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        main(null);

    }
}
