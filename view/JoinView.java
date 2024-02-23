package view;

import builder.MemberBuilder;
import model.MemberDto;
import serviceImpl.UtilServiceImpl;

import java.util.Scanner;

public class JoinView {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("아래 항목을 순서대로 입력하여 주세요.");


        MemberDto mbModel = new MemberBuilder()
                .memberId(sc.next())
                .memberPw(sc.nextInt())
                .name(sc.next())
                .socialNum(sc.nextInt())
                .phoneNum(sc.nextInt())
                .address(sc.next())
                .job(sc.next())
                .height(sc.nextInt())
                .weight(sc.nextInt())
                .build();

        //입력 값
        //jaja 998 jainname 00531 010555 adressUU OLdesu 180 70

        System.out.printf(mbModel.toString());

    }
}
