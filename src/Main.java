import Controller.CalculatorController;
import View.CalculatorScreen;
import Models.CalculatorModel;

import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CalculatorModel calculatorModel = new CalculatorModel();
            CalculatorScreen calculatorScreen = new CalculatorScreen();
            CalculatorController calculatorController = new CalculatorController(calculatorModel,calculatorScreen);



        });
        }
    }
