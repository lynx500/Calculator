import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws UnsupportedOperationException {
        Scanner sc = new Scanner(System.in);
        String answer;
        String exit = "exit";

        Calc calc = new Calc();

        showMenu();

        while (sc.hasNext()) {
            String action = sc.nextLine();
               if (action.equals("1")) {
                   System.out.println("Calculator contains several options:");
                   ArrayList<String> availableActions = calc.showHelp();
                        for (String str : availableActions) {
                            System.out.println(str);
                        }
                   System.out.println("To return to the menu enter \"back\".");
                   System.out.println("To close the application enter \"exit\".");

                   while (sc.hasNext()) {
                       answer = sc.nextLine();
                       if (answer.equals("back")) {
                           showMenu();
                           break;
                       } else if (answer.equals("exit")) {
                           System.exit(-1);
                       } else {
                           System.out.println("Please, choose an action!");
                       }
                   }

               } else if (action.equals("2")) {
                    do {
                        String operator;

                        System.out.println("Enter the desirable arithmetic operator:");
                        operator = sc.nextLine();

                        System.out.println("Enter two numbers for operation: ");

                        try {
                            double num1 = Double.parseDouble(sc.nextLine());
                            double num2 = Double.parseDouble(sc.nextLine());
                                double result = calc.calculate(operator, num1, num2);
                                System.out.println(result);
                            } catch (UnsupportedOperationException e) {
                                System.out.println("Operator was incorrect! Try again");
                            } catch (NumberFormatException e) {
                            System.out.println("Enter the numbers!");
                        }

                        answer = askToContinue();
                    } while (answer.equals("yes"));
                    System.out.println("thank you for using our app!!");
                    break;
               } else if (action.equals(exit)) {
                    System.exit(-1);
               } else {
                    System.out.println("Please, enter the correct number or exit!");
               }
        }
    }

    static String askToContinue() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to continue? Enter yes or no");
        String answer = sc.nextLine();
        return answer;
    }

    static void showMenu() {
        System.out.println("Please, choose the number of action from the menu:");
        System.out.println("1 - help");
        System.out.println("2 - calculate");
        System.out.println("To close the application enter \"exit\".");
    }
}

