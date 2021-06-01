
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double total, km, startPrice = 10;
        Scanner inp = new Scanner(System.in);
        System.out.print("Gidilen Mesafe(KM): ");
        km = inp.nextInt();
        total = (km * 2.20) + startPrice;
        total = total <= 20 ? 20 : total;
        System.out.println("Tutar: " +  total  + " TL");
    }

}
