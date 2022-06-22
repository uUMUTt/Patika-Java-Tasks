package account;
import address.Address;
import address.BusinessAddress;
import address.HomeAddress;
import exception.InvalidAuthenticationException;
import java.util.ArrayList;
import java.util.Date;
import java.util.TreeSet;


public class AccountManager {

    private final TreeSet<Account> accounts;

    public AccountManager() {
        this.accounts = new TreeSet<>();
        
        
        //TEST ADDRESSES
        Address businessAddress = new BusinessAddress("Test Bussiness Address");
        Address homeAddress = new HomeAddress("Test Home Address");
        ArrayList<Address> addresses = new ArrayList<>();
        addresses.add(homeAddress);
        addresses.add(businessAddress);

        accounts.add(new IndividualAccount(new User("user1", "user1 lname", "user1email", "12345", "job1", 25, addresses, new Date(System.currentTimeMillis()))));
        accounts.add(new IndividualAccount(new User("user2", "user2 lname", "user2email", "11241", "job2", 20, addresses, new Date(System.currentTimeMillis()))));
        accounts.add(new EnterpriseAccount(new User("user3", "user3 lname", "user3email", "44444", "job3", 45, addresses, new Date(System.currentTimeMillis()))));
        accounts.add(new EnterpriseAccount(new User("user4", "user4 lname", "user4email", "11111", "job4", 36, addresses, new Date(System.currentTimeMillis()))));
    }

    public Account login(String email, String password) {

        Account account = null;

        for (Account a : accounts) {
            if (a.getUser().getEmail().equals(email)) {
                account = a;
            }
        }

        try {
            account.login(email, password);
            account.showUserInfo();
        } catch (InvalidAuthenticationException e) {
            System.out.println(e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("The user is not founded!!!");
        }

        return account;

    }
}
