import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a,b, total = 1;
        Scanner inp = new Scanner(System.in);
        System.out.print("Taban: ");
        a = inp.nextInt();
        System.out.print("Üs: ");
        b = inp.nextInt();
        for (int i = 0; i < b; i++) {
                total *= a;
        }
        System.out.println("Sonuç: " + total);

    }
}
