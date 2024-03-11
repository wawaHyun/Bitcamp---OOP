package strategy;

import java.util.Scanner;

enum rankEnum{
    THREE(3, 4_000),
    FOUR(4, 10_000),
    FIVE(5, 30_000);

    ;
    private final int match;
    private final int money;
    private int count;

    rankEnum(int match, int money) {
        this.match = match;
        this.money = money;
    }
    public void plusCount(){
        this.count++;
    }
}
public class RankMain {
    public static void rankMain(Scanner sc) {
        System.out.println(rankEnum.FIVE);
    }
}
