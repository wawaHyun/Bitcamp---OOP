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
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        UtilService util = UtilServiceImpl.getInstance();
        GradeService gradeS = GradeServiceImpl.getInstance();

        MemberDto student = new MemberBuilder()
                .name("jaja")
                .build();

        SubjectDto sb = new SubjectBuilder()
                .korean(util.createRandomInteger(0,100))
                .english(util.createRandomInteger(0,100))
                .math(util.createRandomInteger(0,100))
                .build();

        int totalscore = gradeS.getTotalScore(sb);
        double totalavg = gradeS.findAverage(totalscore);

        //입력값
        //80 50 90

        System.out.println("다음은 한 학생의 과목 점수이다.");
        System.out.println(" ============= 성적표 ==============");
        System.out.printf("이름 : %s\n국어점수 : %s\n영어점수 : %s\n수학점수 : %s\n"
                ,String.valueOf(student.getName()),String.valueOf(sb.getKorean()),
                String.valueOf(sb.getEnglish()),String.valueOf(sb.getMath()));
        System.out.printf("총 점수: %s\n평균 점수: %.4s\n",
                String.valueOf(totalscore),String.valueOf(totalavg));

    }
}
