package view;

//OOP의 상속예제
//this와 super
public class PhoneInheritance {
    public static void main(String[] args) {
        Phone pho = new Phone();
        pho.setCall("제임스");
        pho.setCompany("금성");

        System.out.println("*********** 집  전화 *************");
        System.out.println(pho);
        System.out.println("*********** 휴대전화 *************");

        SellPhone cp = new SellPhone();
        cp.setCompany("노키아");
        cp.setCall("Eric");
        cp.setPortale(true);
        System.out.println(cp);

        System.out.println("*********** 아이폰 *************");
        IPhone ip = new IPhone();
        ip.setCompany("apple");
        ip.setCall("Tom");
        ip.setPortale(true);
        ip.setData("전송하다");
        System.out.println(ip); //애플 아이폰으로 톰에게 데이터를 전송하다


        System.out.println("*********** 갤럭시 *************");
        Android andP = new Android();
        andP.setCompany("samsung");
        andP.setCall("제인");
        andP.setPortale(true);
        andP.setData("전송하다");
        andP.setPhoneSize("10인치");
        System.out.println(andP); //삼성 갤럭시노트으로 10인치 톰에게 데이터를 전송하다


    }
}

class Android extends IPhone{
    public static String BRAND="갤럭시노트";
    private String phoneSize;

    @Override
    public String toString() {
        return "IPhone{\n" +
                "제조사='" + company + '\'' +
                ", 브랜드= " + BRAND + '\'' +
                ", 수신자='" + call + '\'' +
                ", 폰사이즈='" + phoneSize + '\'' +
                ", 이동성portable=" + portale + '\'' +
                ", 이동유무move='" + move + '\'' +
                ", data='" + data + '\'' +
                "\n}";
    }

    public String getPhoneSize() {
        return phoneSize;
    }

    public void setPhoneSize(String phoneSize) {
        this.phoneSize = phoneSize;
    }
}


class IPhone extends SellPhone{
    protected String data;
    public static String BRAND="iPhone" ;

    @Override
    public String toString() {
        return "IPhone{\n" +
                "제조사='" + super.company + '\'' +
                ", 브랜드= " + BRAND + '\'' +
                ", 수신자='" + super.call + '\'' +
                ", 이동성portable=" + super.portale + '\'' +
                ", 이동유무move='" + super.move + '\'' +
                ", data='" + data + '\'' +
                "\n}";
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

}

class SellPhone extends Phone{
    protected boolean portale; //휴대전화의 이동성
    protected String move;

    @Override
    public String toString() {
        return "SellPhone{\n" +
                "제조사='" + super.company + '\'' +
                ", 수신자='" + super.call + '\'' +
                ", 이동성portable=" + portale + '\'' +
                ", 이동유무move='" + move + '\'' +
                "\n}";
    }




    public boolean isPortale() {
        return portale;
    }

    public void setPortale(boolean portale) {
        if(portale){
            this.setMove("phone을 휴대할수 있음");
        }else {
            this.setMove("phone을 휴대할수 없음");
        }
        this.portale = portale;
    }

    public String getMove() {
        return move;
    }

    public void setMove(String move) {
        this.move = move;
    }
}



class Phone{ //instance변수 = 멤버변수 => heap영역
    protected String company, call;
    static final double TAX_RATE = 0.0095; //static 변수 = 전역변수 => static영역
    //fianl걸면 유일한, the one이 됌


    @Override
    public String toString() {
        return "집전화Phone{\n" +
                "제조사='" + company + '\'' +
                ", 수신자='" + call + '\'' +
                "\n}";
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company+"에서 제작하다";
    }

    public String getCall() {
        return call;
    }

    public void setCall(String call) {
        this.call = call+"에게 전화를 걸다";
    }
}