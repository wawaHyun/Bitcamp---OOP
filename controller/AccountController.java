<<<<<<< HEAD
package controller;

import model.Account;
import service.AccountService;
import service.UtilService;
import serviceImpl.AccountServiceImpl;
import serviceImpl.UtilServiceImpl;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;

public class AccountController {
    AccountService accSer;
    LocalDate nowDate;
    UtilService util;

    public AccountController() {
        this.accSer = AccountServiceImpl.getInstance();
        this.nowDate = LocalDate.now(ZoneId.of("Asia/Seoul"));
        this.util = UtilServiceImpl.getInstance();
    }

    public String createAccount(Scanner sc) {
        System.out.println("Start creating your account.");
        System.out.println("Please enter the account holder.");
        return accSer.createAccount(Account.builder()
                .accountNumber(util.createRandomAccount())
                .accountHolder(sc.next())
                .balance(0)
                .transactionDate(nowDate)
                .build());
    }

    public String deposit(Scanner sc) {
        System.out.println("Start deposit.\n" +
                "Please enter your account & holer & you want deposit.");
        return accSer.deposit(Account.builder()
                .transactionDate(nowDate)
                .accountNumber(sc.next())
                .accountHolder(sc.next())
                .money(sc.nextInt())
                .build());
    }

    public String withdraw(Scanner sc) {
        System.out.println("Start withdraw.\n" +
                "Please enter your account & holer & you want withdraw.");
        return accSer.deposit(Account.builder()
                .transactionDate(nowDate)
                .accountNumber(sc.next())
                .accountHolder(sc.next())
                .money(sc.nextInt())
                .build());
    }

    public String getBalance(Scanner sc) {
        System.out.println("Enter the account whose balance you want to check.");
        return accSer.getBalance(Account.builder()
                .accountNumber(sc.next())
                .transactionDate(nowDate)
                .build());
    }

    public String cancelAccount(Scanner sc) {
        System.out.println("Start deleting your account.");
        System.out.println("Please enter the Account & holder.");
        return accSer.cancelAccount(Account.builder()
                .accountNumber(sc.next())
                .accountHolder(sc.next())
                .transactionDate(nowDate)
                .build());
    }

    public List<?> getAccount() {
        return accSer.getAccount();
    }


}
=======
package controller;

import model.Account;
import service.AccountService;
import service.UtilService;
import serviceImpl.AccountServiceImpl;
import serviceImpl.UtilServiceImpl;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;

public class AccountController {
    AccountService accSer;
    LocalDate nowDate;
    UtilService util;

    public AccountController() {
        this.accSer = AccountServiceImpl.getInstance();
        this.nowDate = LocalDate.now(ZoneId.of("Asia/Seoul"));
        this.util = UtilServiceImpl.getInstance();
    }

    public String createAccount(Scanner sc) {
        System.out.println("Start creating your account.");
        System.out.println("Please enter the account holder.");
        return accSer.createAccount(Account.builder()
                .accountNumber(util.createRandomAccount())
                .accountHolder(sc.next())
                .balance(0)
                .transactionDate(nowDate)
                .build());
    }

    public String deposit(Scanner sc) {
        System.out.println("Start deposit.\n" +
                "Please enter your account & holer & you want deposit.");
        return accSer.deposit(Account.builder()
                .transactionDate(nowDate)
                .accountNumber(sc.next())
                .accountHolder(sc.next())
                .money(sc.nextInt())
                .build());
    }

    public String withdraw(Scanner sc) {
        System.out.println("Start withdraw.\n" +
                "Please enter your account & holer & you want withdraw.");
        return accSer.deposit(Account.builder()
                .transactionDate(nowDate)
                .accountNumber(sc.next())
                .accountHolder(sc.next())
                .money(sc.nextInt())
                .build());
    }

    public String getBalance(Scanner sc) {
        System.out.println("Enter the account whose balance you want to check.");
        return accSer.getBalance(Account.builder()
                .accountNumber(sc.next())
                .transactionDate(nowDate)
                .build());
    }

    public String cancelAccount(Scanner sc) {
        System.out.println("Start deleting your account.");
        System.out.println("Please enter the Account & holder.");
        return accSer.cancelAccount(Account.builder()
                .accountNumber(sc.next())
                .accountHolder(sc.next())
                .transactionDate(nowDate)
                .build());
    }

    public List<?> getAccount() {
        return accSer.getAccount();
    }


}
>>>>>>> 504fa6313cba374b40307599a88c30eca5b3cde7
