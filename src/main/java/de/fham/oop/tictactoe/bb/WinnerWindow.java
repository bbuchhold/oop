package de.fham.oop.tictactoe.bb;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class WinnerWindow extends JFrame implements ActionListener {
    private TicTacToe ticTacToe;
    private JButton restartButton;

    WinnerWindow(TicTacToe ticTacToe) {
        this.ticTacToe = ticTacToe;
        this.setTitle("Congratulations!");

        this.restartButton = new JButton();
        this.restartButton.setText("Restart Game");
        this.restartButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() instanceof JButton) {
            this.ticTacToe.restartGame();
            this.setVisible(false);
        }
    }

    void setWinnerName(String name) {
        this.getContentPane().removeAll();
        JPanel panel = new JPanel();
        JLabel message = new JLabel("Congratulations player " + name);
        panel.add(message);
        panel.add(this.restartButton);
        this.add(panel);
    }
}
