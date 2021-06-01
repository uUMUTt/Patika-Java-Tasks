
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n,a = 0,b = 1,tmp;
        Scanner inp = new Scanner(System.in);
        System.out.print("Serinin Sınırı : ");
        n = inp.nextInt();
        System.out.print("0 1 ");
        for (int i = 0; i < n - 2; i++) {
            tmp = b;
            b += a;
            a = tmp;
            System.out.print(b + " ");
        }
    }
}
