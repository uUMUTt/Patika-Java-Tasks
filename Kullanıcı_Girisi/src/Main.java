
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String username = "user", password = "12345", inp1, inp2;
        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı adı: ");
        inp1 = inp.nextLine();

        System.out.print("Şifre: ");
        inp2 = inp.nextLine();

        if (username.equals(inp1) && password.equals(inp2)) {
            System.out.println("Giriş Başarılı");
        } else {
            if (inp1.equals(username)) {
                String p;
                System.out.print("Sifre hatalı,şifre değiştirilsin mi ? ");
                p = inp.nextLine();
                if ("evet".equals(p)) {
                    do {
                        System.out.print("Yeni Şifre: ");
                        p = inp.nextLine();
                    } while (p.equals(password));
                }
            }
        }
    }
}
