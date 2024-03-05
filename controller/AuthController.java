
package controller;

import model.Member;
import service.AuthService;
import serviceImpl.AuthServiceImpl;

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

    public Member findUser(String username) {
        return auth.findUser(username);
    }

    public Map<?, ?> getUsersMap() {
        auth.getUsersMap();
        return null;
    }

    public String count() {
        return auth.count();
    }

}