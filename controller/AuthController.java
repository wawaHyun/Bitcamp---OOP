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
    //AuthServiceImpl을 불러왔다가 제목에서 Impl 삭제
    //Impl과 똑같은걸 불러와야 해서. 그 뒤에 override 삭제

    //필드로 하지 않아도 불러는 와지지만, 이렇게 하면 메모리를 잡아먹음
//    AuthService auth = AuthServiceImpl.getInstance();
    //그래서 생성자로 만들어주는 것.


    //Controller = 거실. 보안을 걸기 위한 완충지대.
    //그래서 직접 로직 쓰지 않고 다 참조해서 가져와서 씀
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
