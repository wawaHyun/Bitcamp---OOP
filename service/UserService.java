
package service;

import model.Member;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public interface UserService {
    String join(Scanner sc);

    String login(Member memberParam);

    String findUserById(String username);

    //    void updatePassword(Scanner sc);
    String updatePassword(Member user);

    String deleteUser(String username);

    Map<String, Member> getUserMap();

    List<Member> findUsersByName(Member name);

    String findUsersByJob(Member userJob);

    String countUsers();

    String addUsers();
}