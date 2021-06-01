
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int year;
        boolean isLeapYear; 
        Scanner inp = new Scanner(System.in);
        System.out.print("Yılı Giriniz: ");
        year = inp.nextInt();
         isLeapYear = (year % 100 == 0) ? (year % 400 == 0) : (year % 4 == 0);
        if(isLeapYear){
            System.out.println(year + " bir artık yıldır !");
        }else{
            System.out.println(year + " bir artık yıl değildir !");
        }
       
    }
    
}
