
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int heat;
        Scanner inp = new Scanner(System.in);
        System.out.print("Sıcaklık: ");
        heat = inp.nextInt();
        if (heat > 5) {
            if (heat < 10) {
                System.out.println("Sinama etkinliği");
            } else if (heat < 15) {
                System.out.println("Piknik ve Sinama etkinlikleri");
            } else if (heat < 25) {
                System.out.println("Piknik etkinliği");
            } else {
                System.out.println("Yüzme etkinliği");
            }
        } else {
            System.out.println("Kayak etkinliği");
        }
    }

}
