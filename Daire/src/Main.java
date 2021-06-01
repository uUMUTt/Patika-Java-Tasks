
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int r, a;
        Scanner inp = new Scanner(System.in);
        System.out.print("Yarıçap :");
        r = inp.nextInt();
        System.out.print("Daire diliminin merkez açısı :");
        a = inp.nextInt();
        System.out.println("Daire diliminin alanı: " + (Math.PI * Math.pow(r, 2)) * a / 360);
    }

}
