package serviceImpl;

import model.Account;
import model.Member;
import service.AccountService;

import java.util.*;

public class AccountServiceImpl implements AccountService {

    private static AccountService instance = new AccountServiceImpl();
    List<Account> list;

    private AccountServiceImpl() {
        this.list = new ArrayList<>();
    }

    public static AccountService getInstance() {
        return instance;
    }


    @Override
    public String createAccount(Account accountInfor) {
        int newOne = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getAccountHolder().equals(accountInfor.getAccountHolder())){
                System.out.println("You already have an account.\nyour Account : "+
                        list.get(i).getAccountHolder());
                break;
            }else {
                newOne = i;}}
        list.add(accountInfor);
        System.out.println("Your account has been created successfully!");
        System.out.println("New add account information :\n" + list.get(newOne));
        return "New add account information :\n" + list.get(newOne);
    }

    @Override
    public String deposit(Account accountInfor) {
        String result = "";
        Account sum = null;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getAccountNumber() == null) {
                System.out.println("404 Not found : Account");
            } else {
                if (list.get(i).getAccountHolder() == null) {
                    System.out.println("AccountHolder are not the same.");
                } else {
                    accountInfor.setBalance(accountInfor.getBalance() + accountInfor.getBalance());
                    list.add(accountInfor);
                    System.out.println("list "+list.toString());
                    System.out.println("accountInfor "+accountInfor.toString());
                    result = accountInfor.getTransactionDate() + " : " +
                            accountInfor.getMoney() + " has been deposited.\n" +
                            "Current balance is " + list.get(i).getBalance();
                    break;
                }
            }}
        return result;
    }

    @Override
    public String withdraw(Account accountInfor) {
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
    public String getBalance(Account accountInfor) {
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
    public String cancelAccount(Account accountInfor) {
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
    public List<Account> getAccount() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + " : " + list.get(i));
        }
        return list;
    }
}