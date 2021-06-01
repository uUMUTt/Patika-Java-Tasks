
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int mat, physics, chemistry, turkish, history, music, average;
        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik Notu: ");
        mat = inp.nextInt();

        System.out.print("Fizik Notu: ");
        physics = inp.nextInt();

        System.out.print("Kimya Notu: ");
        chemistry = inp.nextInt();

        System.out.print("Turkçe Notu: ");
        turkish = inp.nextInt();

        System.out.print("Tarih Notu: ");
        history = inp.nextInt();

        System.out.print("Müzik Notu: ");
        music = inp.nextInt();

        average = (mat + physics + chemistry + turkish + history + music) / 6;
        System.out.println("Ortalama = " + average);
        System.out.println(average > 60 ? "Sınıfı gecti" : "Sınıfta kaldı");
    }

}
