package model;

public class MemberDto {
    private int username;
    private String memberId;
    private String memberPw;
    private String name;
    private int socialNum;
    private int phoneNum;
    private String address;
    private String job;
    private double height;
    private double weight;


    public MemberDto(String memberId, String memberPw, String name, int socialNum, int phoneNum, String address, String job, double height, double weight) {
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

    @Override
    public String toString() {
        return "MemberDto{" +
                "memberId='" + memberId + '\'' +
                ", memberPw=" + memberPw +
                ", name='" + name + '\'' +
                ", socialNum=" + socialNum +
                ", phoneNum=" + phoneNum +
                ", address='" + address + '\'' +
                ", job='" + job + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMemberPw() {
        return memberPw;
    }

    public void setMemberPw(String memberPw) {
        this.memberPw = memberPw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSocialNum() {
        return socialNum;
    }

    public void setSocialNum(int socialNum) {
        this.socialNum = socialNum;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
