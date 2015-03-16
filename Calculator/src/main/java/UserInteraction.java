import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInteraction {
    Scanner sc = new Scanner(System.in);

    String askToContinue() {
        System.out.println("Do you want to continue? Enter yes or no");
        String answer = sc.nextLine();
        return answer;
    }

//    void showMenu() {
//        System.out.println("Please, choose the number of action from the menu:");
//        System.out.println("1 - help");
//        System.out.println("2 - calculate");
//        System.out.println("3 - exit");
//    }
//
//    int getUserInput() {
//        int a = 0;
//        try {
//            a = sc.nextInt();
//        } catch (InputMismatchException e) {
//            while (!sc.hasNextInt()) {
//                System.out.println("Please, enter the number!");
//                sc.nextLine();
//            }
//        }
//        return a;
//    }
}
