
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double amount, kdvRate = 0;
        Scanner inp = new Scanner(System.in);
        System.out.print("Para Tutar: ");
        amount = inp.nextDouble();
        kdvRate = (amount > 0 && amount < 1000) ? 0.08 : 0.18;
        System.out.println("Kdv'siz Tutar: " + amount + " TL");
        System.out.println("Kdv Tutarı: " + amount * kdvRate + " TL");
        System.out.println("Kdv'li Tutar: " + amount + (amount * kdvRate) + " TL");
        System.out.println("Kdv Tutar: " + kdvRate + " TL");
    }

}
