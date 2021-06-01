
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double total = 0;
        Scanner inp = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo ? ");
        total += inp.nextDouble() * 2.14;

        System.out.print("Elma Kaç Kilo ? ");
        total += inp.nextDouble() * 3.67;

        System.out.print("Domates Kaç Kilo ? ");
        total += inp.nextDouble() * 1.11;

        System.out.print("Muz Kaç Kilo ? ");
        total += inp.nextDouble() * 0.95;

        System.out.print("Elma Kaç Kilo ? ");
        total += inp.nextDouble() * 5;

        System.out.println("Tutar: " + total + " TL");
    }

}
