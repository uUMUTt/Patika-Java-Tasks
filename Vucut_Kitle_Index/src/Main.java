
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double w, h;
        Scanner inp = new Scanner(System.in);
        System.out.print("Kilo: ");
        w = inp.nextDouble();
        System.out.print("Boy: ");
        h = inp.nextDouble();
        System.out.println("Vücut Kitle İndeksiniz: " + w / Math.pow(h/100, 2));
    }

}
