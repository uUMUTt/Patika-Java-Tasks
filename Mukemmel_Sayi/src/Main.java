
import java.util.Scanner;

public class Main {
   
 public static void main(String[] args) {
     int num,total = 0;
     Scanner inp = new Scanner(System.in);
     System.out.print("Sayı: ");
     num = inp.nextInt();
     for (int i = 1; i < num; i++) {
         total += (num % i == 0) ? i : 0;
     }
     if(num == total){
         System.out.println(num + " Mükemmel sayıdır");
     }else{
          System.out.println(num + " Mükemmel sayı değildir");
     }
    }
}
