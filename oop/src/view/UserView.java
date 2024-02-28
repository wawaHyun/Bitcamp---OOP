package view;

import controller.UserController;
import model.MemberDto;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserView {
    public static void userMain(Scanner sc) {
        UserController ctrl = new UserController();
        ctrl.addUsers();
        System.out.println(ctrl.addUsers());

        while (true){
            System.out.println("0번 뒤로가기, 1번 회원가입, 2번 로그인, 3번 아이디검색, " +
                    "4번 비번변경, 5번 탈퇴, 6번 회원목록, 7번 이름검색, 8번 직업검색, 9번 회원수");
            switch (sc.next()){
                case "0":
                    System.out.println("뒤로가기");
                    return;
                case "1" :
                    System.out.println("회원가입을 시작합니다.");
                    ctrl.join(sc);
                    break;
                case "2" :
                    System.out.println("로그인을 위한 ID와 PW를 입력해주세요.");
                    System.out.println(ctrl.login(sc));
                    break;
                case "3" :
                    System.out.println("아이디검색");
                    System.out.println(ctrl.findUserById(sc));
                    break;
                case "4" :
                    System.out.println("비번변경");
                    System.out.println(ctrl.updatePassword(sc));
                    break;
                case "5" :
                    System.out.println("탈퇴");
                    System.out.println(ctrl.deleteUser(sc));
                    break;
                case "6" :
                    System.out.println("회원목록");
                    ctrl.getUserMap();
                    break;
                case "7":
                    System.out.println("이름검색");
                    System.out.println(ctrl.findUsersByName(sc));
                    break;
                case "8" :
                    System.out.println("직업검색");
                    System.out.println(ctrl.findUsersByJob(sc));
                    break;
                case "9" :
                    System.out.println("회원수는 "+ctrl.countUsers()+"명 입니다.\n");
                    break;

            }
        }



    }
}
