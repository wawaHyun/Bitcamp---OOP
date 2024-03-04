package service;

import model.Subject;

public interface GradeService {

    public int getTotalScore(Subject subDto);
    public double findAverage(int total);


}
