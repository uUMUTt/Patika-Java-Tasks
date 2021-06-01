
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n,cntr;
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz : ");
        n = inp.nextInt();

        for (int i = 2; i < n; i++) {
            cntr = 0;
            for(int j = 1 ; j <= i ; j++){
                if(i % j == 0){
                    cntr++;
                }
            }
            if(cntr == 2){
                System.out.print(i + " ");
            }
        }
    }
}
