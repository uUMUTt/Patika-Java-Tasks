
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int x = scan.nextInt();
        System.out.println(x + (isPrimeNumber(x, 2) ? " asaldır" : " asal değildir"));
    }

    static boolean isPrimeNumber(int n, int i) {
        if (n < 2) {
            return false;
        }
        if (i * 2 > n) {
            return true;
        }
        if (n % i == 0) {
            return false;
        }
        return isPrimeNumber(n, i + 1);
    }
}
