package strategy;

import java.util.Scanner;

enum weekOperator{
    MONDAY{
        @Override
        public String week(){return "MONDAY : study";}
    },
    TUESDAY{
        @Override
        public String week(){return "TUESDAY : study";}
    },
    WEDNESDAY{
        @Override
        public String week(){return "WEDNESDAY : study";}
    },
    THURSDAY{
        @Override
        public String week(){return "THURSDAY : study";}
    },
    FRIDAY{
        @Override
        public String week(){return "FRIDAY : study";}
    },
    SATURDAY{
        @Override
        public String week(){return "SATURDAY : study ;)";}
    },
    SUNDAY{
        @Override
        public String week(){return "SUNDAY : offday~!!!";}
    };

    public abstract String week();
}

public class Week {

    public static String weekOper(weekOperator wook) {
        return wook.week();
    }

    public static void main(Scanner sc) {
        while (true){
            System.out.println("What days for?");
            System.out.println("MONDAY, TUESDAY, WEDNESDAY, THURSDAY, " +
                    "FRIDAY, SATURDAY, SUNDAY");
            System.out.println(Week.weekOper(weekOperator.valueOf(sc.next())));
        }
    }
}
