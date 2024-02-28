package service;

import model.MemberDto;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public interface UserService {
    String join(Scanner sc);
    String login(MemberDto memberParam);
    String findUserById(String username);
//    void updatePassword(Scanner sc);
    String updatePassword(MemberDto user);
    String deleteUser(String username);
    Map<String,MemberDto> getUserMap();
    List<MemberDto> findUsersByName(MemberDto name);
    String findUsersByJob(MemberDto userJob);
    String countUsers();
    String addUsers();

}