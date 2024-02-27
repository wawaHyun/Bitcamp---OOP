package controller;

import model.MemberDto;
import service.AuthService;
import service.UserService;
import serviceImpl.AuthServiceImpl;
import serviceImpl.UserServiceImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserController {
    private Map<String, MemberDto> users;

    public UserController() {
        this.users = new HashMap<>();
    }

    public void addMemberIds(){
        AuthService authS = AuthServiceImpl.getInstance();
    }

    public void findUser(String username){
        System.out.println(users.get(username).toString());

    }

    List<MemberDto> getUserList(){
        List<MemberDto> list = UserServiceImpl.getInstance().getUserList();
        UserService userList = UserServiceImpl.getInstance();
        return list;
    }

}
