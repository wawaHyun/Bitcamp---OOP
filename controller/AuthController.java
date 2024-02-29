package controller;

import builder.MemberBuilder;
import model.MemberDto;
import service.AuthService;
import serviceImpl.AuthServiceImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AuthController {
    AuthService auth;

    public AuthController() {
        this.auth = AuthServiceImpl.getInstance();
    }

    public String join(Scanner sc) {
        return auth.join(sc);
    }

    public String login(Scanner sc) {
        return auth.login(sc);
    }

    public String addUsers() {
        auth.addUsers();
        return "";
    }

    public MemberDto findUser(String username) {
        return auth.findUser(username);
    }

    public Map<String, MemberDto> getUsersMap() {
        auth.getUsersMap();
        return null;
    }

    public String count() {
        return auth.count();
    }

}
