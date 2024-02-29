package view;

import builder.MemberBuilder;
import builder.SubjectBuilder;
import model.MemberDto;
import model.SubjectDto;
import service.GradeService;
import service.UtilService;
import serviceImpl.GradeServiceImpl;
import serviceImpl.UtilServiceImpl;

import java.util.Scanner;

public class GradeView {
    public static void grMain(Scanner sc) {

        UtilService util = UtilServiceImpl.getInstance();
        GradeService gradeS = GradeServiceImpl.getInstance();

        System.out.println("Enter the student name.");
        MemberDto student = new MemberBuilder()
                .name(sc.next())
                .build();

        SubjectDto sb = new SubjectBuilder()
                .korean(util.createRandomInteger(0,100))
                .english(util.createRandomInteger(0,100))
                .math(util.createRandomInteger(0,100))
                .build();

        int totalscore = gradeS.getTotalScore(sb);
        double totalavg = gradeS.findAverage(totalscore);

        //dummy enter
        //80 50 90

        System.out.println("This is one student's subject score.");
        System.out.println(" ============= subject score ==============");
        System.out.printf("name : %s\nkorean score : %s\nEnglish score : %s\nMath score : %s\n"
                ,String.valueOf(student.getName()),String.valueOf(sb.getKorean()),
                String.valueOf(sb.getEnglish()),String.valueOf(sb.getMath()));
        System.out.printf("total score: %s\naverage score: %.4s\n",
                String.valueOf(totalscore),String.valueOf(totalavg));

    }
}
