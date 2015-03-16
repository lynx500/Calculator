import java.util.ArrayList;
import java.util.Scanner;

public class Calc {
    Operations operations = new Operations();

    void showMenu() {
        System.out.println("Please, choose the number of action from the menu:");
        System.out.println("1 - help");
        System.out.println("2 - calculate");
        System.out.println("3 - exit");
    }

    void showHelp() {
        System.out.println("Calculator contains several options:");
        ArrayList<Action> list = operations.getOperationsList();
        for (Action item : list) {
            System.out.println(item.getDiscription());
        }
        System.out.println("To return to the menu enter \"back\".");
        System.out.println("To close the application enter \"exit\".");
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();
        if (answer.equals("back")) {
            showMenu();
        } else if (answer.equals("exit")) {
            System.exit(-1);
        } else {
            System.out.println("Please, choose an action!");
        }
    }

    double calculate(String operator, double a, double b) {
        ArrayList<Action> list = operations.getOperationsList();
        double result = 0;
        for (Action item : list) {
            if (operator.equals(item.getOperator())) {
                result = item.act(a, b);
            }
        }
        if (Double.isInfinite(result)) {
            System.out.println("Division by zero is prohibited!");
        }
        return result;
    }
}
