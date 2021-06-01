
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a, b, c, u;
        Scanner inp = new Scanner(System.in);
        System.out.print("1.Kenar: ");
        a = inp.nextInt();
        System.out.print("2.Kenar: ");
        b = inp.nextInt();
        System.out.print("3.Kenar: ");
        c = inp.nextInt();
        u = (a + b + c) / 2;
        System.out.println("Alan = " + Math.sqrt(u * (u - a) * (u - b) * (u - c)));
    }

}
