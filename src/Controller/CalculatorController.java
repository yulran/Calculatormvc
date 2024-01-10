package Controller;

import Models.BaseModel;
import Models.CalculatorModel;
import View.BaseScreen;
import View.CalculatorScreen;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController extends BaseController {
    private CalculatorScreen calculatorScreen;
    protected CalculatorModel calculatorModel;

    public CalculatorController (BaseModel model, BaseScreen baseScreen) {
        this.model=model;
        this.baseScreen= baseScreen;
        baseScreen.setController(this);
        model.setScreen(baseScreen);
    }
    private class DigitButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton source = (JButton) e.getSource();
            String digit = source.getText();

            if (!model.isOperatorSet()) {
                // Если оператор не установлен, добавляем цифру к первому числу
                model.appendFirstNumber(digit);
            } else {
                // Если оператор установлен, добавляем цифру ко второму числу
                model.appendSecondNumber(digit);
            }

            // Обновляем  числа
            calculatorScreen.updateDisplay(model.getCurrentInput());
        }
    }

    private class OperatorButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton source = (JButton) e.getSource();
            String operator = source.getText();

            // Устанавливаем оператор в модели
            model.setOperator(operator);

            // Обновляем представление с текущими числами и оператором
            calculatorScreen.updateDisplay(model.getCurrentInput());
        }
    }

    //  метод для вычисления результата и обновления представления
    public void calculateResult() {
        model.calculateResult();
        calculatorScreen.updateDisplay(model.getResultAsString());
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}



