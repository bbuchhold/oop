package de.fham.oop.mvcpattern;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MVCController implements ActionListener {

    private MVCView view;
    private MVCModel model;

    public MVCController(MVCView view) {
        this.view = view;
        this.model = new MVCModel();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        view.setText(model.getText());
    }
}
