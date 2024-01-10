package Models;

import Controller.BaseController;
import View.CalculatorScreen;

public class CalculatorModel extends BaseModel{
    private CalculatorScreen screen;
    private BaseController controller;
    private StringBuilder firstNumberBuilder;
    private StringBuilder secondNumberBuilder;
    private String operator;
    private double result;
    public CalculatorModel() {
        firstNumberBuilder = new StringBuilder();
        secondNumberBuilder = new StringBuilder();
        operator = "";
    }

    public void appendFirstNumber(String digit) {
        firstNumberBuilder.append(digit);
    }

    public void appendSecondNumber(String digit) {
        secondNumberBuilder.append(digit);
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
    public boolean isOperatorSet() {
        return !operator.isEmpty();
    }
    public void calculateResult() {
        double firstNumber = Double.parseDouble(firstNumberBuilder.toString());
        double secondNumber = Double.parseDouble(secondNumberBuilder.toString());

        switch (operator) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "/":
                if (secondNumber != 0) {
                    result = firstNumber / secondNumber;
                } else {
                    //  деление на ноль
                    result = Double.NaN;
                }
                break;
            default:
                throw new IllegalArgumentException("Недопустимый оператор");
        }

        // Сбрасываем состояние модели
        firstNumberBuilder.setLength(0);
        secondNumberBuilder.setLength(0);
        operator = "";
    }

    public String getCurrentInput() {
        if (operator.isEmpty()) {
            return firstNumberBuilder.toString();
        } else {
            return firstNumberBuilder + " " + operator + " " + secondNumberBuilder;
        }
    }

    public double getResult() {
        return result;
    }
    public String getResultAsString() {
        return Double.toString(result);
    }
}





