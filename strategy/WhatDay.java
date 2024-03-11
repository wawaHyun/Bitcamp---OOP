package strategy;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Supplier;

/*
대표적인 Enum 메소드
static E values()	해당 열거체의 모든 상수를 저장한 배열을 생성하여 반환함.
static E valueOf(String name)	전달된 문자열과 일치하는 해당 열거체의 상수를 반환함.
protected void finalize()	해당 Enum 클래스가 final 메소드를 가질 수 없게 됨.
String name()	해당 열거체 상수의 이름을 반환함.
int ordinal()	해당 열거체 상수가 열거체 정의에서 정의된 순서(0부터 시작)를 반환함.
* **/
enum WhatWeek {
    SUNDAY("SUNDAY", () -> "일요일"),
    MONDAY("MONDAY", () -> "월요일"),
    TUESDAY("TUESDAY", () -> "화요일"),
    WEDNESDAY("WEDNESDAY", () -> "수요일"),
    THURSDAY("THURSDAY", () -> "목요일"),
    FRIDAY("FRIDAY", () -> "금요일"),
    SATURDAY("SATURDAY", () -> "토요일"),
    ;
    private String week;
    private Supplier<String> supplier;

    WhatWeek(String week, Supplier<String> supplier) {
        this.week = week;
        this.supplier = supplier;
    }

    private static WhatWeek getOperator(String day) {
        return Arrays.stream(values())
                .filter(o-> o.week.equals(day))
                .findFirst().orElseThrow(() -> new IllegalArgumentException("올바른 값이 아닙니다."));
    }

    public static String getKoreanDay(String week) {
        return getOperator(week).supplier.get();
    }

}

public class WhatDay {
    String getKoreanDay(String week) {
        return WhatWeek.getKoreanDay(week);
    }

    public static void main(Scanner sc) {
        System.out.println("무슨 요일");
        WhatDay w = new WhatDay();
        String s = w.getKoreanDay(sc.next());
        System.out.println(s);
    }


}
