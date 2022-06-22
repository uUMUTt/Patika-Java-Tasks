package account;

import address.Address;
import java.util.Date;
import java.util.List;

public class User {

    private String fName;
    private String lName;
    private String email;
    private String password;
    private String job;
    private int age;
    private List<Address> addresses; //Home Address and Bussiness address
    private Date lastLogin;

    public User(String fName, String lName, String email, String password, String job, int age, List<Address> addresses, Date lastLogin) {
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.password = password;
        this.job = job;
        this.age = age;
        this.addresses = addresses;
        this.lastLogin = lastLogin;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

}
