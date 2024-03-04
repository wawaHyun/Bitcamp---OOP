package model;
import lombok.*;
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Setter
@ToString(exclude = {"memberId"})
public class Member {
    private String memberId;
    private String memberPw;
    private String name;
    private int socialNum;
    private int phoneNum;
    private String address;
    private String job;
    private double height;
    private double weight;
    @Builder(builderClassName = "builer")
    public Member(String memberId,String memberPw,String name,int socialNum, int phoneNum,String address,String job,double height,double weight){
        this.memberId = memberId;
        this.memberPw = memberPw;
        this.name = name;
        this.socialNum = socialNum;
        this.phoneNum = phoneNum;
        this.address = address;
        this.job = job;
        this.height = height;
        this.weight = weight;
    }
}
