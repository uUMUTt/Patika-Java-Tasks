
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num;
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı :");
        num = inp.nextInt();
        System.out.println(num + ".Fibonacci Değeri: " + fibonacci(num));
    }

    static int fibonacci(int num) {
        if (num == 1 || num == 2) {
            return 1;
        }
        return fibonacci(num - 1) + fibonacci(num - 2);
    }
}
