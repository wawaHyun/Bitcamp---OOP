<<<<<<< HEAD
package service;

import model.Account;
import model.Member;

import java.util.*;

public interface AccountService {
    String createAccount(Account accountInfor);
    String deposit(Account accountInfor);
    String withdraw(Account accountInfor);
    String getBalance(Account accountInfor);
    String cancelAccount(Account accountInfor);
    List<Account> getAccount();

}
=======
package service;

import model.Account;
import model.Member;

import java.util.*;

public interface AccountService {
    String createAccount(Account accountInfor);
    String deposit(Account accountInfor);
    String withdraw(Account accountInfor);
    String getBalance(Account accountInfor);
    String cancelAccount(Account accountInfor);
    List<Account> getAccount();

}
>>>>>>> 504fa6313cba374b40307599a88c30eca5b3cde7
