import view.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("0-system exit, 1-grade, 2-board, " +
                "3-kaup, 4-phone heritance test, 5-product," +
                "6-index,7-AuthView, 8-UserView, 9-bank program");
        while (true){
            switch (sc.next()){
                case "0" :
                    return;
                case "1" :
                    GradeView.grMain(sc);
                    break;
                case "2" :
                    BoardView.boMain();
                    break;
                case "3" :
                    KaupView.kaupMain(sc);
                    break;
                case "4" :
                    PhoneInheritance.main();
                    break;
                case "5" :
                ProductView.main();
                    break;
                case "6" :
                    Index.main();
                    break;
                case "7" :
                AuthView.authMain(sc);
                    break;
                case "8" :
                UserView.userMain(sc);
                    break;
                case "9" :
                AccountView.accountMain(sc);
                    break;
            }
        }


    }
}