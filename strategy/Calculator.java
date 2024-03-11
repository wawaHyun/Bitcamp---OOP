package strategy;

import java.util.Scanner;
 enum operator {
     PLUS {
         @Override
         public int apply(int a, int b) {return a + b;}
     },
     MINUS{
         @Override
         public int apply(int a, int b){return a-b;}
     },
     MULIPLY{
         @Override
         public int apply(int a, int b){return a*b;}
     },
     DIVDE{
         @Override
         public int apply(int a, int b){return a/b;}
     };

     public abstract int apply(int a, int b);
 }

public class Calculator {
    public static int calculator(int a, int b, operator sc) {
        return sc.apply(a,b);
    }

    public static void main(Scanner sc) {
//        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Integer, Integer, Opcode");
            System.out.println("PLUS, MINUS, MULIPLY, DIVDE");
            System.out.println(Calculator.calculator(sc.nextInt(), sc.nextInt(),
                    operator.valueOf(sc.next())));
        }

    }


}
