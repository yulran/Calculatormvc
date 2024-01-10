package Models;

public abstract class BaseModel {
    private double result;
   public abstract void appendFirstNumber(String digit);
    public abstract void appendSecondNumber(String digit);
    public  abstract void setOperator(String operator);
    public abstract void calculateResult();
    public abstract String getCurrentInput();
    public  double getResult(){
        return result;
    }

    public abstract String getResultAsString();

    public abstract boolean isOperatorSet();
}
