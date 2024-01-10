package View;

import Controller.BaseController;
import Controller.CalculatorController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CalculatorScreen extends BaseScreen {
    private CalculatorController controller;
    private ActionListener actionListener;
    private JTextField display;
    private JPanel buttonPanel;

    public CalculatorScreen() {
        super();

    }


    @Override
    protected void initComponents() {


        display = new JTextField();
        display.setEditable(false);
        frame.add(display, BorderLayout.NORTH);

        buttonPanel = new JPanel(new GridLayout(4, 4));
        String[] buttonLabels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"};

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.addActionListener(controller);
            buttonPanel.add(button);
        }

        frame.add(buttonPanel, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    public JPanel getButtonPanel() {
        return buttonPanel;
    }

    @Override
    public void updateDisplay(String text) {
        display.setText(text);

    }
    public void setController(CalculatorController controller) {
        this.controller = controller;
    }
}




