package serviceImpl;

import builder.AccountBuilder;
import model.AccountDto;
import model.MemberDto;
import service.AccountService;
import service.AuthService;

import java.time.LocalDate;
import java.util.*;

public class AccountServiceImpl implements AccountService {

    private static AccountService instance = new AccountServiceImpl();
    List<AccountDto> list;
//    AccountDto accDto;

    private AccountServiceImpl() {
        this.list = new ArrayList<AccountDto>();
//        this.accDto = new AccountBuilder().build();
    }

    public static AccountService getInstance() {
        return instance;
    }


    @Override
    public String createAccount(AccountDto accountInfor) {
        int newOne = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getAccountHolder().equals(accountInfor.getAccountHolder())){
                System.out.println("You already have an account.\nyour Account : "+
                        list.get(i).getAccountHolder());break;
        }else {
                newOne = i;}}
        list.add(accountInfor);
        System.out.println("Your account has been created successfully!");
        System.out.println("New add account information :\n" + list.get(newOne));
        return "New add account information :\n" + list.get(newOne);
    }

    @Override
    public String deposit(AccountDto accountInfor) {
        String result = "";
        double sum = accountInfor.getBalance();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getAccountNumber() == null) {
                System.out.println("404 Not found : Account");
            } else {
                if (list.get(i).getAccountHolder() == null) {
                    System.out.println("AccountHolder are not the same.");
                } else {
                    sum += list.get(i).getBalance();
                    System.out.println(sum);
//                    list.set(i,);
                    result = accountInfor.getTransactionDate() + " : " +
                            accountInfor.getMoney() + " has been deposited.\n" +
                            "Current balance is " + list.get(i).getBalance();
                    break;
                }
            }
        }
        return result;
    }

    @Override
    public String withdraw(AccountDto accountInfor) {
        String result = "";
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getAccountNumber() == null) {
                System.out.println("404 Not found : Account");
            } else {
                if (list.get(i).getAccountHolder() == null) {
                    System.out.println("AccountHolder are not the same.");
                } else {
                    //ramda
//                    list.stream().mapToInt(Integer::intValue).sum(accountInfor.getMoney());
                    System.out.println((list.get(i).getBalance() - accountInfor.getMoney()));
                    result = accountInfor.getTransactionDate() + " : " +
                            accountInfor.getMoney() + " has been withdrawed.\n" +
                            "Current balance is " + list.get(i).getBalance();
                    break;
                }
            }
        }
        return result;
    }

    @Override
    public String getBalance(AccountDto accountInfor) {
        String result = "";
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getAccountNumber().equals(accountInfor.getAccountNumber())) {
                result = accountInfor.getTransactionDate() + " Current balance : " +
                        list.get(i).getBalance();
                break;
            } else {
                result = "404 Not found : account";
            }
        }
        return result;
    }

    @Override
    public String cancelAccount(AccountDto accountInfor) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getAccountNumber() == null) {
                System.out.println("404 Not found : Account");
            } else {
                if (list.get(i).getAccountHolder().equals(accountInfor.getAccountHolder())) {
                    System.out.println("Your account has been deleted successfully.\n" +
                            "deleted Account : " + accountInfor);
                    list.remove(i);
                    break;
                } else {
                }
            }
        }
        System.out.println("AccountHolder are not the same.");

        return "";
    }

    @Override
    public List<AccountDto> getAccount() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + " : " + list.get(i));
        }
        ;
        return list;
    }
}