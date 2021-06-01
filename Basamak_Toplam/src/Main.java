
import java.util.Scanner;

public class Main {
   
 public static void main(String[] args) {
     int total = 0,num,b = 1;
     Scanner inp = new Scanner(System.in);
     System.out.println("Sayı: ");
     num = inp.nextInt();
     while(num % b != num){
         total += (num / b) % 10;
         b *= 10;
     }
     System.out.println("Basamak Toplamları: " + total);
    }
}
