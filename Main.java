import java.util.*;

public class Main {
    public static Boolean mainSelect(Scanner sc){
        return Navigarion.getNavi(sc);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

while (true){
    System.out.println(Main.mainSelect(sc));
}


    }
}