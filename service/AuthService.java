<<<<<<< HEAD
package service;

import model.Member;

import java.util.Map;
import java.util.Scanner;

public interface AuthService {
    String join(Scanner sc);
    String login(Scanner sc);
    String addUsers();
    Member findUser(String username);
    Map<?,?> getUsersMap();
    String count();


}
=======
package service;

import model.Member;

import java.util.Map;
import java.util.Scanner;

public interface AuthService {
    String join(Scanner sc);
    String login(Scanner sc);
    String addUsers();
    Member findUser(String username);
    Map<?,?> getUsersMap();
    String count();


}
>>>>>>> 504fa6313cba374b40307599a88c30eca5b3cde7
