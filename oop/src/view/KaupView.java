package view;

import builder.MemberBuilder;
import model.MemberDto;
import service.KaupService;
import service.UtilService;
import serviceImpl.KaupServiceImpl;
import serviceImpl.UtilServiceImpl;

import java.lang.reflect.Member;
import java.util.Scanner;

public class KaupView {
    public static void kaupMain(Scanner sc) {

        UtilService Util = UtilServiceImpl.getInstance();
        KaupService kaupS = KaupServiceImpl.getInstance();

        System.out.println("kaup지수 조회할 이름을 입력하세요.");
        MemberDto mb = new MemberBuilder()
                .name(sc.next())
                .height(Util.createRandomInteger(150,50))
                .weight(Util.createRandomInteger(30,69))
                .build();

        String bmi = kaupS.createBmi(mb);
        String bodymass = kaupS.createBodymass(bmi);

        System.out.printf("이름 : %s\n신장 : %.2fcm\n체중 : %.2fkg\n" +
                        "BMI지수는 : %s\n판단관결과 : %s\n",
                mb.getName(),mb.getHeight(),mb.getWeight(),bmi,bodymass);


    }
}
