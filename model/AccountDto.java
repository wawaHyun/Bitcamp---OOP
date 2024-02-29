package model;
import lombok.*;

import java.time.LocalDate;
import java.util.*;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class AccountDto {
    private long id;
    private String accountNumber;  //계좌번호
    private String accountHolder; //예금주
    private double balance;  //잔고
    private LocalDate transactionDate; //거래일자
    private int money;
}
