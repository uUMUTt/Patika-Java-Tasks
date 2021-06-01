
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        recFunction(scan.nextInt());
    }

    static void recFunction(int num) {
        if(num > 0){
            System.out.print(num + " ");
            recFunction(num - 5);
        }
        System.out.print(num + " ");
    }
}
