package service;

import model.MemberDto;

public interface KaupService {
    public String createBmi(MemberDto mb);
    public String createBodymass(String bmi);
}