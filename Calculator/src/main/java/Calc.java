import java.util.ArrayList;

public class Calc {
    Operations operations = new Operations();

     ArrayList<String> showHelp() {
        ArrayList<Action> list = operations.getOperationsList();
         ArrayList<String> str = new ArrayList<String>();
         for (Action item : list) {
             str.add(item.getDiscription());
         }
         return str;
    }

    double calculate(String operator, double a, double b) throws UnsupportedOperationException {
        ArrayList<Action> list = operations.getOperationsList();
        for (Action item : list) {
            if (operator.equals(item.getOperator())) {
                return item.act(a, b);
            }
        }
        throw new UnsupportedOperationException();
    }
}
