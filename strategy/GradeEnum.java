package strategy;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.function.Supplier;

enum GradeEe {
    A(9, i -> i>=9),
    B(8, i -> i>=8),
    C(7, i -> i>=7),
    D(6, i -> i>=6),
    F(5, i -> i>=0);

    ;

    private final int score;
    private final Predicate<Integer> predicate;


    GradeEe(int score, Predicate<Integer> predicate) {
        this.score = score;
        this.predicate = predicate;
    }

    public static GradeEe getGrade1(int grr){
        return GradeEe.getGrade2(grr);
    }
    private static GradeEe getGrade2(int grr){
        return Arrays.stream(GradeEe.values())
                .filter(p->p.predicate.test(grr))
                .findAny().orElseThrow(()-> new IllegalAccessError("틀렸다"));
    }
}

public class GradeEnum {
    static GradeEe getGrade(int gra){
        return GradeEe.getGrade1(gra);
    }

    public static void main(Scanner sc) {
        System.out.println("enter your score.");
        int scc = sc.nextInt() / 10;
        System.out.println("score & grade : "+ scc+ ", "+GradeEnum.getGrade(scc));
    }
}

