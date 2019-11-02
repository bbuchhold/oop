package de.fham.oop.tictactoe;

import javax.swing.*;
import java.awt.*;

public class WinnerFrame extends JFrame {

    public WinnerFrame() throws HeadlessException {
    }

    public void winnerIs(String winner) {
        if ("O".equals(winner)) {
            this.setTitle("The winner is player 1!");
        } else {
            this.setTitle("The winner is player 2!");
        }
    }
}
