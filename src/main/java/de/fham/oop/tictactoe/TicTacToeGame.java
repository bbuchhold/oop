package de.fham.oop.tictactoe;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToeGame extends JFrame implements ActionListener {

    private static final String TIC_TAC_TOE = "Tic Tac Toe";
    private static JFrame game;
    private static WinnerFrame winnerFrame;

    public static void main(String[] args) {
        game = new JFrame(TIC_TAC_TOE);
        game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        game.setSize(300, 200);

        winnerFrame = new WinnerFrame();

        JButton restartButton = new JButton("Restart Game");
        restartButton.addActionListener(new TicTacToeGame());
        winnerFrame.add(restartButton);

        game.add(new Match(winnerFrame));
        game.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        game.setVisible(false);
        winnerFrame.setVisible(false);
        main(null);
    }
}
