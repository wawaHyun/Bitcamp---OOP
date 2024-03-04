package model;
import lombok.*;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class MemberDto {
    private String memberId;
    private String memberPw;
    private String name;
    private int socialNum;
    private int phoneNum;
    private String address;
    private String job;
    private double height;
    private double weight;
}
