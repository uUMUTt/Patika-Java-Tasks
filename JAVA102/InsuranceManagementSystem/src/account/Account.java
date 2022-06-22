package account;

import address.Address;
import address.AddressManager;
import exception.InvalidAuthenticationException;
import insurance.Insurance;
import java.util.List;
import java.util.Objects;

public abstract class Account implements Comparable<Account> {

    enum AuthenticationStatus {
        SUCCESS,
        FAIL
    }

    protected User user;
    protected List<Insurance> insurances;
    AuthenticationStatus status;

    public Account(User user) {
        this.user = user;
    }

    public void login(String email, String password) throws InvalidAuthenticationException {
        if (email.equals(user.getEmail()) && password.equals(user.getPassword())) {
            status = AuthenticationStatus.SUCCESS;
        } else {
            status = AuthenticationStatus.FAIL;
            throw new InvalidAuthenticationException("Login Failed");
        }

    }

    public final void showUserInfo() {
        System.out.println("*************** USER INFO ***************");
        System.out.println("First Name : " + user.getfName());
        System.out.println("Last Name : " + user.getlName());
        System.out.println("Email : " + user.getEmail());
        System.out.println("Password : " + user.getPassword());
        System.out.println("Job : " + user.getJob());
        System.out.println("Age : " + user.getAge());
        System.out.println("Address : ");
        for (Address ad : user.getAddresses()) {
            System.out.println(ad.getAddress());
        }
        System.out.println("Last Login : " + user.getLastLogin());
    }

    public abstract void addInsurancePolicy();

    public void addAddress(Address address) {
        AddressManager.addAddress(user.getAddresses(), address);
    }

    public void removeAddress(Address address) {
        AddressManager.removeAddress(user.getAddresses(), address);
    }

    public boolean isLogin() {
        return status == AuthenticationStatus.SUCCESS;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Insurance> getInsurances() {
        return insurances;
    }

    public void setInsurances(List<Insurance> insurances) {
        this.insurances = insurances;
    }

    @Override
    public int compareTo(Account o) {
        return this.hashCode() - o.hashCode();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.user);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Account other = (Account) obj;
        return Objects.equals(this.user, other.user);
    }

}
