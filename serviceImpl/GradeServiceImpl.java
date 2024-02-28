package serviceImpl;

import model.SubjectDto;
import service.GradeService;
import service.UtilService;

import java.text.DecimalFormat;

public class GradeServiceImpl implements GradeService {
    private static GradeService instance = new GradeServiceImpl();
    private GradeServiceImpl(){}
    public static GradeService getInstance(){
        return instance;
    }

    @Override
    public int getTotalScore(SubjectDto subDto) {
        int total = subDto.getKorean()+subDto.getEnglish()+subDto.getMath();
        return total;
    }

    @Override
    public double findAverage(int total) {
        double avg = total/3.0;
        System.out.println(avg);
//        String avgTwo = Double.toString(avg);

//        DecimalFormat dformat = new DecimalFormat("#.##");
//        String total2 = dformat.format(total);

        return avg;
    }
}
