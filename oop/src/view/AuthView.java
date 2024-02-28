package view;

import controller.AuthController;
import controller.UserController;
import model.MemberDto;

import java.awt.dnd.Autoscroll;
import java.util.List;
import java.util.Scanner;

public class AuthView {
    public static void authMain(Scanner sc) {
//        Scanner scc = new Scanner(System.in);
        AuthController ctrl = new AuthController();
        ctrl.addUsers();

        while (true){
            System.out.println("0번 뒤로가기, 1번 회원가입, 2번 로그인, 3번 아이디검색, " +
                    "4번 비번변경, 5번 탈퇴, 6번 회원목록, 7번 이름검색, 8번 직업검색, 9번 회원수");
            switch (sc.next()){
                case "0":
                    System.out.println("뒤로가기"); return;
                case "1" :
                    System.out.println("회원가입");
                    ctrl.join(sc);
                    break;
                case "2" :
                    System.out.println("로그인");
                    ctrl.login(sc);
                    break;
                case "3" :
                    System.out.println("아이디검색");break;
//                    ctrl.findUser("jaja");
                case "4" :
                    System.out.println("비번변경");break;
                case "5" :
                    System.out.println("탈퇴");break;
                case "6" :
                    System.out.println("회원목록");
                    ctrl.getUsersMap(); break;
                case "7":
                    System.out.println("이름검색");break;
                case "8" :
                    System.out.println("직업검색");break;
                case "9" :
                    System.out.println("회원수");
                    System.out.println(ctrl.count()); break;
            }
        }

    }
}
