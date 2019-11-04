package de.fham.oop.swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingBasicsFrame extends JPanel implements ActionListener {

    public static void main(String[] args) {
        JFrame f = new JFrame("Hello World!");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(300, 200);

        JButton button = new JButton("Release Event");
        button.addActionListener(new SwingBasicsFrame());
        f.add(button);

        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() instanceof JButton) {
            JButton jButton = (JButton) e.getSource();
            jButton.setText("Clicked");
        }

        System.out.println("Click");
    }
}
