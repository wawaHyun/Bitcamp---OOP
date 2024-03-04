package view;

import controller.UserController;

import java.util.Scanner;

public class UserView {
    public static void userMain(Scanner sc) {
        UserController ctrl = new UserController();
        ctrl.addUsers();
        System.out.println(ctrl.addUsers());

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
//                    System.out.println("Please enter your ID and Pw.");
                    System.out.println(ctrl.login(sc));
                    break;
                case "3" :
                    System.out.println(ctrl.findUserById(sc));
                    break;
                case "4" :
                    System.out.println(ctrl.updatePassword(sc));
                    break;
                case "5" :
                    System.out.println(ctrl.deleteUser(sc));
                    break;
                case "6" :
                    ctrl.getUserMap();
                    break;
                case "7":
                    System.out.println(ctrl.findUsersByName(sc));
                    break;
                case "8" :
                    System.out.println(ctrl.findUsersByJob(sc));
                    break;
                case "9" :
                    System.out.println("total of number is "+ctrl.countUsers());
                    break;

            }
        }



    }
}
