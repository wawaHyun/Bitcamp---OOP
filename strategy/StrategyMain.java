package strategy;

import java.util.Scanner;



public class StrategyMain {
    public static void main(Scanner sc) {
        System.out.println("0-back menu, 1-calculator, 2-calculator2(lamdba) 3-rank" +
                "4-week, 5-week(lamdba), 6-grade");
        while (true){
        switch (sc.nextInt()){
            case 0 : return;
            case 1 : Calculator.main(sc);
            case 2 : Calculator2.main(sc);
            case 3 : RankMain.rankMain(sc);
            case 4 : Week.main(sc);
            case 5 : WhatDay.main(sc);
            case 6 : GradeEnum.main(sc);
            default:
                System.out.println("다시 입력하세요.");
        }}
    }
}
