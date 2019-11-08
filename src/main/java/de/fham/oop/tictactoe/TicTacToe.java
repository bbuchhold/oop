package de.fham.oop.tictactoe;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToe extends JPanel implements ActionListener {

    private JButton[][] matchfield = new JButton[3][3];
    private String nächsterSpieler = "x";
    public TicTacToe(){
        for(int x = 0; x<3 ;x++){
            for(int y = 0;y<3;y++){
            JButton button = new JButton();
            add(button);
            button.addActionListener(this);
            matchfield[x][y] = button;
            }
        }
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
            if (nächsterSpieler == "x") {
                nächsterSpieler = "o";
            } else {
                nächsterSpieler = "x";
            }
        }
    }
}