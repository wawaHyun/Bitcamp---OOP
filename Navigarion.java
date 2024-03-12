import model.Account;
import model.Board;
import model.Product;
import strategy.StrategyMain;
import view.*;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Stream;

public enum Navigarion {
    GRADE("grade", i -> {
        try {
            GradeView.grMain(i);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return true;
    }),
    BOARD("board", i -> {
        try {
            BoardView.boMain();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return true;
    }),
    KAUP("kaup", i -> {
        try {
            KaupView.kaupMain(i);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return true;
    }),
    PHONE("phone", i -> {
        try {
            PhoneInheritance.main();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return true;
    }),
    PRODUCT("product", i -> {
        try {
            ProductView.main();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return true;
    }),
    INDEX("index", i -> {
        try {
            Index.main();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return true;
    }),
    AUTHVIEW("AuthView", i -> {
        try {
            AuthView.authMain(i);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return true;
    }),
    USERVIEW("UserView", i -> {
        try {
            UserView.userMain(i);
        } catch (Exception e) {
            System.out.println("Wrong input");
        }
        return true;
    }),
    BANK("bank", i -> {
        try {
            UserView.userMain(i);
        } catch (Exception e) {
            System.out.println("Wrong input");
        }
        return true;
    }),
    ENUM("enum", i -> {
        try {
            StrategyMain.main(i);
        } catch (Exception e) {
            System.out.println("Wrong input");
        }
        return true;
    }),
    EXIT("exit", i -> {
        System.out.println("Wrong input");
        return false;
    }),
    ;

    private final String name;
    private final Predicate<Scanner> predi;

    Navigarion(String name, Predicate<Scanner> predi) {
        this.name = name;
        this.predi = predi;
    }

    public static Boolean getNavi(Scanner sc) {
        System.out.println("0-system exit, grade, board, " +
                "kaup, 'phone' heritance, product, 6-index, " +
                "AuthView, UserView, 'bank' program, 'enum' tests");
        String scc = sc.next();
        return Stream.of(values())
                .filter(i->i.name.equals(scc))
                .findAny().orElse(EXIT).predi.test(sc);
    }
}
