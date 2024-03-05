
package controller;
import model.Member;
import service.UserService;
import serviceImpl.UserServiceImpl;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class UserController {
    UserService auth;

    public UserController() {
        this.auth = UserServiceImpl.getInstance();
    }

    public String join(Scanner sc) {
        return auth.join(sc);
    }

    public String login(Scanner sc) {
        System.out.println("Please enter your ID & PW.");
        return auth.login(Member.builder()
                .memberId(sc.next())
                .memberPw(sc.next())
                .build());
    }

    public String addUsers() {
        auth.addUsers();
        return "";
    }

    public String findUsersByJob(Scanner sc) {
        System.out.println("Please enter the job you wish to search for.");
        return auth.findUsersByJob(Member.builder()
                .job(sc.next())
                .build());
    }

    public List<Member> findUsersByName(Scanner sc) {
        System.out.println("Please enter the name you wish to search for.");
        return auth.findUsersByName(Member.builder()
                .name(sc.next())
                .build());
    }

    public Map<String, Member> getUserMap() {
        return auth.getUserMap();
    }

    public String deleteUser(Scanner sc) {
        return auth.deleteUser(sc.next());
    }

    public String countUsers() {
        return auth.countUsers();
    }

    public String  updatePassword(Scanner sc) {
        System.out.println("Please enter your ID & PW.");
        return auth.updatePassword(Member.builder()
                .memberId(sc.next())
                .memberPw(sc.next())
                .build());
    }

    public String findUserById(Scanner sc) {
        return auth.findUserById(sc.next());
    }



}