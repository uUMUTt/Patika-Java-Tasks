
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int x = scan.nextInt();
        System.out.print("Sayının Modu :");
        int y = scan.nextInt();
        System.out.println("Sonuç: " + exponentiation(x, y));
    }
    
    static int exponentiation(int x, int y){
        if(y == 0){
            return 1;
        }
        return x * exponentiation(x, y - 1);
    }
}
