import java.util.*;

public class Main {
    public static Boolean mainSelect(Scanner sc){
        return Navigarion.getNavi(sc);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

while (Main.mainSelect(sc)){
    System.out.println(Main.mainSelect(sc));
}


    }
}