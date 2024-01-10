package Controller;

import Models.BaseModel;
import View.BaseScreen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public abstract class BaseController implements ActionListener {
    private ActionListener actionListener;
    protected BaseModel model;
    protected BaseScreen baseScreen;

    public BaseController() {
        this.baseScreen = baseScreen;
        this.model = model;
        for (Component component : baseScreen.getButtonPanel().getComponents()) {
            if (component instanceof JButton) {
                JButton button = (JButton) component;
                if (Character.isDigit(button.getText().charAt(0))) {
                    button.addActionListener(actionListener);
                } else if ("+-*/".contains(button.getText())) {
                    button.addActionListener((actionListener));
                }
            }
        }
    }
    }






