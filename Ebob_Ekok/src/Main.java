
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a, b, ebob, ekok;
        Scanner inp = new Scanner(System.in);
        System.out.print("1.Sayı: ");
        a = inp.nextInt();
        System.out.print("2.Sayı: ");
        b = inp.nextInt();
        ebob = (a > b) ? b : a;
        while (a % ebob != 0 || b % ebob != 0) {
            ebob--;
        }
        System.out.println("EBOB: " + ebob);
        System.out.println("EKOK: " + (a * b) / ebob);

    }
}
