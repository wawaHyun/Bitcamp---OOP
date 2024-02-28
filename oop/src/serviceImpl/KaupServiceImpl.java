package serviceImpl;

import model.MemberDto;
import service.KaupService;
import service.UtilService;

import java.text.DecimalFormat;

public class KaupServiceImpl implements KaupService {
    private static KaupService instance = new KaupServiceImpl();
    private KaupServiceImpl(){}

    public static KaupService getInstance(){ return instance;}

    @Override
    public String createBmi(MemberDto mmb) {
        double height =mmb.getHeight();
        double weight = mmb.getWeight();

        double bmi= weight / (height * height)*10000;

        DecimalFormat dformat = new DecimalFormat("#.##");
        String bmiTwo = dformat.format(bmi);

//        return String.valueOf(bmi);
        return bmiTwo;
    }

    @Override
    public String createBodymass(String bmi) {

        String bodymass = "";
        double bmi2 = Double.parseDouble(bmi);

        if(bmi2<18.5) {
            bodymass ="저체중";
        }else if(bmi2<22.9){
            bodymass = "정상";
        }else if(bmi2<24.9){
            bodymass = "위험제중";
        }else if(bmi2<29.9){
            bodymass = "1단계 비만";
        }else {
            bodymass = "2단계 비만";
        }

        return bodymass;
    }

}
