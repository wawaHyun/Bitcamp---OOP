
package service;

import model.Member;

public interface KaupService {
    public String createBmi(Member mb);
    public String createBodymass(String bmi);

}