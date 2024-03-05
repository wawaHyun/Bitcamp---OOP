
package view;

import controller.AuthController;

import java.util.Scanner;

public class AuthView {
    public static void authMain(Scanner sc) {
//        Scanner scc = new Scanner(System.in);
        AuthController ctrl = new AuthController();
        ctrl.addUsers();

        while (true){
            System.out.println("0-back main menu, 1-join, 2-login, 3-ID search, " +
                    "4-PW update, 5-member Withdrawal, 6-member list, 7-NL name search, " +
                    "8-job search, 9-member total of number");

            switch (sc.next()){
                case "0":
                    return;
                case "1" :
                    ctrl.join(sc);
                    break;
                case "2" :
                    ctrl.login(sc);
                    break;
                case "3" :
                    break;
                case "4" :
                   break;
                case "5" :
                    break;
                case "6" :
                    ctrl.getUsersMap(); break;
                case "7":
                    break;
                case "8" :
                    break;
                case "9" :
                    System.out.println(ctrl.count()); break;
            }
        }

    }
}