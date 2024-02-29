package service;

import model.AccountDto;

import java.time.LocalDate;
import java.util.*;

public interface AccountService {
    String createAccount(AccountDto accountInfor);
    String deposit(AccountDto accountInfor);
    String withdraw(AccountDto accountInfor);
    String getBalance(AccountDto accountInfor);
    String cancelAccount(AccountDto accountInfor);
    List<AccountDto> getAccount();

}
