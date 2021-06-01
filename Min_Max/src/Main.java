
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n, total = 0, max, min,tmp;
        Scanner inp = new Scanner(System.in);
        System.out.print("Kaç Sayı Girilecek: ");
        n = inp.nextInt();
        System.out.print("1.Sayi: ");
        min = inp.nextInt();
        max =min;
        for (int i = 1; i < n; i++) {
            System.out.print(i + 1 + ".Sayi: ");
            tmp = inp.nextInt();
            max = (max > tmp) ? max : tmp;
            min = (min < tmp) ? min : tmp;
        }
        System.out.println("Max : " + max + " | " + "Min : " +  min);
    }
}
