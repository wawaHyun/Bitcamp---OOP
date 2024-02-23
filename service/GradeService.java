package service;

import model.MemberDto;
import model.SubjectDto;

public interface GradeService {

    public int getTotalScore(SubjectDto subDto);
    public double findAverage(int total);


}
