import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String answer;

        Calc calc = new Calc();
        Operations operations = new Operations();

        calc.showMenu();

        while (sc.hasNext()) {
            try {
                int action = sc.nextInt();
                if (action == 1) {
                    calc.showHelp();
                    sc = new Scanner(System.in);
                    answer = sc.nextLine();
                    if (answer.equals("back")) {
                        calc.showMenu();
                    } else if (answer.equals("exit")) {
                        System.exit(-1);
                    } else {
                        System.out.println("Please, choose an action!");
                    }
                } else if (action == 2) {
                    do {
                        boolean check;
                        String operator;

                        do {
                            System.out.println("Enter the desirable arithmetic operator:");
                            sc = new Scanner(System.in);
                            operator = sc.nextLine();
                            check = operations.checkOperator(operator);
                            if (check == false) {
                                System.out.println("Incorrect operator!");
                            }
                        } while (check == false);


                        System.out.println("Enter two numbers for operation: ");

                        double num1 = sc.nextDouble();
                        double num2 = sc.nextDouble();


                        double result = calc.calculate(operator, num1, num2);
                        System.out.println(result);

                        answer = askToContinue();
                    } while (answer.equals("yes"));
                        System.out.println("thank you for using our app!!");
                        break;
                } else if (action == 3) {
                    System.exit(-1);
                } else {
                    System.out.println("Please, enter the correct number!");
                }
            } catch (InputMismatchException e) {
                   while (!sc.hasNextInt()) {
                        System.out.println("Please, enter the number!");
                        sc.nextLine();
                   }
             }
         }
     }

    static String askToContinue() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to continue? Enter yes or no");
        String answer = sc.nextLine();
        return answer;
    }
}

