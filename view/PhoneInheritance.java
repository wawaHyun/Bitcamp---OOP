package view;

public class PhoneInheritance {
    public static void main() {
        Phone pho = new Phone();
        pho.setCall("James");
        pho.setCompany("gumsung");

        System.out.println("*********** home call *************");
        System.out.println(pho);
        System.out.println("*********** phone call *************");

        SellPhone cp = new SellPhone();
        cp.setCompany("Nokia");
        cp.setCall("Eric");
        cp.setPortale(true);
        System.out.println(cp);

        System.out.println("*********** i-phone *************");
        IPhone ip = new IPhone();
        ip.setCompany("apple");
        ip.setCall("Tom");
        ip.setPortale(true);
        ip.setData("to send");
        System.out.println(ip);


        System.out.println("*********** 갤럭시 *************");
        Android andP = new Android();
        andP.setCompany("samsung");
        andP.setCall("jain");
        andP.setPortale(true);
        andP.setData("to send");
        andP.setPhoneSize("10inch");
        System.out.println(andP);


    }
}

class Android extends IPhone{
    public static String BRAND="Galaxy Note";
    private String phoneSize;

    @Override
    public String toString() {
        return "IPhone{\n" +
                "maker='" + company + '\'' +
                ", brand= " + BRAND + '\'' +
                ", receiver='" + call + '\'' +
                ", phonesize='" + phoneSize + '\'' +
                ", portable=" + portale + '\'' +
                ", move='" + move + '\'' +
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
                "maker='" + super.company + '\'' +
                ", brand= " + BRAND + '\'' +
                ", receiver='" + super.call + '\'' +
                ", portable=" + super.portale + '\'' +
                ", move='" + super.move + '\'' +
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
    protected boolean portale;
    protected String move;

    @Override
    public String toString() {
        return "SellPhone{\n" +
                "maker='" + super.company + '\'' +
                ", receiver='" + super.call + '\'' +
                ", portable=" + portale + '\'' +
                ", move='" + move + '\'' +
                "\n}";
    }




    public boolean isPortale() {
        return portale;
    }

    public void setPortale(boolean portale) {
        if(portale){
            this.setMove("you can portable phone");
        }else {
            this.setMove("you can't portable phone");
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



class Phone{
    protected String company, call;
    static final double TAX_RATE = 0.0095;

    @Override
    public String toString() {
        return "home call{\n" +
                "maker='" + company + '\'' +
                ", receiver='" + call + '\'' +
                "\n}";
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = "made in "+company;
    }

    public String getCall() {
        return call;
    }

    public void setCall(String call) {
        this.call = "call the "+call;
    }
}