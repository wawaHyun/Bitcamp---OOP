import view.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("0-종료, 1-회원관리, 2-성적표, 3-게시판, " +
                    "4-kaup, 5-AuthView, 6-UserView");
            switch (sc.next()){
                case "0" :
                    System.out.println("종료되었습니다.");
                    return;
                case "1" :
                System.out.println("회원가입을 시작합니다.");
                    AuthView.authMain(sc);
                    break;
                case "2" :
                    System.out.println("성적표를 조회합니다.");
                    GradeView.grMain(sc);
                    break;
                case "3" :
                    System.out.println("게시판 인입");
                    BoardView.boMain();
                    break;
                case "4" :
                    System.out.println("kaup지수 계산 go");
                    KaupView.kaupMain(sc);
                    break;
                case "5" :
                    System.out.println("AuthView로 가서 마이페이지");
                    AuthView.authMain(sc);
                case "6" :
                    System.out.println("UserView로 가서 마이페이지");
                    UserView.userMain(sc);
            }
        }


    }
}