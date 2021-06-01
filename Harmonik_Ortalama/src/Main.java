
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int cntr = 0;
        Scanner inp = new Scanner(System.in);
        System.out.print("Sınırı giriniz : ");
        double n = inp.nextInt();
        double result = 0;
        while (n > 0) {
            result += (1 / n);
            n--;
            cntr++;
        }

        System.out.println("Sonuç: " + cntr / result);
    }
}
