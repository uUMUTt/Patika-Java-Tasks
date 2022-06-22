
import account.Account;
import account.AccountManager;
import java.util.Scanner;

public class LoginPanel {

    public static void runLoginPanel() {
        Scanner s = new Scanner(System.in);

        AccountManager manager = new AccountManager();
        String email, password;
        System.out.println("**************** INSURANCE MANAGEMENT LOGIN PANEL ****************");
        System.out.print("Email : ");
        email = s.nextLine();
        System.out.print("Password : ");
        password = s.nextLine();
        s.close();
        Account account = manager.login(email, password);
    }
}
