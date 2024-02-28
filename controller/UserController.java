package controller;

import builder.MemberBuilder;
import model.MemberDto;
import service.AuthService;
import service.UserService;
import serviceImpl.AuthServiceImpl;
import serviceImpl.UserServiceImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class UserController {
    //    private Map<String, MemberDto> users;
    UserService auth;

    public UserController() {
        this.auth = UserServiceImpl.getInstance();
    }

    public String join(Scanner sc) {
        return auth.join(sc);
    }

    public String login(Scanner sc) {
        System.out.println("아이디와 비번을 입력하세요.");
        return auth.login(new MemberBuilder()
                .memberId(sc.next())
                .memberPw(sc.next())
                .build());
    }

    public String addUsers() {
        auth.addUsers();
        return "";
    }

    public String findUsersByJob(Scanner sc) {
        System.out.println("검색할 직업을 입력하세요");
        return auth.findUsersByJob(new MemberBuilder()
                .job(sc.next())
                .build());
    }

    public List<MemberDto> findUsersByName(Scanner sc) {
        System.out.println("검색할 이름을 입력하세요.");
        return auth.findUsersByName(new MemberBuilder()
                .name(sc.next())
                .build());
    }

    public Map<String, MemberDto> getUserMap() {
        return auth.getUserMap();
    }

    public String deleteUser(Scanner sc) {
        return auth.deleteUser(sc.next());
    }

    public String countUsers() {
        return auth.countUsers();
    }

    public String  updatePassword(Scanner sc) {
        System.out.println("아이디와 비번을 입력하세요");
        return auth.updatePassword(new MemberBuilder()
                .memberId(sc.next())
                .memberPw(sc.next())
                .build());
    }

    public String findUserById(Scanner sc) {
        return auth.findUserById(sc.next());
    }



}
