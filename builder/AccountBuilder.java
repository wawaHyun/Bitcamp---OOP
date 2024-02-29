package builder;

import model.AccountDto;
import service.AccountService;

import javax.print.attribute.standard.MediaSize;
import java.time.LocalDate;
import java.util.Date;

public class AccountBuilder {
    private long id;
    private String accountNumber;
    private String accountHolder;
    private double balance;
    private LocalDate transactionDate;
    private int money;
    public AccountBuilder id(long id){
        this.id = id;
        return this;
    }
    public AccountBuilder accountNumber(String accountNumber){
        this.accountNumber = accountNumber;
        return this;
    }
    public AccountBuilder accountHolder(String accountHolder){
        this.accountHolder = accountHolder;
        return this;
    }
    public AccountBuilder balance(double balance){
        this.balance = balance;
        return this;
    }
    public AccountBuilder transactionDate(LocalDate transactionDate){
        this.transactionDate = transactionDate;
        return this;
    }
    public AccountBuilder money(int money){
        this.money = money;
        return this;
    }
    public AccountDto build(){
        return new AccountDto(id, accountNumber,accountHolder,
                balance,transactionDate,money);
    }

}
