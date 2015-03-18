import java.util.ArrayList;

public class Operations {

    ArrayList<Action> operator = new ArrayList<Action>();

    public Operations() {
        operator.add(new Addition());
        operator.add(new Minus());
        operator.add(new Multiplication());
        operator.add(new Division());
    }

    ArrayList<Action> getOperationsList() {
        return operator;
    }

    boolean checkOperator(String str) {
        for (Action item : operator) {
            if (item.getOperator().equals(str)) {
                return true;
            }
        }
        return false;
    }
}