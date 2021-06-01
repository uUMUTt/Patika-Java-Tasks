
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int km, age, type;
        double total;
        Scanner inp = new Scanner(System.in);

        System.out.print("Yolculuk mesafesi: ");
        km = inp.nextInt();

        System.out.print("Bilet türü: ");
        type = inp.nextInt();

        System.out.print("Yolcunun Yaşı: ");
        age = inp.nextInt();
        
        total = km * 0.10;
        if (km > 0 && age > 0 && (type == 1 || type == 2)) {
            if (age < 12) {
                total /= 2;
            }else if(age < 24){
                total *= 0.9;
            }else if(age >= 65){
                total *= 0.7;
            }
            if(type == 2){
                System.out.println("Tutar: " + total*1.6 + " TL");
            }else{
                System.out.println("Tutar: " + total + " TL");
            }
        } else {
            System.out.println("Hatalı Veri Girdiniz!");
        }
    }

}
