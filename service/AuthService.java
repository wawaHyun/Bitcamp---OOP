package service;

import model.MemberDto;

import java.util.Map;
import java.util.Scanner;

public interface AuthService {
    String join(Scanner sc);
    String login(Scanner sc);
    String addUsers();
    MemberDto findUser(String username);
    Map<String, MemberDto> getUsersMap();
    String count();


}
