import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int top, total = 0, cntr = 0;
        Scanner inp = new Scanner(System.in);
        System.out.print("Üst Sınır: ");
        top = inp.nextInt();
        for (int i = 0; i < top; i++) {
            if (i % 12 == 0) {
                total += i;
                cntr++;
            }
        }
        System.out.println("Ortalama(sıfır dahil): " + total / cntr);

    }
}
