package de.fham.oop.mvcpattern;

import javax.swing.*;
import java.awt.*;

public class MVCView extends JFrame {

    JLabel label;

    public MVCView() {
        init();
    }

    private void init() {
        label = new JLabel(" ");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setSize(50, 300);
        JButton button = new JButton("klick");
        button.addActionListener(new MVCController(this));
        this.add(label, BorderLayout.NORTH);
        this.add(button, BorderLayout.CENTER);
        this.pack();
        this.setTitle("MVC");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setSize(300, 300);
    }

    public void setText(String s) {
        label.setText(s);
    }
}
