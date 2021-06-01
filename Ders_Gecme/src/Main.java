
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int mat, physics, chemistry, turkish, history, music, average;
        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik Notu: ");
        mat = rangeControl(inp.nextInt());

        System.out.print("Fizik Notu: ");
        physics = rangeControl(inp.nextInt());

        System.out.print("Kimya Notu: ");
        chemistry = rangeControl(inp.nextInt());

        System.out.print("Turkçe Notu: ");
        turkish = rangeControl(inp.nextInt());

        System.out.print("Müzik Notu: ");
        music = rangeControl(inp.nextInt());;

        average = (mat + physics + chemistry + turkish + music) / 5;
        System.out.println("Ortalama = " + average);
        System.out.println(average >= 55 ? "Sınıfı gecti" : "Sınıfta kaldı");
    }

    static int rangeControl(int num) {
        return (num >= 0 && num <= 100) ? num : 0;
    }

}
