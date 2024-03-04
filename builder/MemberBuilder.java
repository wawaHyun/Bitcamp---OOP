package builder;

import model.MemberDto;

public class MemberBuilder {
    private String memberId;
    private String memberPw;
    private String name;
    private int socialNum;
    private int phoneNum;
    private String address;
    private String job;
    private double height;
    private double weight;

    public MemberBuilder memberId(String memberId){
        this.memberId = memberId;
        return this;
    }
    public MemberBuilder memberPw(String memberPw){
        this.memberPw = memberPw;
        return this;
    }

    public MemberBuilder name(String name){
        this.name = name;
        return this;
    }
    public MemberBuilder socialNum(int socialNum){
        this.socialNum = socialNum;
        return this;
    }
    public MemberBuilder phoneNum(int phoneNum){
        this.phoneNum = phoneNum;
        return this;
    }
    public MemberBuilder address(String address){
        this.address = address;
        return this;
    }
    public MemberBuilder job(String job){
        this.job = job;
        return this;
    }
    public MemberBuilder height(double height){
        this.height = height;
        return this;
    }
    public MemberBuilder weight(double weight){
        this.weight = weight;
        return this;
    }


    public MemberDto build(){
        return new MemberDto(memberId,memberPw,name,socialNum,phoneNum,address,job,height,weight);
    }



}
