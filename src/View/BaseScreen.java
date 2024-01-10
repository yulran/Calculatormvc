package View;

import Controller.BaseController;
import Controller.CalculatorController;

import javax.swing.*;
import javax.swing.JPanel;

public abstract class BaseScreen extends JFrame {
protected JTextField display;
   protected JFrame frame;
    protected JPanel panel;
    protected  BaseController controller;
    protected abstract void initComponents();
    public BaseScreen() {
        JFrame frame = new JFrame("Калькулятор");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);
        setLocationRelativeTo(null);
        initComponents();
        this.setVisible(true);
    }
    public abstract JPanel getButtonPanel();
    public abstract void updateDisplay(String text);

    public void setController(BaseController calculatorController) {
        this.controller= calculatorController;
    }
}
