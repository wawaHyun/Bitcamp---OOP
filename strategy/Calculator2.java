package strategy;

import java.util.Scanner;

enum Operator2 {
    PLUS {
        @Override
        public int apply(int a, int b) {
            return a + b;
        }
    },
    MINUS {
        @Override
        public int apply(int a, int b) {
            return a - b;
        }
    },
    MULTIPLY {
        @Override
        public int apply(int a, int b) {
            return a * b;
        }
    },
    DIVIDE {
        @Override
        public int apply(int a, int b) {
            return a / b;
        }
    }
    ;

    public abstract int apply(int a, int b);

}

public class Calculator2 {
    public int calculate(int a, int b, Operator2 operator) {
        return operator.apply(a, b);
    }

    public static void main(Scanner sc) {
        while (true){
        System.out.println("Integer, Integer, Opcode");
        Calculator2 calculator = new Calculator2();
        System.out.println(calculator.calculate(
                sc.nextInt(),
                sc.nextInt(),
                Operator2.valueOf(sc.next().toUpperCase())));
    }}
}