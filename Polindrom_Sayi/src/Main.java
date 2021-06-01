
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Sayı giriniz");
        System.out.print(isPalindrom(inp.nextInt()) ? " Polindrom sayıdır" : " Polindrom sayı değildir");
    }
    
    static boolean isPalindrom(int num){
        int tmp = num,a,b = 0;
        while(tmp != 0){
            a = tmp % 10;
            b = (b * 10) + a;
            tmp /= 10;
        }
        return b == num;
    }
}
